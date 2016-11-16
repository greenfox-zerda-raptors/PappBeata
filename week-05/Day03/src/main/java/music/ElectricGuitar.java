package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        numberOfStrings = 6;
    }
    public ElectricGuitar(int numberOfStrings) {
        this.numberOfStrings =numberOfStrings;
    }

    public void play(){
        System.out.printf(formatForPlay, name, numberOfStrings, "twangs");
    }
}
