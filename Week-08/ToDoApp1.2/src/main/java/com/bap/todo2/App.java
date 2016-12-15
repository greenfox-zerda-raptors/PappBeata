package com.bap.todo2;

import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws SQLException {

        new Initiate();

        //read file

        char cmd = '0';
        Scanner objScan = new Scanner();
        Commands objCommands = new Commands();

        while (cmd != 'q') {

            String lastInput = objScan.Scan();

            cmd = lastInput.charAt(0);

            if (cmd == 'a') {
                objCommands.addItem(lastInput.substring(3));
                System.out.println("What priority does " + lastInput.substring(3) + " have? (1, 2 or 3)");
                int intInput = Integer.parseInt(objScan.Scan());
                if (intInput == 1 || intInput == 2 || intInput == 3) {
                    objCommands.setPrio(intInput);
                }


            } else if (cmd == 'h') {
                objCommands.help();

            } else if (cmd == 'l') {
                objCommands.listItems();

            } else if (cmd == 'c') {
                objCommands.complete(lastInput.substring(9));

            } else if (cmd == 'r') {
                objCommands.removeItem(lastInput.substring(7));

            } else {
                System.out.println("\nProgram closes.");

            }

            //output into file
        }
    }


}