package WandererGame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameObject {

    BufferedImage upImg;
    BufferedImage downImg;
    BufferedImage rightImg;
    BufferedImage leftImg;
    BufferedImage image;
    int posX, posY;
    public boolean restrictField = true;
    public String objectName;

    public String getObjectName() {
        return objectName;
    }

    public void setRestrictField(boolean restrictField) {
        this.restrictField = restrictField;
    }

    public boolean isRestrictField() {
        return restrictField;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public GameObject(String filename, int posX, int posY, String objectName) {
        this.posX = posX;
        this.posY = posY;
        this.objectName = objectName;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX * 72, posY * 72, null);
        }
    }

    public String lostGame() {
        return ("Hero is dead     Game over!");
    }

    public String wonGame() {
        return ("Congratulations! The Hero won! :)");
    }

}

