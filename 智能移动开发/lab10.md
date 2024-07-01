学习教程：[适应不同的屏幕尺寸](https://developer.android.google.cn/courses/pathways/android-basics-compose-unit-4-pathway-3?hl=zh-cn)

# activity3：构建具有动态导航栏的自适应应用

## 在没有导航图的情况下更改屏幕

**在状态发生变化时更改屏幕**

![image-20240511155515766](https://s2.loli.net/2024/05/11/VaLSAbGRYC3FMsv.png)

**创建自定义返回处理程序**

![image-20240511155641628](https://s2.loli.net/2024/05/11/Gkf6UXQHSZBiI3z.png)

<img src="https://s2.loli.net/2024/05/11/yXMBkmuDgO4z3pH.png" alt="image-20240511160121941" style="zoom:25%;" /><img src="https://s2.loli.net/2024/05/11/RrUI5MfqCusmtLG.png" alt="image-20240511162202266" style="zoom:25%;" />

## 在大屏设备上运行应用

**调整模拟器大小**

![image](https://s2.loli.net/2024/05/11/H6IdvBnAbiNpr8S.png)

## 让布局适应不同屏幕的尺寸

![image-20240511160643547](https://s2.loli.net/2024/05/11/1YtICFwGPOi8V64.png)

![image-20240511160505703](https://s2.loli.net/2024/05/11/jyETX68zisQGM4f.png)

## 实现自适应导航布局

**WindowStateUtils.kt**

![image-20240511161104514](https://s2.loli.net/2024/05/11/UxrwWEXFkvqGZSh.png)

**ReplyApp.kt**

![image-20240511161146119](https://s2.loli.net/2024/05/11/zN9QIcyPLqd1kWA.png)

**ReplyHomeScreen.kt**

![image-20240511161326275](https://s2.loli.net/2024/05/11/fm7oRrlb9WEDZJ3.png)

![image-20240511161519386](https://s2.loli.net/2024/05/11/JPTEgwMtl63o9rA.png)

![image-20240511161507315](https://s2.loli.net/2024/05/11/nw9OmsrvlTXjhP6.png)

![image (1)](https://s2.loli.net/2024/05/11/wQ6lcMexPCzhrYy.png)



# activity4：构建具有自适应布局的应用

## 实现自适应内容布局

**WindowStateUtils.kt**

<img src="https://s2.loli.net/2024/05/11/evLlWpaDZosiV4w.png" alt="image-20240511160153244"/>

**ReplyApp.kt**

![image-20240511162238234](https://s2.loli.net/2024/05/11/MlBnm9iPpowJ1Or.png)

![image-20240511162305753](https://s2.loli.net/2024/05/11/RHbl9fKqiYOCcgM.png)

**ReplyHomeScreen.kt**

![image-20240511162338133](https://s2.loli.net/2024/05/11/Aowg3Dl6jNb5pS4.png)

![image-20240511162411849](https://s2.loli.net/2024/05/11/i3aoMhLgvGJ2Pjm.png)

![image-20240511162400980](https://s2.loli.net/2024/05/11/X3t6J75cqKNuCof.png)

**ReplyDetailsScreen.kt**

![image-20240511162525545](https://s2.loli.net/2024/05/11/nOSmBZ5TKXcoCzl.png)

![image-20240511162548538](https://s2.loli.net/2024/05/11/JrRKC1EAqVQStmO.png)

![image-202405111625485381](https://s2.loli.net/2024/05/11/YZ5vS7reiu3IbqL.png)

## 针对不同屏幕尺寸进行验证

![image-20240511165625811](https://s2.loli.net/2024/05/11/naqosRuIy5wZcGk.png)

![image-20240511165413942](https://s2.loli.net/2024/05/11/Dz1FTRaeiXK4MrZ.png)

![image-20240511165348497](https://s2.loli.net/2024/05/11/jpmVTEWns4kHLdy.png)

## 为自适应应用添加自动化测试

**ReplyAppTest.kt**

![image-20240511164302543](https://s2.loli.net/2024/05/11/FkAicJ1LrDCe93P.png)

![image-20240511164313031](https://s2.loli.net/2024/05/11/WX9b5w4kA63J1vZ.png)

![image-20240511164326573](https://s2.loli.net/2024/05/11/LrGHpcodgeA9vOP.png)

**ReplyAppStateRestorationTest.kt**

![image-20240511164422728](https://s2.loli.net/2024/05/11/9QMycI85ltKdvj1.png)

![image-20240511164442668](https://s2.loli.net/2024/05/11/MdJBC8LY3i6F75y.png)

![image-20240511165919293](https://s2.loli.net/2024/05/11/lTsScntMEDJ423e.png)

![image-20240511170015322](https://s2.loli.net/2024/05/11/3Haud5ZAjl9yGN8.png)
