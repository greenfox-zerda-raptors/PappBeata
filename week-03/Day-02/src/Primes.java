public class Primes {

    public static void main(String... args){

        boolean isPrime;

        System.out.println(2);

        for (int i = 3; i < 101; i ++) {

            isPrime = false;

            for (int j = 2; j < i / 2 + 2;) {

                if (i % j == 0) {
                    break;
                }

                if (j == i / 2) {
                    isPrime = true;
                }

                j ++;

            }

            if (isPrime) {
                System.out.println(i);
            }
        }

    }
}
