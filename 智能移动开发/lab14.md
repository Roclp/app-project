学习教程：[通过对 DataStore 使用键来存储和访问数据](https://developer.android.google.cn/courses/pathways/android-basics-compose-unit-6-pathway-3?hl=zh-cn)

# activity3：使用 DataStore 在本地保存偏好设置
## 设置依赖项

![image-20240604152226771](https://s2.loli.net/2024/06/04/I6kxhJaYcRfUHiL.png)

## 实现用户偏好设置代码库

![image-20240604152822614](https://s2.loli.net/2024/06/04/f98ZLB423ybNOAz.png)

**写入 DataStore**

![image-20240604152415227](https://s2.loli.net/2024/06/04/ULZebfsDhC13XuY.png)

**从 DataStore 中读取**

![image-20240604152558565](https://s2.loli.net/2024/06/04/Jg5vLutiH2Mn1TA.png)

**异常处理**

![image-20240604152451222](https://s2.loli.net/2024/06/04/hawx31bKLCOoTsV.png)

## 初始化 DataStore

**`DessertReleaseApplication` 类：**

![image-20240604152904830](https://s2.loli.net/2024/06/04/YlLDrnPIyhgN8Qu.png)

**AndroidManifest.xml配置**

![image-20240604153015699](https://s2.loli.net/2024/06/04/LzEu5FmoaOl1WGY.png)

## 使用 UserPreferencesRepository

![image-20240604154130809](https://s2.loli.net/2024/06/04/hFIrERNuJLslTwY.png)

![image-20240604154007134](https://s2.loli.net/2024/06/04/7Gi3bKJOPgIehdx.png)

