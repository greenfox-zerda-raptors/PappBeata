package WandererGame;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Hero extends Characters {

    public Hero(int posX, int posY) {
        super("hero-down.png", posX, posY, "hero");

        currHP = 20 + 3 * d;
        maxHP = 20;
        currDP = 2 * d;
        currSP = 5 + d;

        try {
            upImg = ImageIO.read(new File("hero-up.png"));
            rightImg = ImageIO.read(new File("hero-right.png"));
            leftImg = ImageIO.read(new File("hero-left.png"));
            downImg = ImageIO.read(new File("hero-down.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}