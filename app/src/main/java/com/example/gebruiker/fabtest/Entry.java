package com.example.gebruiker.fabtest;

/**
 * Created by Gebruiker on 23-2-2018.
 */

public class Entry {

    private String title, content, mood;
    private String timestamp;
    private int id;

    public Entry(String title, String content, String mood) {
        this.title = title;
        this.content = content;
        this.mood = mood;
    }

    public Entry(String title, String content, String mood, String timestamp, int id) {
        this.title = title;
        this.content = content;
        this.mood = mood;
        this.timestamp = timestamp;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}