package com.bap.todo;

public class Scanner {

    public java.util.Scanner userInput = new java.util.Scanner(System.in);

    public String Scan() {

        Tasklist newTasklist = new Tasklist();

        String input = userInput.nextLine();
        return input;
    }

}
