package br.com.instachat.emojikeyboard.model

enum class MessageStatus {

    WAITING,
    SENT,
    DELIVERED,
    CHECKED,
    UNREAD,
    CHECKED_BY_ME,
    UNKNOWN;


    companion object {
        private val map = values().associateBy(MessageStatus::name)

        fun fromString(status: String) = map[status]
    }
}
