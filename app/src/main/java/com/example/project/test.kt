// Kotlin Compose UI部分
package com.example.project
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
// Kotlin部分，使用协程来等待Java异步方法的结果
import kotlinx.coroutines.launch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
@Composable
fun GptAnswerPreview(prompt: String, answer: String) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Prompt:",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color.Black
        )
        Text(
            text = prompt,
            modifier = Modifier.padding(top = 8.dp),
            fontSize = 16.sp,
            color = Color.Gray
        )

        Text(
            text = "Answer:",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color.Black
        )
        Text(
            text = answer,
            modifier = Modifier.padding(top = 8.dp),
            fontSize = 16.sp,
            color = Color.Blue
        )
    }
}



@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun MyComposableApp() {
    // 使用reactive的方式管理状态
    val (prompt, onPromptChange) = remember { mutableStateOf("你的提示") }
    val (answer, onAnswerChange) = remember { mutableStateOf("等待回答...") }

    // 启动协程监听输入变化
    LaunchedEffect(key1 = prompt) {
        // 当prompt发生变化时，执行异步调用
        val result = lanxin.syncVivoGptAsync(prompt)
        result.thenAccept { response ->
            onAnswerChange(response) // 更新answer状态
        }
    }

    // 使用GptAnswerPreview展示prompt和answer
    GptAnswerPreview("你是谁", answer)
}

@Composable
@Preview
fun tt() {
    MyComposableApp()
}