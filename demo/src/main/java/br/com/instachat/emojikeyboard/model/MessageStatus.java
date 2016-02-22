package br.com.instachat.emojikeyboard.model;

/**
 * Enum that holds the possible states for a message
 */
public enum MessageStatus {

    WAITING("WAITING"), SENT("SENT"), DELIVERED("DELIVERED"), CHECKED("CHECKED"), UNREAD("UNREAD"), CHECKED_BY_ME("CHECKEDBYME");

    private String mValue;

    MessageStatus(String status) {
        this.mValue = status;
    }

    public static MessageStatus fromString(String value) {
        if (value != null) {
            for (MessageStatus b : MessageStatus.values()) {
                if (value.equalsIgnoreCase(b.mValue)) {
                    return b;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if (this.mValue == null) {
            return "";
        }
        return this.mValue;
    }
}
