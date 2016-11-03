public class Workshop34 {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".

        int i = 0;
        String div = "";

        for (i = 0; i <= 100; i = i + 1) {

                if (i%3 == 0) {
                    div = "Fizz";
                }
                if (i%5 == 0) {
                    div = div+"Buzz";
                }
                if (div == "") {
                    System.out.println(i);
                } else {
                    System.out.println(div);
                    div = "";
                }

/*
        int i = 0;
        String div3 = "";
        String div5 = "";

        for (i = 0; i <= 100; i = i + 1) {
            if (i % 3 * i % 5 != 0) {
                System.out.println(i);
            } else {

                if (i % 3 == 0) {
                    div3 = "Fizz";
                }
                if (i % 5 == 0) {
                    div5 = "Buzz";
                }

                System.out.println(div3.concat(div5));

                div3 = "";
                div5 = "";
            }
        }*/

        }
    }
}
