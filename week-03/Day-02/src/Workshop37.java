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
        // The # character should be replacable, hence store it in a variable

        int i;
        int m;
        String k = "#";
        String l = "";
        String t = "";

        for (m = 1; m <= 7; m++) {
            l = l.concat(k);
        }

        for (i = 1; i <= 5; i++) {
            if (i%2 == 0){
                t = " ";
            }
            System.out.println(t+l);
            t = "";
        }
    }
}