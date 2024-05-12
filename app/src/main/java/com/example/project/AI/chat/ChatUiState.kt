
package com.example.project.AI.chat

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatRoute(viewModel: ChatViewModel) {
    val listState = rememberLazyListState()
    val chatMessages by viewModel.chatMessages.collectAsState()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            MessageInput(
                modifier = Modifier.fillMaxWidth(),
                viewModel = viewModel,
                onSendMessage = { inputText ->
                    viewModel.sendMessage(inputText)
                },
                currentMessage = ""
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            ChatList(
                chatMessages = chatMessages,
                listState = listState,
                modifier = Modifier.weight(1f)
            )
        }
    }
}
