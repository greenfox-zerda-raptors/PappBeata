package main.java.music;

public class Violin extends StringedInstrument{

    public Violin() {
        numberOfStrings = 4;
        name = "Violin";
        sound = "Screech";
    }

    public void play(){
        System.out.printf(formatForPlay, name, numberOfStrings, sound);
    }
}
