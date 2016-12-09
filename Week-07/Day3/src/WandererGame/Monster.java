package WandererGame;

public class Monster extends Characters {

    public boolean hasKey;

    public Monster(int posX, int posY, String name) {
        super("monster.png", posX, posY, name);

        currHP = 2 * d;
        maxHP = 20;
        currDP = d / 2;
        currSP = d;
    }
}
