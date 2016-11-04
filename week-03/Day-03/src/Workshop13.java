
public class Workshop13{
    public static void main(String[] args) {
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };
        // print the sum of all numbers in ah

        int i=0;
        int sum = 0;

        for (i=0;i<ah.length; i++) {
            sum = ah[i] + sum;
        }


        System.out.println(sum);
    }
}