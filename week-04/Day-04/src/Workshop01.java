//Create a program, that asks the user's name and then greet it!
import java.util.*;
   public class Workshop01 {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What is your name?");

            String name = userInput.nextLine();

            System.out.println("Gruezzi " + name + "! :)");
        }
    }
