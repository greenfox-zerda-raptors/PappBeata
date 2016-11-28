public class Workshop18{
    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter

        int n = 8;

        System.out.println(sumSeq(n));
    }
    public static int sumSeq(int input) {
        int i;
        for (i=input-1; i >0;i--) {
            input += i;
        }
            return (input);
        }
    }
