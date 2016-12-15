package com.bap.todo2;

public class Initiate {

    public Initiate() {

        System.out.println("CLI Todo application\n====================\n");
        System.out.println("Available commands:\n");
        System.out.println("list : Lists all the tasks");
//        System.out.println("l shorthand for list\n");
        System.out.println("add : Adds a new task");
//        System.out.println("a shorthand for add\n");
        System.out.println("remove : Removes a task according to its id number");
//        System.out.println("r shorthand for remove\n");
        System.out.println("complete : Completes a task according to its id number");
//        System.out.println("c shorthand for complete\n");
        System.out.println("help : Print out this list again");
//        System.out.println("h shorthand for help\n");
        System.out.println("q : quit program");
        System.out.println("\nWhat would you like to do? Type command: ");

    }
}