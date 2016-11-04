import java.util.Arrays;

public class Workshop09{
    public static void main(String[] args) {
        int[] ag = new int[] { 3, 4, 5, 6, 7 };
        // please double all the elements of the list

        int i = 0;

        for (i=0; i<5; i++){
            ag[i] *= 2;
        }

            System.out.print(Arrays.toString(ag));
    }
}