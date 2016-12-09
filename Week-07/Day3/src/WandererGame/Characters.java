package WandererGame;

import java.util.Random;

public class Characters extends GameObject {

    public int currHP;
    public int maxHP;
    public int currDP;
    public int currSP;
    public boolean isAlive = true;
    public boolean isFighting = false;
    Random random = new Random();
    public int d = random.nextInt(6) + 1;

    public int getCurrHP() {
        return currHP;
    }

    public void setCurrHP(int currHP) {
        this.currHP = currHP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurrDP() {
        return currDP;
    }

    public void setCurrDP(int currDP) {
        this.currDP = currDP;
    }

    public int getCurrSP() {
        return currSP;
    }

    public void setCurrSP(int currSP) {
        this.currSP = currSP;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Characters(String filename, int posX, int posY, String name) {
        super(filename, posX, posY, name);
    }

    public Characters() {
        super(null, 0, 0, "empty");
    }

    public String toString() {
        return String.format("%s (Level 1) HP: %d/%d | DP: %d | SP: %d", this.getObjectName(), this.getCurrHP(), this.getMaxHP(), this.getCurrDP(), this.getCurrSP());
    }
}


