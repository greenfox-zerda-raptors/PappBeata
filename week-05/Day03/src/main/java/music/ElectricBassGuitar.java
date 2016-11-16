package main.java.music;

public class ElectricBassGuitar extends StringedInstrument {

    public ElectricBassGuitar() {
        numberOfStrings = 4;
    }
    public ElectricBassGuitar(int numberOfStrings) {
        this.numberOfStrings =numberOfStrings;
    }

    public void play(){

        System.out.printf(formatForPlay, name, numberOfStrings, "duum-duum-duums");
    }
}
