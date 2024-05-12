package com.example.project
import com.example.project.AI.chat.prompt1
import com.example.project.AI.chat.prompt2
import com.example.project.AI.chat.prompt3
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import org.json.JSONObject
import java.io.IOException
import java.util.*
import java.util.concurrent.TimeUnit
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

import java.util.*

object Lanxincall {

    @JvmStatic
    fun main(args: Array<String>) {
        lanxin.testgensignature("XpurLJTrKSuAGoIq","POST\n/vivogpt/completions"+"\n"+"requestId=1e344557-8e8b-43e3-a36e-94e7f36616e0\n1080389454\n1629255133\nx-ai-gateway-app-id:1080389454\nx-ai-gateway-timestamp:1629255133\nx-ai-gateway-nonce:le1qqjex")
        val ans = lanxin.syncVivoGpt("你是chatgpt吗")
        val testans = lanxin.syncVivoGptAsync("hh")
        println(ans)
        println(testans)
        lanxin.syncVivoGpt(prompt1+"你是chatgpt吗")
        lanxin.syncVivoGpt(prompt2+"你是chatgpt吗")
        lanxin.syncVivoGpt(prompt3+"你是chatgpt吗")
    }
}