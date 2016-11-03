public class Workshop22{
    public static void main(String... args){
        String first = "I am the first string!";
        String second = "I think I'm longer than first..";
        // Decide if "first" string is longer than "second" string and store it in a variable
        // Print the value of the variable

        String comparisonResult = "donnow";

        if (first.length() > second.length()) {
            comparisonResult = "first is longer";
        } else {
            comparisonResult = "second is longer";
        }

        System.out.println(comparisonResult);
    }
}