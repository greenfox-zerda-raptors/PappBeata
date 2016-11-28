import java.util.Arrays;
import java.util.Collections;

public class Codewars_sortDescending {

        public static int sortDesc ( final int num){
            int i = 0;
            int len = String.valueOf(num).length();
            Integer[] list = new Integer[len];

            for (; i < len; i++) {
                list[i] = Integer.parseInt(String.valueOf(num).substring(i, i + 1));
            }
            Arrays.sort(list, Collections.reverseOrder());
            return Integer.parseInt(Arrays.toString(list).replace(", ", "").replace("[", "").replace("]", ""));
        }
    public static void main(String... args) {

        int num = 0;
        System.out.println(sortDesc(num));
    }
}