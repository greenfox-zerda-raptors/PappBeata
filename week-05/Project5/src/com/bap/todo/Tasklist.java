package com.bap.todo;
import java.util.ArrayList;

public class Tasklist {

    ArrayList ListOFTasks = new ArrayList( );

    public void addToList (String next){
        ListOFTasks.add(next);
    }
}
