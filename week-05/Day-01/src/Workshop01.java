public class Workshop01 {

    public static void main(String[] args) {

        Car myCar1 = new Car();
        Car myCar2 = new Car();
        Car myCar3 = new Car();

        myCar1.setTypeCar("Mazda");
        myCar2.setTypeCar("Ford");
        myCar3.setTypeCar("Beamer");
        myCar1.setColor("red");
        myCar2.setColor("silver");
        myCar3.setColor("green");
        myCar1.setEngineSize(1600);
        myCar2.setEngineSize(2500);
        myCar3.setEngineSize(2800);
        myCar1.setKmOdometer(12327);
        myCar2.setKmOdometer(152312);
        myCar3.setKmOdometer(42521);

        myCar1.Drive(15);

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
                myCar1.getTypeCar(), myCar1.getColor(), myCar1.getEngineSize(), myCar1.getKmOdometer());

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
                myCar2.getTypeCar(), myCar2.getColor(), myCar2.getEngineSize(), myCar2.getKmOdometer());

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
                myCar3.getTypeCar(), myCar3.getColor(), myCar3.getEngineSize(), myCar3.getKmOdometer());
    }
}
/*

    Car myCar1 = new Car("Mazda", "red", 12312, 1600);

    Car myCar2 = new Car("Ford", "silver", 152973, 2500);

    Car myCar3 = new Car("Beamer", "green", 42521, 2800);
*/
