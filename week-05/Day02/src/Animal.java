/**
 * Created by Papp Beata Andrea on 15.11.2016.
 */
public class Animal {

    public Animal() {
        System.out.printf("An animal is created.\n");
    }
    public Animal(String type) {
        this();
        System.out.printf("A " + type + " animal is created.\n");
    }
    public void sleep () {
        System.out.printf("The animal is sleeping.\n");
    }
    public void eat (){
        System.out.printf("The animal is eating.\n");
    }
    //Add a constructor to the Animal class that takes a String type parameter and prints out that type animal is created
}
