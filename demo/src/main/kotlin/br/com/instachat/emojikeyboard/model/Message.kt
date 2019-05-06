package br.com.instachat.emojikeyboard.model

import br.com.instachat.emojikeyboard.currentTime
import java.sql.Timestamp

data class Message(
        val content: String,
        val timestamp: Timestamp = currentTime(),
        val type: MessageType
)