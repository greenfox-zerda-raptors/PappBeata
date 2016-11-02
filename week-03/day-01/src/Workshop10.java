//sorry, I have solved another misspelled problem here, like tell if j1 is between j1 squared and j2 cubed

public class Workshop10{
    public static void main(String[] args) {
        int j1 = 10;
        int j2 = 3;

        // tell if j1 is between j2 squared and j2 cubed
        if (j1==(Math.min(j1,Math.min(Math.pow(j2,2),Math.pow(j2,3))))) {
            System.out.println("Not between");
        } else {
            if (j1==(Math.max(j1,Math.max(Math.pow(j2,2),Math.pow(j2,3))))) {
                System.out.println("Not between");
            } else {
                System.out.println("Between");
            }
        }
        System.out.println();
    }
}
