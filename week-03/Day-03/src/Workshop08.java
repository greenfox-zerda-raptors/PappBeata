import java.lang.reflect.Array;
import java.util.Arrays;

import static com.sun.xml.internal.bind.WhiteSpaceProcessor.replace;

public class Workshop08{
    public static void main(String[] args) {
        // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

        // Task 2: Print this two dimensional array to the output

        int [][] array2D;
        array2D = new int [4][4];
        int i = 1;


        for (i=0; i<4; i++) {
            array2D[i][i] = 1;
        }
        for (int[] row: array2D) {
            System.out.print(Arrays.toString(row).replace("," , " ").replace("[" , "").replace("]" , "")+"\n");
         }
    }
}