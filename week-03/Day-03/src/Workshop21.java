
public class Workshop21{
    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial

        System.out.println(factRecurs(4));
    }

    public static int factRecurs (int input) {
        if (input == 1){
            return 1;
        } else {
            input *= factRecurs(input -1);
            return input;
        }
    }
}