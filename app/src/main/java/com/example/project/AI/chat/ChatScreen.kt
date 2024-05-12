package com.example.project.AI.chat

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project.R


// 假设这是一个模拟的API调用
fun syncVivoGpt(query: String): String {
    // 实际的同步逻辑
    return "response_from_vivogpt"
}



@Composable
fun ChatList(
    chatMessages: List<ChatMessage>,
    listState: LazyListState,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier,
        state = listState,
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 72.dp) // 添加内边距
    ) {
        itemsIndexed(chatMessages) { index, message ->
            ChatBubbleItem(message)
        }
    }
}

@Composable
fun ChatBubbleItem(chatMessage: ChatMessage) {
    val context = LocalContext.current
    val isUserMessage = chatMessage.isSentByCurrentUser

    Card(
        modifier = Modifier
            .padding(14.dp)
            .widthIn(),
        shape = RoundedCornerShape(
            if (isUserMessage) 0.dp else 4.dp,
            if (isUserMessage) 4.dp else 0.dp
        ),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (!isUserMessage) {
                Image(
                    painter = painterResource(id = chatMessage.senderAvatar ?: R.drawable.ic_launcher_foreground),
                    contentDescription = stringResource(if (isUserMessage) R.string.chat_label else R.string.chat_label),
                    modifier = Modifier.size(40.dp)
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    text = chatMessage.text,
                    modifier = Modifier.padding(start = if (!isUserMessage) 8.dp else 0.dp),
                    textAlign = if (isUserMessage) TextAlign.End else TextAlign.Start
                )
            }

            if (isUserMessage) {
                Image(
                    painter = painterResource(id = chatMessage.senderAvatar ?: R.drawable.ic_launcher_foreground),
                    contentDescription = stringResource(R.string.chat_label),
                    modifier = Modifier.size(40.dp).clickable { /* Handle click */ }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MessageInput(
    viewModel: ChatViewModel,
    onSendMessage: (String) -> Unit,
    currentMessage: String,
    modifier: Modifier
) {
    var userMessage by rememberSaveable { mutableStateOf(currentMessage) }

    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
        ) {
            OutlinedTextField(
                modifier = Modifier.weight(0.85f).padding(end = 8.dp),
                value = userMessage,
                onValueChange = { userMessage = it },
                label = { Text(stringResource(R.string.chat_label)) },
                keyboardActions = KeyboardActions(onSend = {
                    if (userMessage.isNotBlank()) {
                        onSendMessage(userMessage.trim())
                        userMessage = "" // 清空输入
                    }
                }),
                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.Sentences,
                    imeAction = ImeAction.Send
                ),
                singleLine = true
            )
            IconButton(
                onClick = {
                    if (userMessage.isNotBlank()) {
                        onSendMessage(userMessage.trim())
                        userMessage = "" // 清空输入
                    }
                },
                modifier = Modifier.weight(0.15f).padding(start = 8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Send,
                    contentDescription = stringResource(R.string.action_send),
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChatScreenPreview() {
    val viewModel = ChatViewModel("dfd")
    ChatRoute(viewModel)
}