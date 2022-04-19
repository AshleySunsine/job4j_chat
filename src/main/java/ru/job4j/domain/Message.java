package ru.job4j.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int roomId;
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Person sender;
    private String content;
    private Timestamp timestamp;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getChatId() {
        return roomId;
    }

    public void setChatId(int chatId) {
        this.roomId = chatId;
    }

    public Person getSenderId() {
        return sender;
    }

    public void setSenderId(String senderId) {
        this.sender = sender;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Message message = (Message) o;
        return Objects.equals(id, message.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
