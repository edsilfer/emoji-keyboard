package br.com.instachat.emojikeyboard.model;

/**
 * Enum that holds the possible types for a message
 */
public enum MessageType {

    INCOME("INCOME"), OUTGOING("OUTGOING"), NOTIFICATION("NOTIFICATION"), MESSAGE("MESSAGE");

    private String mValue;

    MessageType(String t) {
        mValue = t;
    }

    public static MessageType fromString(String value) {
        if (value != null) {
            for (MessageType b : MessageType.values()) {
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
