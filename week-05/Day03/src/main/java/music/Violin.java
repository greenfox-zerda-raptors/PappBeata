package main.java.music;

public class Violin extends StringedInstrument{

    public Violin() {
        numberOfStrings = 4;
    }

    public void play(){
        System.out.printf(formatForPlay, name, numberOfStrings, "screeches");
    }
}
