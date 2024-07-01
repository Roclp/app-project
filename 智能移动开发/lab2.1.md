学习教程：[设置 Android Studio](https://developer.android.google.cn/courses/pathways/android-basics-compose-unit-1-pathway-2?hl=zh-cn)

1. **Jetpack Compose基础**：
   - 使用`@Composable`注解定义可组合的函数，这是Compose中的基本构建块。
   - `Modifier`是一组用于更改Composable函数外观和行为的参数。
2. **Material Design组件**：
   - `Surface`是一个基础的Material Design组件，用于创建一个具有Material Design特性的矩形区域。
   - `MaterialTheme`提供了一套主题颜色和其他Material Design相关的资源，可以在Compose UI中使用。
3. **颜色和单位**：
   - `Color`类用于定义颜色，可以是具体的颜色值（如`Color.Magenta`）或主题中定义的颜色。
   - `dp`（density-independent pixels）是Compose中定义尺寸的单位，它与屏幕密度无关，适用于不同密度的屏幕。
4. **布局和样式**：
   - `padding`是`Modifier`的一个函数，用于在组件周围添加内边距。
   - `GreetingCardTheme`是一个自定义的主题，用于定义应用的外观和风格。
5. **Activity和setContent**：
   - `ComponentActivity`是Jetpack Compose中推荐的Activity基类。
   - `setContent`是Activity中的一个函数，用于设置Activity的内容。
6. **预览功能**：
   - `@Preview`注解用于创建可预览的Composable函数实例，这对于开发时快速查看UI效果非常有用。
7. **字符串插值**：
   - 在`Text`组件中使用字符串插值（`"Hi, my name is $name!"`），这样可以将变量`name`的值嵌入到字符串中。

![image-20240317205110643](https://s2.loli.net/2024/03/17/WD5kaIyzEHPxfZ2.png)

<img src="https://s2.loli.net/2024/03/17/4i18KQ2JOksT9UA.png" alt="Screenshot_20240317_204833" style="zoom: 25%;" />

<img src="https://s2.loli.net/2024/03/17/avqPCOrWRmHn86N.png" alt="Screenshot_20240317_210923" style="zoom: 25%;" />