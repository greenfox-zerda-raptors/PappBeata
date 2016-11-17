package com.bap.todo;
import java.util.ArrayList;

public class Tasklist {

    static ArrayList ListOFTasks = new ArrayList( );

    public static ArrayList addToList (String next){
        ListOFTasks.add(next);
        return null;
    }
}
