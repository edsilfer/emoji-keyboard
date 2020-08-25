package br.com.edsilfer.emojikeyboard

import java.sql.Timestamp

/**
 * Data structure for a message object
 */
data class Message(
        val content: String,
        val timestamp: Timestamp = now(),
        val type: MessageType
) {
    companion object {
        fun income(content: String): Message = Message(type = MessageType.INCOME, content = content)
        fun outgoing(content: String): Message = Message(type = MessageType.OUTGOING, content = content)
    }
}

/**
 * Lists all possible message types
 */
enum class MessageType(val layout: Int) {
    INCOME(R.layout.rsc_chat_canvas_msg_income),
    OUTGOING(R.layout.rsc_chat_canvas_msg_outgoing);
}