package WandererGame;

public class Boss extends Characters {
    public Boss(int posX, int posY) {
        super("boss.png", posX, posY, "boss");
        currHP = 2 * d + d;
        maxHP = 0;
        currDP = d / 2 + d / 2;
        currSP = d + 1;
    }
}
