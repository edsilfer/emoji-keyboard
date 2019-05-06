package br.com.instachat.emojikeyboard.model

enum class MessageType {

    INCOME,
    OUTGOING,
    NOTIFICATION,
    MESSAGE;

    companion object {
        private val map = values().associateBy(MessageType::name)

        fun fromString(status: String) = map[status]
    }
}
