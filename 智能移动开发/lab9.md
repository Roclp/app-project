学习教程：[Jetpack Compose 中的 Navigation](https://developer.android.google.cn/courses/pathways/android-basics-compose-unit-4-pathway-2?hl=zh-cn)

# activity2：使用 Compose 实现多屏幕导航

## 定义路线并创建 NavHostController

- 添加一个枚举类来定义路线

  ![image-20240505160954806](https://s2.loli.net/2024/05/05/RKMSXYJ4hr6D398.png)

- 为应用添加 NavHost

  ![image-20240505161130725](https://s2.loli.net/2024/05/05/CvjarFDbOIX347N.png)

- 在 `NavHost` 中处理路线

  ![image-202405051613393238](https://s2.loli.net/2024/05/05/EI9YoVHGgMv1xBp.png)
  
  ![image-202405051613393231](https://s2.loli.net/2024/05/05/uSACFVniM46gcXI.png)
  


## 在多个路线之间导航

- **为 StartOrderScreen添加按钮处理程序**

![image-20240505161605602](https://s2.loli.net/2024/05/05/6xtOZRKr9Gd7fAi.png)

![image-20240505161624310](https://s2.loli.net/2024/05/05/ENJSU247aqYPBhW.png)

- 为 SelectOptionScreen 添加按钮处理程序

  ![image-20240505162107706](https://s2.loli.net/2024/05/05/k8BCeHjEcyvpLQm.png)

  ![image-20240505161641270](https://s2.loli.net/2024/05/05/YOgG5qkIWPCJzbu.png)

- 为 SummaryScreen 添加按钮处理程序

  ![image-20240505162204808](https://s2.loli.net/2024/05/05/OXoUktFEmqLxwVB.png)

  ![image-20240505162222207](https://s2.loli.net/2024/05/05/saQgpZtMhoBVYWy.png)


- 导航到其他路线
                ![image-20240505161339323](https://s2.loli.net/2024/05/05/WKfqDItG8rH1buo.png)

![image-20240505161359229](https://s2.loli.net/2024/05/05/3TcoiGnL6saZODA.png)

![image-20240505161414416](https://s2.loli.net/2024/05/05/W1Rwpru6FLBqloS.png)

![image-20240505161427206](https://s2.loli.net/2024/05/05/SjbBCT2o41nv5uz.png)

- 跳转至起始屏幕

​		![image-20240505163137057](https://s2.loli.net/2024/05/05/XZcv2EW59OQGhmD.png)



## 导航到其他应用

![image-20240505163634910](https://s2.loli.net/2024/05/05/iBJCZ9uhMfDKvmR.png)

![image-20240505161427206](https://s2.loli.net/2024/05/05/SjbBCT2o41nv5uz.png)

## 让应用栏响应导航

![image-20240505163819299](https://s2.loli.net/2024/05/05/PBSapr9Kf5NiCdV.png)

![image-20240505163851972](https://s2.loli.net/2024/05/05/bnIl19F3tc7aXwA.png)

## 运行效果

​						<img src="https://s2.loli.net/2024/05/05/72DrlW48JCqQFHE.png" alt="image-20240505164030926" style="zoom: 25%;" /><img src="https://s2.loli.net/2024/05/05/vLedxiX2tyKYNaC.png" alt="image-20240505164143364" style="zoom:25%;" /><img src="https://s2.loli.net/2024/05/05/bSoMXhslVu1w6yg.png" alt="image-20240505164258016" style="zoom:25%;" />


# activity3：测试 Cupcake 应用

## 设置 Cupcake 以便运行界面测试

- **添加 `androidTest` 依赖项**

  ![image-20240505164603257](https://s2.loli.net/2024/05/05/UBzDCW4M9rmwXLG.png)

- 创建界面测试目录、导航测试类

  ![image-20240505164755643](https://s2.loli.net/2024/05/05/C6BgKTRbs1p7Ewi.png)

## 设置导航宿主

![image-20240505164930705](https://s2.loli.net/2024/05/05/lFznTGDB6qtwhfk.png)

## 编写导航测试

- **验证起始目标页面**

  ![image-20240505165450127](https://s2.loli.net/2024/05/05/lnT6PXdbcWv92Lz.png)

- 创建辅助方法

  ![image-20240505165253020](https://s2.loli.net/2024/05/05/ElgDtKPfVxkM3G7.png)

![image-20240505165108654](https://s2.loli.net/2024/05/05/dW2Gy3u7BRjXbfP.png)

- **验证 Start 屏幕没有向上按钮**

  ![image-20240505165725040](https://s2.loli.net/2024/05/05/KkFJWVjhPZeoDl2.png)

- **验证导航到 Flavor 屏幕**

  ![image-20240505165833277](https://s2.loli.net/2024/05/05/or9l6nWMmFjK4cQ.png)

- **编写更多辅助方法**

  ![image-20240505165944901](https://s2.loli.net/2024/05/05/BX8Pdrp5ZOFGTve.png)

- **扩大测试范围**

  ![image-20240505170025575](https://s2.loli.net/2024/05/05/8TGOhgiaUnD3oEf.png)

## 为Order屏幕编写测试

![image-20240505170342867](https://s2.loli.net/2024/05/05/rV1ow4QcaqiRFkE.png)

![image-20240505170438177](https://s2.loli.net/2024/05/05/ipAyZ7MRuLQBPJb.png)

![image-20240505170514782](https://s2.loli.net/2024/05/05/sQgPOczdRvArfBw.png)

![image-20240505170556450](https://s2.loli.net/2024/05/05/ZasfzGrv5lFwREb.png)
