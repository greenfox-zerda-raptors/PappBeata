package com.bap.todo;

public class Task {

    String name;
    boolean completed;
    static int count;
    int ix;

    public Task(String name) {
        this.name = name;
        count ++;
        ix = count;
    }

    public String toString(){
        return String.format("%d > %s %s", ix, toStringCompleted(), name);
    }


    public String toStringCompleted(){
        if(completed){
            return "[x]";
        }else {
            return "[ ]";
        }
    }
}

