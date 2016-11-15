/**
 * Created by Papp Beata Andrea on 15.11.2016.
 */
public class Bird extends Animal {

    public Bird () {
        super("Bird");
    }
    public void fly () {
        System.out.printf("The bird can fly.\n");
    }
    public void sleep (){
        System.out.printf("The bird is sleeping.\n");
        super.sleep();
    }
    public void eat (){
        System.out.printf("The bird is eating.\n");
        super.eat();
    }
    public void nightyNight(){
        super.eat();
        this.sleep();
    }
}
