package com.example.project;

import static java.util.Base64.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.concurrent.TimeUnit;



public class lanxin {

    private static final String APP_ID = "3033949359";
    private static final String APP_KEY = "LjtLiQGwlqMxiIZN";
    private static final String URI = "/vivogpt/completions";
    private static final String DOMAIN = "api-ai.vivo.com.cn";
    private static final String METHOD = "POST";

    public static void main(String[] args) {
        syncVivoGpt(args[0]);
    }

    public static String syncVivoGpt(String prompt) {
        Map<String, String> params = new HashMap<>();
        params.put("requestId", UUID.randomUUID().toString());

        System.out.println("requestId: " + params.get("requestId"));

        Map<String, Object> data = new HashMap<>();
        data.put("prompt", prompt);
        data.put("model", "vivo-BlueLM-TB");
        data.put("sessionId", UUID.randomUUID().toString());

        Map<String, Object> extra = new HashMap<>();
        extra.put("temperature", 0.9);
        data.put("extra", extra);

        Map<String, String> headers = genSignHeaders(APP_ID, APP_KEY, METHOD, URI, params);
        headers.put("Content-Type", "application/json");

        System.out.println(data);
        System.out.println(headers);

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .build();

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonBody = objectMapper.writeValueAsString(data);
            RequestBody body = RequestBody.create(jsonBody, MediaType.get("application/json; charset=utf-8"));

            HttpUrl.Builder urlBuilder = HttpUrl.parse("https://" + DOMAIN + URI).newBuilder();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                urlBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            }
            String urlWithQuery = urlBuilder.build().toString();

            Request request = new Request.Builder()
                    .url(urlWithQuery)
                    .headers(Headers.of(headers))
                    .post(body)
                    .build();

            Response response = client.newCall(request).execute();
            String responseBody = response.body().string();
            if (response.isSuccessful()) {
                Map<String, Object> resMap = objectMapper.readValue(responseBody, Map.class);
                // System.out.println("response: " + resMap);
                @SuppressWarnings("unchecked")
                Map<String, Object> dataMap = (Map<String, Object>) resMap.get("data");
                if (dataMap != null) {
                    String content = (String) dataMap.get("content");
                    System.out.println("final content:\n" + content);
                    return content;
                }
            } else {
                System.out.println(response.code() + " " + responseBody);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "hello";
    }

    public static Map<String, String> genSignHeaders(String appId, String appKey, String method, String uri,
                                                     Map<String, String> query) {
        long timestamp = System.currentTimeMillis() / 1000;
        String nonce = genNonce();
        String canonicalQueryString = genCanonicalQueryString(query);
        // String canonicalQueryString ="";
        String signedHeadersString = "x-ai-gateway-app-id:" + appId + "\n" +
                "x-ai-gateway-timestamp:" + timestamp + "\n" +
                "x-ai-gateway-nonce:" + nonce;

//        String signingString = method + "\n" +
//                uri + "\n" +
//                canonicalQueryString + "\n" +
//                appId + "\n" +
//                timestamp + "\n" +
//                signedHeadersString;

        String signingString="POST\n/vivogpt/completions" +"\n"+
                canonicalQueryString+"\n"
                +appId + "\n"
                +timestamp + "\n" +signedHeadersString+"";

        String signature = genSignature(appKey, signingString);

        System.out.println(signingString);
        System.out.println(signature);

        Map<String, String> headers = new HashMap<>();
        headers.put("X-AI-GATEWAY-APP-ID", appId);
        headers.put("X-AI-GATEWAY-TIMESTAMP", String.valueOf(timestamp));
        headers.put("X-AI-GATEWAY-NONCE", nonce);
        headers.put("X-AI-GATEWAY-SIGNED-HEADERS", "x-ai-gateway-app-id;x-ai-gateway-timestamp;x-ai-gateway-nonce");
        headers.put("X-AI-GATEWAY-SIGNATURE", signature);

        System.out.println(headers);
        return headers;
    }

    public static String genNonce() {
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder nonce = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int index = (int) (Math.random() * chars.length());
            nonce.append(chars.charAt(index));
        }
        return nonce.toString();
    }

    public static String genCanonicalQueryString(Map<String, String> params) {
        StringBuilder queryString = new StringBuilder();
        if (!params.isEmpty()) {
            params.entrySet().stream().sorted(Map.Entry.comparingByKey())
                    .forEach(entry -> {
                        try {
                            queryString.append(URLEncoder.encode(entry.getKey(), "UTF-8")).append("=")
                                    .append(URLEncoder.encode(entry.getValue(), "UTF-8")).append("&");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
            queryString.deleteCharAt(queryString.length() - 1);
        }
        // System.out.println("fdsf:"+queryString.toString());
        return queryString.toString();
    }

    public static String genSignature(String appSecret, String signingString) {
        try {
            // 使用 HMAC-SHA256 算法生成签名
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec(appSecret.getBytes("UTF-8"), "HmacSHA256");
            mac.init(secretKeySpec);
            byte[] signatureBytes = mac.doFinal(signingString.getBytes("UTF-8"));

            // 使用 Base64 编码生成签名字符串
            return Base64.getEncoder().encodeToString(signatureBytes);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void testgensignature(String appSecret, String signingString){
        String s=genSignature(appSecret, signingString);
        System.out.println("test signature:"+s);
    }
}
