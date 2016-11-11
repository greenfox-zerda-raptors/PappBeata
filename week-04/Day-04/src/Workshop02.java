//The program randomly choses a number and then gives hints and/or goads the user for not determining it
import java.util.*;
public class Workshop02 {

    static Scanner userInput = new Scanner(System.in);
    static int maxnr;
    static int number;

    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~\nGUESS MY NUMBER\n~~~~~~~~~~~~~~~~~~~~\n \nThis will be fun!\n\nBut first add the maxium number until which I should guess: (press 0 to terminate)\n");

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // START - Defining the maximum number for the random generator

        boolean toStep = true;

        while (toStep) {

            maxnr = checkInput();

            if (maxnr == 0) {
                System.out.println("Hasta luego!");
                toStep = false;
            } else if (maxnr == -666) {
                System.out.println("Noooo, you are kidding!\nPlease give me a positive whole number, which I can still speak out! \n");

            } else if (maxnr > 1024) {
                System.out.println("Wow, you seem to be confident about your guessing skills, right?\nBut maybe try a number of maximum 3 digits! I wanna get home today... :)\n");

            } else if (maxnr < 10) {
                System.out.println("C'mon, let's make it a bit more exciting, add one more digit!\nSo the new maximum number is:\n");

            } else {
                toStep = false;
            }
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // END - Defining the maximum number for the random generator

        if (maxnr == 0) {

        } else {
            System.out.println("Cool, let's start to guess! I have found my number under " + maxnr + "\n");

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // Get the number to guess

            double random = Math.random();
            number = (int) (random * (maxnr - 1) + 1);

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // Insult list


            String[] insults = {"False!", "Not exactly!", "Almost... but not.", "Wrong","False!", "Not exactly!", "Almost... but not.", "Wrong","False!", "Not exactly!", "Almost... but not.", "Wrong","False!", "Not exactly!", "Almost... but not.", "Wrong"};


            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // Guess process

            boolean toTheEnd = true;

            int guessCounter = 0;

            while (toTheEnd) {

                guessCounter = guessCounter + 1;

                if (maxnr == 0) {
                    toTheEnd = false;
                }

                int guess = checkInput();

                if (guess == 0) {
                    System.out.println("Hasta luego!");
                    toTheEnd = false;

                } else if (guess == -666) {
                    System.out.println("Hey, I thought you got it!? What we need here is a whole number between zero and the maximum number " + maxnr + " given by you. Please try again! \n");

                } else if (guess > maxnr) {
                    System.out.println("You are still shocked by Trump, aren't you? We need a number less than the maximum " + maxnr + "\n");

                } else if (guess < number) {
                    System.out.println(insults[guessCounter] + " My number is higher actually. \nGive me a new guess:\n");

                } else if (guess > number) {
                    System.out.println(insults[guessCounter] + " Try a bit lower. \nGive me a new guess:\n");

                } else if (guess == number) {
                    System.out.println("Yesssssss, " + number + " is my number!\n");
                    toTheEnd = false;

                } else {
                    System.out.println("What the duck happened???\n");
                    toTheEnd = false;
                }
            }
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
}
