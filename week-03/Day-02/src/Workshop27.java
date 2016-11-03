public class Workshop27{
    public static void main(String[] args) {
        String y = "seasons";
        int out = 6;
        // if the last and the first letter of the string
        // are the same double the variable
        // called out, if not half it

        if (y.substring(0, 1).equals(y.substring(y.length()-1, y.length()))) {
            out = out * 2;
            } else {
            out = out / 2;
        }

        System.out.println(out);
    }
}