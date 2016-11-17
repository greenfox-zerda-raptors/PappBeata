package com.bap.todo;

public class Scanner {

    public static java.util.Scanner userInput = new java.util.Scanner(System.in);

    public static String Scan() {

        String input = userInput.nextLine();
        return input;
    }

}
