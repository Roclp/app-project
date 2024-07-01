学习教程：[从互联网获取数据](https://developer.android.google.cn/courses/pathways/android-basics-compose-unit-5-pathway-1?hl=zh-cn)

# activity5：从互联网获取数据

## 网络服务和Retrofit
**添加 Retrofit 依赖项**

![image-20240519135051073](https://s2.loli.net/2024/05/19/F1he36f9m2rsHRZ.png)

## 连接互联网

**`MarsApiService` 类和接口**

![image-20240519135335232](https://s2.loli.net/2024/05/19/AOUky6WtDNxqIF7.png)

## 添加互联网权限和异常处理

**添加互联网权限**

![image-20240519135547720](https://s2.loli.net/2024/05/19/8hxliXHCPsV7Zg5.png)

**异常处理**

![image-20240519140204595](https://s2.loli.net/2024/05/19/4HC9LMNnEmaOhoD.png)

![image-20240519140405166](https://s2.loli.net/2024/05/19/WblQcSmNij41VGa.png)

![image-20240519140405164](https://s2.loli.net/2024/05/19/l3qDn89ZL2jc5bP.png)

## 使用 kotlinx.serialization 解析 JSON 响应

**添加 kotlinx.serialization 库依赖项**

![image-20240519144155228](https://s2.loli.net/2024/05/19/VloJiRhpus92jUD.png)

**数据类 `MarsPhoto`**

![image-20240519144309457](https://s2.loli.net/2024/05/19/N4AtlM1Fjs6rwWS.png)

**更新 MarsApiService 和 MarsViewModel**

![image-20240519144852917](https://s2.loli.net/2024/05/19/YR5E4zXbkG8ropl.png)
