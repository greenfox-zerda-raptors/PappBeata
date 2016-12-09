package WandererGame;

public class Monster extends Characters {

    public boolean hasKey;

    public Monster(int posX, int posY, String name) {
        super("monster.png", posX, posY, name);

        currHP = 3 * d;
        maxHP = 0;
        currDP = d / 2;
        currSP = d;
    }
}
