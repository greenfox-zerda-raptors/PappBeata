package com.greenfox;

//@Component
public class Todo {
    // @Autowired(required = false)
    int id;
    //@Autowired(required = false)
    String title;
    // @Autowired(required = false)
    Boolean urgent;
    // @Autowired(required = false)
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
