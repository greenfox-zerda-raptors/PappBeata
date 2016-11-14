// Car.java
public class Car {
    //Add somethings here to create a car and some fields

    private String color;
    private int engineSize;
    private String typeCar;
    private int kmOdometer;
    private int clicks;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getEngineSize() {
        return engineSize;
    }
    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
    public int getKmOdometer() {
        return kmOdometer;
    }
    public void setKmOdometer(int kmOdometer) {
        this.kmOdometer = kmOdometer;
    }
    public String getTypeCar() {
        return typeCar;
    }
    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public int Drive (int drove){
        kmOdometer = kmOdometer + drove;
        System.out.printf("Brrm, the " + color + " " + typeCar + " just drove around town " + drove + " clicks.\n");
        return kmOdometer;
    }

}

/*
public Car() {
        this.engineSize = 1600;
        this.color = "red";
        }
public Car(String typeCar, String color, int engineSize, int kmOdometer){
        this.typeCar=typeCar;
        this.kmOdometer=kmOdometer;
        this.engineSize=engineSize;
        this.color=color;
        }*/
