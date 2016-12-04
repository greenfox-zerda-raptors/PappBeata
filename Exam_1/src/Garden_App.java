import com.garden.*;
public class Garden_App {

    public static void main(String[] args) {

        Garden MyGarden = new Garden();

        MyGarden.add(new Flower("yellow"));
        MyGarden.add(new Flower("blue"));
        MyGarden.add(new Tree("purple"));
        MyGarden.add(new Tree("orange"));
        
        MyGarden.showGarden();
        System.out.println("\n");

        MyGarden.water(40);
        System.out.println("\n");

        MyGarden.water(70);
        System.out.println("\n");

        MyGarden.water(600);
        System.out.println("\n");
        MyGarden.showGarden();
    }
}