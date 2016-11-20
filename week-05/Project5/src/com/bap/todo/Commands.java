package com.bap.todo;

public class Commands {

    Tasklist ObjTasklist;


    public Commands() {
        ObjTasklist = new Tasklist();
    }

    public void addItem(String inp) {
        Task NextToDo = new Task(inp);
        ObjTasklist.add(NextToDo);
    }

    public void listItems() {

         for (Task i : ObjTasklist){

            System.out.println(i.toString());

        }
    }

    public void removeItem(String inp) {
        System.out.println("Item removed");
    }

    public void complete(String inp) {
        System.out.println("Item completed");
    }

    public void help() {
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
        System.out.println("q : quit program");
    }
}


