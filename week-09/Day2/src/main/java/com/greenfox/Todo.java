package com.greenfox;

public class Todo {
    int id;
    String title;
    Boolean urgent;
    Boolean done;

    public Todo(int id, String title, Boolean urgent, Boolean done) {
        this.id = id;
        this.title = title;
        this.urgent = urgent;
        this.done = done;
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

    public Boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
