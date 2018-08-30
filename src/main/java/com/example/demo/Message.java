package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String key;

    @SuppressWarnings("unused")
    private Message() {
    }

    public Message(String key) {
        this.key = key;
    }

    public Long getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.key);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Message) {
            Message other = (Message) obj;
            return Objects.equals(this.key, other.key);
        } else {
            return false;
        }
    }

}
