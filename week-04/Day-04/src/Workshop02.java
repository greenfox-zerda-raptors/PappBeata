//The program randomly choses a number and then gives hints and/or goads the user for not determining it
import java.util.*;
public class Workshop02 {

    static Scanner userInput = new Scanner(System.in);
    static int maxnr;
    static int number;

    public static void main(String[] args) {

        System.out.println("xxxxxxxxxxxxxxxxxx\nGuess my number\nxxxxxxxxxxxxxxxxxx\n \nThis will be fun!\n\nBut first add the maxium number until which I should guess: (if you give 0, the program terminates\n");

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // START - Defining the maximum number for the random generator

        boolean toStep = true;

        while (toStep) {

            maxnr = checkInput();

            if (maxnr == 0) {
                System.out.println("Hasta luego!");
                toStep = false;
            } else if (maxnr == -666) {
                System.out.println("Noooo, you are kidding.\nPlease give me a positive whole number, which I can still speak out! \n");

            } else if (maxnr > 1048576) {
                System.out.println("Wow, you seem to be confident about your guessing skills, right?\nMaybe try a number of maximum 6 digits! I wanna get home today... :)\n");

            } else if (maxnr < 10) {
                System.out.println("C'mon, let's make it a bit more exciting, add one more digit!\nSo the new number is:\n");

            } else {
                toStep = false;
            }
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // END - Defining the maximum number for the random generator

        if (maxnr == 0) {

        } else {
            System.out.println("Cool, let's start to guess!\n");

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // START - Get the number to guess

            double random = Math.random();
            number = (int) (random * (maxnr - 1) + 1);

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // END - Get the number to guess

            guessProcess();
        }
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // FUNCTION - checking whether the user input is meaningful

    public static int checkInput() {
        try {
            int givenNr = userInput.nextInt();
            return givenNr;
        } catch (InputMismatchException e) {
            userInput.nextLine();
            return -666;
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // FUNCTION - define the answer to the user input to guide him further

    public static void guessProcess (){

        boolean toTheEnd = true;

        while (toTheEnd) {

            if (maxnr == 0) {
            toTheEnd = false;
            }

            int guess = checkInput();

            if (guess == 0) {
                System.out.println("Hasta luego!");
                toTheEnd = false;

            } else if (guess == -666) {
                System.out.println("Hey, I thought you got it!? What we need here is a number between zero and the maximum number given by you. Please try again! \n");

            } else if (guess > maxnr) {
                System.out.println("This is a number higher than your maximum number. We need a number less than " + maxnr + "\n");

            } else if (guess < number) {
                System.out.println("Not exactly! My number is higher actually. \nGive me a new guess is:\n");

            } else if (guess > number) {
                System.out.println("Not exactly! My number is lower actually. \nGive me a new guess is:\n");

            } else if (guess == number) {
                System.out.println("Yesssssss!\n");
                toTheEnd = false;

            } else {
                System.out.println("What the duck happened???\n");
            }
        }
    }
}
