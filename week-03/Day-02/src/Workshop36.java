public class Workshop36 {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replacable, hence store it in a variable

        int i;
        int m;
        String k = "#";
        String l = "";

        //l = StringUtils.repeat(k,5);

        for (m = 1; m <= 5; m++) {
            l = l.concat(k);
        }

        for (i = 1; i <= 5; i++) {
            System.out.println(l);
        }

    }
}