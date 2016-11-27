public class Workshop37 {
    public static void main(String[] args) {
        // Write a program which has this output
        //# # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        // The # character should be replaceable, hence store it in a variable

        int i;
        int m;
        String baseline ;
/*
        String t = "";

        baseline = "";

        for (m = 1; m <= 7; m++) {
            baseline = baseline+ "# ";
        }

        baseline = baseline.trim();
*/

        baseline = "";

        for (m = 1; m <= 7; m++) {
            baseline = baseline+ "# ";
        }
        for (i = 1; i <= 7; i++) {
            System.out.println( ((i%2 == 0) ? " " : "") + baseline);
        }


    }
}
