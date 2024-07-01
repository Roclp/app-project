学习教程：[与界面和状态交互](https://developer.android.google.cn/courses/pathways/android-basics-compose-unit-2-pathway-3?hl=zh-cn)

### compose中的状态

   #####  可变状态
   - 使用 `mutableStateOf` 创建可变状态，允许在 Composable 函数中更新值。

   ##### 状态读取与更新
   - 通过 `getValue` 和 `setValue` 函数来读取和更新状态值。

   #####  记忆状态
   - `remember` 函数用于在 Composable 函数之间保存状态，避免重复计算。

   ##### 滚动状态
   - `rememberScrollState` 创建滚动状态，用于保存和恢复滚动位置。

   ##### 文本输入状态
   - `TextField` 组件内部维护文本状态，并通过 `onValueChange` 处理文本变化。

   #####  计算状态
   - 通过定义函数来计算派生状态，如根据输入金额计算小费。

   ##### UI 预览状态
   - 使用 `@Preview` 注解创建 Composable 函数的预览，方便开发者查看 UI 效果。

![image-20240407190917643](https://s2.loli.net/2024/04/07/1fgWA8y2kFrSnxL.png)

![image-20240407191034021](https://s2.loli.net/2024/04/07/vSczLWFi8A5dBXb.png)

![image-20240407191207105](https://s2.loli.net/2024/04/07/wOKErlPme6bY5d7.png)

<img src="https://s2.loli.net/2024/04/07/bsiH37a98SYuMtT.png" alt="image-20240407191331488" style="zoom:25%;" />



### 自定义消费状态

- 添加必要的字符串资源

![image-20240407191643682](https://s2.loli.net/2024/04/07/PDB51Ln4S3qpHgU.png)

- 添加小费百分比文本字段

![image-20240407192009865](https://s2.loli.net/2024/04/07/B9qvWKjTwyrJU5A.png)

- 设置操作按钮

  ![image-20240407192629419](https://s2.loli.net/2024/04/07/rist3L7SbFjZo51.png)

- 添加开关

  ![image-20240407192713166](https://s2.loli.net/2024/04/07/eB47owqxr8FyXMg.png)

- 支持横屏显示

  ![image-20240407192806714](https://s2.loli.net/2024/04/07/uni3kcIFN9WJ4O8.png)

- 文本字段添加前置图标

  为 `TextField` 组件添加 `leadingIcon` 参数，并使用 `Icon` 可组合项，可以实现向文本字段添加前置图标的功能。

<img src="https://s2.loli.net/2024/04/07/SzYZqwVuNQDL7kM.png" alt="image-20240407193125108" style="zoom:25%;" />





### 编写自动化测试

##### 本地测试
- 直接测试代码片段，如函数、类和属性。
- 在开发环境中执行，无需实体设备或模拟器。
- 资源消耗低，即使在资源有限的情况下也能快速运行。
![image-20240407195351334](https://s2.loli.net/2024/04/07/dj7Kkp193ychOBS.png)

![image-20240407195409058](https://s2.loli.net/2024/04/07/wHcDYb8g1xQlNXj.png)

##### 插桩测试
- Android 中的界面测试，测试依赖于 Android API 和服务的部分。
- 启动应用的全部或部分内容，模拟用户交互，验证应用响应。
- 在实体设备或模拟器上运行。
![image-20240407201445822](https://s2.loli.net/2024/04/07/DfUCKcutGA4Th5s.png)

![image-20240407200516860](https://s2.loli.net/2024/04/07/X1UhkgIoTp7Z9Wv.png)

