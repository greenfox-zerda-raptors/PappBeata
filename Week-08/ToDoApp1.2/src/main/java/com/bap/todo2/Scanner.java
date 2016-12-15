package com.bap.todo2;

public class Scanner {

    public java.util.Scanner userInput = new java.util.Scanner(System.in);

    public String Scan() {

        com.bap.todo2.Tasklist newTasklist = new com.bap.todo2.Tasklist();

        String input = userInput.nextLine();
        return input;
    }

}
