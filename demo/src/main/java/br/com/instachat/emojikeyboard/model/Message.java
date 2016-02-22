package br.com.instachat.emojikeyboard.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * POJO Class that represents a message in the canvas
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    private String content;
    private Timestamp timestamp;
    private MessageType type;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }
}
