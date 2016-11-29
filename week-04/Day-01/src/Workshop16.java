import java.util.*;

public class Workshop16{
    public static void main(String... args){
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7 ));
        // Fix this code fragment! It should remove every even number from the list.

        ListIterator itr = al.listIterator();

        for(;itr.hasNext();){
            Integer element = (Integer) itr.next();
            if(element % 2 == 0){
                itr.remove();
            }
        }
        System.out.println(al);
    }
}
