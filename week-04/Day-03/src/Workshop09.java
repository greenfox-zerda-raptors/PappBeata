/**************************************************************************************************
 * Workshop: Practice Exceptions: I have to have it my way.  When an exception occurs, I want a
 * special error message, namely "7's are cannibals!" printed.
 *
 *
 * So, I'm looking for the following output:
 * try - first statement
 * start - myMethod
 * An Exception Occurred
 * 7's are cannibals
 * Finally I did this instead
 * ::::FINISH LINE:::: out of the try/catch/finally statement
 *
 * Refer to Workshop07
 **************************************************************************************************/
import java.util.*;

public class Workshop09{

    static void myMethod(int inNumber) throws Exception {
        System.out.println("Start - myMethod - no sevens, please!");
        if (inNumber == 7) {
            throw new EmptyStackException();
        } else {
            System.out.println("Nice number");
        }
    }
    public static void main(String  args[]) {
        System.out.println("try - first statement");
        try
        {
            myMethod(7);
        } catch (Exception ex) {
            System.out.println("An Exception Occurred\n7's are cannibals");
        } finally {
            System.out.println("Finally I realised that I need a finally block");

        }
        System.out.println("::::FINISH LINE:::: out of the try/catch/finally statement");
    }
}

