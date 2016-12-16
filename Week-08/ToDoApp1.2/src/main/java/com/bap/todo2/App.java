package com.bap.todo2;

import com.j256.ormlite.logger.LocalLog;

import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws SQLException {

        System.setProperty(LocalLog.LOCAL_LOG_LEVEL_PROPERTY, "FATAL");
        
        Commands objCommands = new Commands();

        System.out.println("Login name:\n");
        Scanner objScan = new Scanner();
        String lastInput = objScan.Scan();

        if (objCommands.userExists(lastInput)) {
            System.out.println("\nPassword:\n");
            //  if (!passwordCorrect) {
            System.out.println("\nPassword not correct, please try again!\n");
            //}
        } else {
            System.out.println("\nYou seem to be a new user, please set your password: \n");
            String pswInput = objScan.Scan();
            new Users(lastInput, pswInput);
        }
        new Initiate();

        char cmd = '0';

        while (cmd != 'q') {

            lastInput = objScan.Scan();

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
        }
    }
}