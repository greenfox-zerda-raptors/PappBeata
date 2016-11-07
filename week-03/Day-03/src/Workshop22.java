public class Workshop22{


    //........Misi solution 1 - function
    static void funPrtParam(String ...input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
    //........Misi solution 2 - function
    /*static void funPrtParam(String[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }*/

    public static void main(String... args) {
        // create a function which prints the input String parameters (can have multiple number of arguments)

        //........Misi solution 1 - call
        funPrtParam(new String[] {"a", "b", "c"});

        //........Misi solution 2 - call - specialty that it works with function version 1
         funPrtParam("a", "b", "c");
    }
   /* public static String funPrtParam(String input1, String input2) {
        return "Parameter input1: "+input1+"\n"+"Parameter input2: "+input2;
        }*/
    }
