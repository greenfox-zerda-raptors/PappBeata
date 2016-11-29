import java.util.*;

public class Workshop14{
    public static void main(String... args){
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók"));
        // Add "a" to every string in al. Use an iterator!

        ListIterator itr = al.listIterator();
        for(;itr.hasNext();) {
            Object element = itr.next();
            itr.set(element + "a");

        }
        System.out.println(al);
    }
}