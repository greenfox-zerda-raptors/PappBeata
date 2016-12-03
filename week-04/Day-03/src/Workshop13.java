/**
 * File I/O: Scan a Directory
 *
 * There are situations where you'll need to find stuff in a directory.  In this challenge, you're asking the
 * user to tell you where to look and handling the error if the user tells you something wrong.
 *
 * What we mentors want to see is a function that will list the contents (files and directories) that are
 * beneath a particular path; handle the error if it does not exist.
 *
 * PATH/FILE?
 * C:\Temppp
 * SORRY  C:\Temppp is not a directory or does not exist.
 * Bye!

 //// Or if the directory exists:
 * PATH/FILE?
 * C:\Temp
 * Tosh.txt
 * Wailer.txt
 * Cliff.txt
 *
 * Bye!

 * Note that you are writing a program that starts and then exits.  You are not doing a loop (as we've not covered
 * closing objects).
 * You are having to create a File (so there'll be a defined object as you saw in the previous Workshop).
 * Once you have created the File, you need to check if it's a directory
 * If it's a directory, then you need to set an array of files in the directory
 * Then you need a foreach
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Workshop13 {

    //Declare something here (see Workshop12)
    static String pathToList;

    public static void main(String[] args) throws IOException {

        System.out.println("PATH/FILE?");

        Scanner userInput = new Scanner(System.in);

        if (userInput.hasNextLine()){
            pathToList = userInput.nextLine();

            if(pathToList.equals("q")) {
                System.out.print("Program terminated on user request");
                System.exit(0);
            }
            printDirectoryContents(pathToList);
        }
        System.out.println("\nBye!");
    }

    private static void printDirectoryContents(String pathToList) throws IOException {
        // Implement this function
        // Open the File
        // Does it exist?
        // Is it a directory
        // If so, set an array & loop
        File myFile = new File(pathToList);

        if (myFile.isFile()) {

            try
            {
            System.out.println("The content of the file is:");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            fileReader.close();
            System.out.println(stringBuffer.toString());
            } catch (IOException e) {
                 e.printStackTrace();
            }

        } else if (myFile.isDirectory()){

            String[] fileList;
            fileList = myFile.list();

            System.out.println("The content of the directory is:");

            for(String item:fileList)
            {
                System.out.println(item);
            }
        } else {
            System.out.println("SORRY  " + pathToList + " is not a directory or a file or does not exist.");
        }
    }
}