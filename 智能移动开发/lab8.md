学习教程：[架构组件](https://developer.android.google.cn/courses/pathways/android-basics-compose-unit-4-pathway-1?hl=zh-cn)

# activity5：ViewModel 和 State

**添加ViewModel**

![image-20240427142951320](https://s2.loli.net/2024/04/27/ucftEYGLKFxHihd.png)

**构建Compose界面**

![image-20240427143252376](https://s2.loli.net/2024/04/27/9Fe6PpxankjKcNC.png)

**完善游戏规则：错误提示、submit、skip、score、10回合**

![image-20240427143649990](https://s2.loli.net/2024/04/27/aXh7CrHnqi1JdQV.png)

![image-20240427143920830](https://s2.loli.net/2024/04/27/mHehuU7cERpBwW8.png)

![image-20240427143954948](https://s2.loli.net/2024/04/27/HBjE2f8ti7sYAOp.png)

**ViewModel维持设备旋转状态数据**

![image-20240427144321578](https://s2.loli.net/2024/04/27/KlWuBhgeqQ3zTHZ.png)

# activity6：测试 ViewModel

**添加测试依赖项**

![image-20240427144803657](https://s2.loli.net/2024/04/27/p5WbqLl2SJu6c4H.png)

**测试策略**
- 成功路径
  - 测试应用的预期行为。
  - 例如，用户正确输入并得到正确响应。


- 错误路径
    - 测试应用对错误情况的响应。
    - 例如，用户错误输入，应用显示错误消息。

- 边界情况
    - 测试应用的极限条件。
    - 例如，应用启动时的初始状态，或用户完成所有操作后的状态。

![image-20240427145513138](https://s2.loli.net/2024/04/27/MGL3sgWVS1a4UvB.png)

**代码覆盖率测试**

![image-20240427145956553](https://s2.loli.net/2024/04/27/MEkO2p4G8l7KNRg.png)

**关键代码**

```kotlin
@Test
fun gameViewModel_Initialization_FirstWordLoaded() {
    val gameUiState = viewModel.uiState.value
    val unScrambledWord = getUnscrambledWord(gameUiState.currentScrambledWord)

    assertNotEquals(unScrambledWord, gameUiState.currentScrambledWord)
    assertTrue(gameUiState.currentWordCount == 1)
    assertTrue(gameUiState.score == 0)
    assertFalse(gameUiState.isGuessedWordWrong)
    assertFalse(gameUiState.isGameOver)
}

@Test
fun gameViewModel_IncorrectGuess_ErrorFlagSet() {
    val incorrectPlayerWord = "and"

    viewModel.updateUserGuess(incorrectPlayerWord)
    viewModel.checkUserGuess()

    val currentGameUiState = viewModel.uiState.value
    assertEquals(0, currentGameUiState.score)
    assertTrue(currentGameUiState.isGuessedWordWrong)
}

@Test
fun gameViewModel_CorrectWordGuessed_ScoreUpdatedAndErrorFlagUnset() {
    var currentGameUiState = viewModel.uiState.value
    val correctPlayerWord = getUnscrambledWord(currentGameUiState.currentScrambledWord)

    viewModel.updateUserGuess(correctPlayerWord)
    viewModel.checkUserGuess()
    currentGameUiState = viewModel.uiState.value

    assertFalse(currentGameUiState.isGuessedWordWrong)
    assertEquals(SCORE_AFTER_FIRST_CORRECT_ANSWER, currentGameUiState.score)
}

@Test
fun gameViewModel_WordSkipped_ScoreUnchangedAndWordCountIncreased() {
    var currentGameUiState = viewModel.uiState.value
    val correctPlayerWord = getUnscrambledWord(currentGameUiState.currentScrambledWord)

    viewModel.updateUserGuess(correctPlayerWord)
    viewModel.checkUserGuess()
    currentGameUiState = viewModel.uiState.value
    val lastWordCount = currentGameUiState.currentWordCount

    viewModel.skipWord()
    currentGameUiState = viewModel.uiState.value

    assertEquals(SCORE_AFTER_FIRST_CORRECT_ANSWER, currentGameUiState.score)
    assertEquals(lastWordCount + 1, currentGameUiState.currentWordCount)
}

@Test
fun gameViewModel_AllWordsGuessed_UiStateUpdatedCorrectly() {
    var expectedScore = 0
    var currentGameUiState = viewModel.uiState.value
    var correctPlayerWord = getUnscrambledWord(currentGameUiState.currentScrambledWord)

    repeat(MAX_NO_OF_WORDS) {
        expectedScore += SCORE_INCREASE
        viewModel.updateUserGuess(correctPlayerWord)
        viewModel.checkUserGuess()
        currentGameUiState = viewModel.uiState.value
        correctPlayerWord = getUnscrambledWord(currentGameUiState.currentScrambledWord)
        assertEquals(expectedScore, currentGameUiState.score)
    }

    assertEquals(MAX_NO_OF_WORDS, currentGameUiState.currentWordCount)
    assertTrue(currentGameUiState.isGameOver)
}
```

