public class Workshop23{
    public static void main(String... args) {
        // Create a function with the same name as PrintValues which can print integers (int) to the output
        //>PrintValues(new String[] { "first", "second", "third"});
        PrintValues(new int[] { 3, 4, 5, 6, 7});


    }
   /* public static void PrintValues(int[] values){
        for(int i=0;i<values.length;i++){
            System.out.print(values[i] + " ");
        }
    }*/
    public static void PrintValues(int[] values){
        for(int i=0;i<values.length;i++){
            System.out.print(values[i] + " ");
        }
    }
}