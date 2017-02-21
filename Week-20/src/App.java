/*https://projecteuler.net/problem=49
The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, is unusual in two ways:
(i) each of the three terms are prime, and, (ii) each of the 4-digit numbers are permutations of one another.
There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this property,
but there is one other 4-digit increasing sequence.
What 12-digit number do you form by concatenating the three terms in this sequence?*/

import java.util.ArrayList;

public class App {

    public static ArrayList<Integer> primesList = new ArrayList();
    public static int firstNumber;
    public static int secondNumber;
    public static int thirdNumber;

    public static void main(String[] args) {

        primesList = getPrimesList();

        for (int i = 0; i < primesList.size() - 2; i++) {
            for (int j = i + 1; j < primesList.size() - 1; j++) {
                firstNumber = primesList.get(i);
                secondNumber = primesList.get(j);
                thirdNumber = 2 * secondNumber - firstNumber;
                if (primesList.contains(thirdNumber) && arePermutations(firstNumber, secondNumber, thirdNumber)) {
                    System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
                }
            }
        }
    }

    private static boolean arePermutations(int a, int b, int c) {
        return getDigits(a).equals(getDigits(b)) && getDigits(b).equals(getDigits(c));
    }

    public static ArrayList<Integer> getDigits(int i) {
        ArrayList<Integer> digitsList = new ArrayList<>();
        for (int k = 0; k < 10; k++) {
            digitsList.add(0);
        }
        for (int l = 0; l < 4; l++) {
            int temp = digitsList.get(Character.getNumericValue(String.valueOf(i).charAt(l)));
            digitsList.set(Character.getNumericValue(String.valueOf(i).charAt(l)), temp + 1);
        }
        return digitsList;
    }

    public static boolean isPrime(long number) {
        for (int check = 2; check <= Math.sqrt(number); ++check) {
            if (number % check == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> getPrimesList() {
        ArrayList<Integer> primesList = new ArrayList();
        for (int i = 1009; i < 9999; i++) {
            if (isPrime(i) == true) {
                primesList.add(i);
            }
        }
        return primesList;
    }
}
