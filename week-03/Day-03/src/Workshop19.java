public class Workshop19 {
    public static void main(String[] args) {
        // create a function that returns it's input factorial

        int n = 5;
        System.out.println(funFactor(n));

    }

    public static int funFactor(int input) {
        int i;
        for (i = input - 1; i > 0; i--) {
            input *= i;
        }
        return (input);
    }
}