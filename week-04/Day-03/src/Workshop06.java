/**************************************************************************************************
 * Workshop: Practice Exceptions: Nested Try Catch - 2nd situation
 *
 * Run this and explain the what is going on
 * Explanation: we have awaited an arithmetic exception in the deepest nested try block3,
 * but what happened was an ArrayIndexOOB exception, so try block3's catch couldn't catch anything
 * so couldn't the second nested try catch.
 * Fortunately the parent try was well armed with more kinds of exception handling, so it caught the exception.
 *
 **************************************************************************************************/
import java.util.*;

public class Workshop06{
    public static void main(String[] args){
        //main try-block
        try{
            //try-block2
            try{
                //try-block3
                try{
                    int arr[]= {1,2,3,4};
            	/* I'm trying to display the value of
            	 * an element which doesn't exist. The
            	 * code should throw an exception
            	 */
                    System.out.println(arr[10]);
                }catch(ArithmeticException e){
                    System.out.print("Arithmetic Exception");
                    System.out.println(" handled in try-block3");
                }
            }
            catch(ArithmeticException e){
                System.out.print("Arithmetic Exception");
                System.out.println(" handled in try-block2");
            }
        }
        catch(ArithmeticException e3){
            System.out.print("Arithmetic Exception");
            System.out.println(" handled in main try-block");
        }
        catch(ArrayIndexOutOfBoundsException e4){
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" handled in main try-block");
        }
        catch(Exception e5){
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }

}