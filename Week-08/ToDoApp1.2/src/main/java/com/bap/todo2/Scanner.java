package com.bap.todo2;

public class Scanner {

    public java.util.Scanner userInput = new java.util.Scanner(System.in);

    public String Scan() {

         String input = userInput.nextLine();
        return input;
    }

}
