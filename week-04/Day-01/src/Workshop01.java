import java.util.*;

public class Workshop01{
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        // Add multiple elements to the list and print the number of the elements

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        int arrayListSize = arrayList.size();

        System.out.println(arrayListSize);
    }
}