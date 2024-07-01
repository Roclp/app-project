学习教程：[从互联网加载和显示图片](https://developer.android.google.cn/courses/pathways/android-basics-compose-unit-5-pathway-2?hl=zh-cn)

# activity2：添加仓库和手动依赖项注入

## 创建数据层
![image-20240525142251091](https://s2.loli.net/2024/05/25/a1lN6dTk7YqpJCb.png)

## 依赖项注入

![image-20240525142521332](https://s2.loli.net/2024/05/25/ETUvZcOCyFsNaXm.png)

![image-20240525142642685](https://s2.loli.net/2024/05/25/SYfymcuklGCZAQU.png)

## 将应用添加到容器

![image-20240525142757220](https://s2.loli.net/2024/05/25/KTDZ16z9fHYw5nP.png)

![image-20240525142917640](https://s2.loli.net/2024/05/25/AUTuikdNbtVfDws.png)

## 将仓库添加到ViewModel

![image-20240525143137713](https://s2.loli.net/2024/05/25/THrCVMF8wzdkSGe.png)

![image-20240525143255001](https://s2.loli.net/2024/05/25/bvfLx1dF7oiSlKJ.png)

## 设置本地测试

![image-20240525143351533](https://s2.loli.net/2024/05/25/5h6MnXuKxZDSsRw.png)

## 为测试创建虚构数据和依赖项

![image-20240525143558416](https://s2.loli.net/2024/05/25/6j5UzALbFetWfcR.png)

![image-20240525143655137](https://s2.loli.net/2024/05/25/dFQ8jEwzmArxZOe.png)

## 编写仓库测试

**测试协程**

![image-20240525144911992](https://s2.loli.net/2024/05/25/FoZueUDYtRNG1Ek.png)

## 编写 ViewModel 测试

**创建测试调度程序**

![image-20240525144936660](https://s2.loli.net/2024/05/25/pjSxwgorAhlCe7F.png)

## 运行效果

![image-20240525150144144](https://s2.loli.net/2024/05/25/ZzAyocjqCTwBhv4.png)



# activity3：从互联网加载和显示图片

## 显示下载图片

**添加Coil依赖项**

![image-20240525150528962](https://s2.loli.net/2024/05/25/KH8FWluShwrTqQ7.png)

**显示图片网址**

![image-20240525152934931](https://s2.loli.net/2024/05/25/CqI1hVmyPnw4vcK.png)

**添加 `AsyncImage` 可组合项**

![image-20240525153145205](https://s2.loli.net/2024/05/25/uIqHmVSkAe5KdcE.png)

![image-20240525153159782](https://s2.loli.net/2024/05/25/6xyuE9U1trNCRkY.png)

## 使用 LazyVerticalGrid 显示图片网格

![image-20240525160603435](https://s2.loli.net/2024/05/25/YCAylsNKicWIpPv.png)

![image-20240525153159785](https://s2.loli.net/2024/05/25/I2qBzuDHQbTK9ld.png)

![image-20240525160954811](https://s2.loli.net/2024/05/25/6zWvytLo8fbH7hI.png)

## 添加重试操作

![image-20240525161159446](https://s2.loli.net/2024/05/25/LwsGScJElRQ3Dox.png)

![image-20240525161305046](https://s2.loli.net/2024/05/25/aLyOoRwqHIXnFZ8.png)

## 更新ViewModel测试

![image-20240525161357894](https://s2.loli.net/2024/05/25/yozl65YDEBWF13K.png)