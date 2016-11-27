public class Workshop36 {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replaceable, hence store it in a variable

        int i;
        int m;
        String k = "#";
        String l = "";

        for (m = 1; m <= 4; m++) {
            l = l+k+" ";
        }

        l = l+k;

        for (i = 1; i <= 5; i++) {
            System.out.println(l);
        }
    }
}