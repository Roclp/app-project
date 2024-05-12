package com.example.project.AI.chat

import androidx.lifecycle.ViewModel
import com.example.project.R
import com.example.project.lanxin
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ChatViewModel(private val prompt: String) : ViewModel() {
    private val _chatMessages = MutableStateFlow<List<ChatMessage>>(emptyList())
    val chatMessages: StateFlow<List<ChatMessage>> = _chatMessages.asStateFlow()

    fun sendMessage(userInput: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val newMessageId = (_chatMessages.value.maxByOrNull { it.id }?.id ?: 0) + 1
            val newMessage = ChatMessage(
                id = newMessageId,
                text = userInput,
                isSentByCurrentUser = true,
                senderAvatar = R.drawable.sushi // 用户头像资源ID
            )
            _chatMessages.value = _chatMessages.value + newMessage

            // 模拟网络延迟
            // delay(1000)

            // 使用prompt和userInput组合的字符串调用syncVivoGpt
            val response = lanxin.syncVivoGpt("$prompt $userInput")

            val responseMessage = ChatMessage(
                id = newMessageId + 1,
                text = response,
                isSentByCurrentUser = false,
                senderAvatar = R.drawable.ic_launcher_foreground // 机器人头像资源ID
            )
            _chatMessages.value = _chatMessages.value + responseMessage
        }
    }
}