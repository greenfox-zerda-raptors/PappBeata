public class Workshop35 {
    public static void main(String[] args) {
        // Write a program which has this output
        // 1******
        // 12*****
        // 123****
        // 1234***
        // 12345**
        // 123456*
        // 1234567

        int i;
        int m;
        String k = "*";
        String l = "";

        for (i = 1; i <= 7; i++) {
            l = l.concat(String.valueOf(i));
            for (m = 1; m <= 6-i; m++) {
                k = k.concat(k);
            }
            k = "*";
            System.out.println(l.concat(k));
        }
    }
}