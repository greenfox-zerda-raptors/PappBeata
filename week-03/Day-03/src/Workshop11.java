import java.util.Arrays;

public class Workshop11{
    public static void main(String[] args) {
        String[] ah = new String[] {"kuty", "macsk", "cic" };
        // add to all elements an 'a' on the end

        int i;

        for (i=0; i<3; i++) {
            ah[i] = ah[i] + 'a';
        }

        System.out.print(Arrays.toString(ah));
    }
}
