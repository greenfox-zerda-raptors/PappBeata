package main.java.music;

public class ElectricBassGuitar extends StringedInstrument {

    public ElectricBassGuitar() {
        numberOfStrings = 4;
        name = "ElectricBassGuitar";
        sound = "Duum-duum-duum";
    }
    public ElectricBassGuitar(int numberOfStrings) {
        this.numberOfStrings =numberOfStrings;
    }

    public void play(){

        System.out.printf(formatForPlay, name, numberOfStrings, sound);
    }
}
