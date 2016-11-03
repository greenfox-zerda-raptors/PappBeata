public class Workshop26{
    public static void main(String[] args) {
        String x = "cheese";
        // Tell if the x has even or odd number of
        // characters with a True for even and
        // false False output otherwise
        Boolean Even = true;

        if (x.length()%2 == 0) {
            Even = true;
        } else {
            Even = false;
        }

        System.out.println(Even);

    }
}