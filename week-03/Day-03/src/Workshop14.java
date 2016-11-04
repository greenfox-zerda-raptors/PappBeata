public class Workshop14{
    public static void main(String[] args) {
        // Reverse the order of ah
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };
        int i = 0;
        int swap = 0;

        for (i = 0; i <= ah.length / 2; i++) {
            swap = ah[i];
            ah[i] = ah[ah.length - i-1];
            ah[ah.length - i-1] = swap;
        }
        i = 0;
        for (i = 0; i < 5; i++) {
            System.out.print(ah[i]);
        }
    }
}