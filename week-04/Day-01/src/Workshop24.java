import java.util.*;

public class Workshop24{

    public static void main(String... args){

        // Create a simple calculator application which does read the parameters from the prompt and prints the result to the prompt. It should support the following operations: +, -, *, /, % and it should support two operands. The format of the expressions must be: {operation} {operand} {operand}. Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)
        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        System.out.println("Please type in the expression: ");
        System.out.println("Example: * 4 4\n");
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();

        System.out.println("The result is: " + Calculate(input));
    }

    public static double Calculate(String input) {

        String[] array = input.split("\\s+");

        char operand;
        int a;
        int b;
        double result = 0;

        operand = array[0].charAt(0);
        a = Integer.parseInt(array[1]);
        b = Integer.parseInt(array[2]);

        if (operand == '+'){
            result = a + b;
        } else if (operand == '-'){
            result = a - b;
        } else if (operand == '*'){
        result = a * b;
        } else if (operand == '/'){
            result = a / b;
        } else if (operand == '%') {
            result = a % b;
        } else {
            System.out.println("Operation not supported.");
        }
        return result;
    }
}