学习教程：[构建基本布局](https://developer.android.google.cn/courses/pathways/android-basics-compose-unit-1-pathway-3?hl=zh-cn)

### Jetpack Compose 简介

- **声明式 UI**: Compose 使用声明式语法，让 UI 的构建和管理变得更加直观和易于理解。
- **组件化**: UI 被构建为可重用的 Composable 函数，每个函数代表一个 UI 部分。
- **状态管理**: Compose 提供了简单的状态管理解决方案，如 `remember` 和 `derivedStateOf`。
- **布局和绘制**: 提供了一系列的布局和绘制组件，如 `Column`, `Row`, `Box`, `Canvas` 等。
- **与现有 View 系统兼容**: 允许与传统的 View 系统互操作，使得迁移过程平滑。

### 设计生日贺卡

- **主题和样式**: 使用 `MaterialTheme` 或自定义主题来定义应用的颜色、字体和其他样式。
- **图像资源**: 通过 `Image` 组件加载和显示图片资源，如气球、礼物等贺卡元素。
- **文本组件**: 使用 `Text` 组件来显示祝福语和其他文本内容。
- **布局**: 利用 `Column`, `Row` 等布局组件来组织 UI 元素的位置和层次结构。
- **交互**: 可以添加按钮、输入框等交互组件，使贺卡应用更加动态和互动。

### 使用文本可组合项构建简单的应用

- **@Composable 函数**: 定义 UI 的基本构建块，使用 `@Composable` 注解。
- **Modifier**: 用于调整 Composable 函数的布局和绘制参数，如 `padding`, `margin`, `fillMaxSize` 等。
- **文本样式**: 通过 `style` 参数或 `MaterialTheme.typography` 来设置文本的样式和大小。
- **字符串插值**: 在 `Text` 组件中使用字符串插值来动态显示变量或表达式的值。

### 向 Android 应用添加图片

- **Image 组件**: 使用 `Image` 组件来加载和显示图片，可以是资源文件或网络图片。
- **画家 (Painter)**: 通过 `painter` 属性传递图片资源，使用 `rememberImagePainter` 来记住图片资源。
- **内容描述**: 使用 `contentDescription` 为图片提供可访问性描述。
- **图片资源管理**: 将图片资源放在正确的资源文件夹中，并确保使用正确的引用路径。



### 1. `@Composable` 函数示例

```
@Composable
fun Greeting(name: String) {
    Text(text = "Hello, $name!")
}
```

### 2. `Modifier` 示例

```
@Composable
fun PaddedText() {
    Text(
        text = "I have padding!",
        modifier = Modifier.padding(16.dp)
    )
}
```

### 3. 文本样式示例

```
@Composable
fun StyledText() {
    Text(
        text = "I am styled!",
        style = MaterialTheme.typography.h6
    )
}
```

### 4. 字符串插值示例

```
复制@Composable
fun GreetingWithInterpolation(name: String, age: Int) {
    Text(text = "Hello, $name! You are $age years old.")
}
```

![image-20240317214815586](https://s2.loli.net/2024/03/17/Lut71ZqMevbxWOh.png)

![image-20240317215054809](https://s2.loli.net/2024/03/17/V5WuLqlE27cpaXk.png)

![image-20240317215530313](https://s2.loli.net/2024/03/17/s9M2gteOwKUmoyZ.png)

![image-20240317215339740](https://s2.loli.net/2024/03/17/OsNT8KWc2kLmBw7.png)