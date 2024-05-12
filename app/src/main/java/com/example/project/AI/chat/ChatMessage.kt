
package com.example.project.AI.chat

import java.util.UUID

data class ChatMessage(
    val id: Int,
    val text: String,
    val isSentByCurrentUser: Boolean = false,
    val senderAvatar: Int? = null
)