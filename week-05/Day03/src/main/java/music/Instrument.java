package main.java.music;

public abstract class Instrument {

    protected String name = getClass().getSimpleName();

    public abstract void play();
}
