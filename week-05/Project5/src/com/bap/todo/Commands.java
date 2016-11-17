package com.bap.todo;

/**
 * Created by Papp Beata Andrea on 17.11.2016.
 */
public class Commands {

    public static void addItem(String inp) {
        Task nextToDo = new Task(inp);
        Tasklist.addToList(inp); //ezt majd az objectre valtoztatni
    }

    public static void listItems() {
        System.out.println("Items listed");
    }

    public static void removeItem(String inp) {
        System.out.println("Item removed");
    }

    public static void complete(String inp) {
        System.out.println("Item completed");
    }

    public static void help() {
        System.out.println("Available commands:\n");
        System.out.println("list : Lists all the tasks");
//        System.out.println("l shorthand for list\n");
        System.out.println("add : Adds a new task");
//        System.out.println("a shorthand for add\n");
        System.out.println("remove : Removes a task");
//        System.out.println("r shorthand for remove\n");
        System.out.println("complete : Completes a task");
//        System.out.println("c shorthand for complete\n");
        System.out.println("help : Print out this list again");
    }
}


