package WandererGame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GameObject {

    BufferedImage upImg;
    BufferedImage downImg;
    BufferedImage rightImg;
    BufferedImage leftImg;
    BufferedImage image;
    int posX, posY;
    public boolean restrictField = true;

    public void setRestrictField(boolean restrictField) {
        this.restrictField = restrictField;
    }

    public boolean isRestrictField() {
        return restrictField;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public GameObject(String filename, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
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

    public void Move(int xDirection, int yDirection, ArrayList<GameObject> gameObjects) {
        if (xDirection == 1) {
            this.setImage(rightImg);
            if (!gameObjects.get(posX + 1 + 10 * posY).isRestrictField() && this.posX != 9) {
                this.posX += 1;
            }
        } else if (xDirection == -1) {
            this.setImage(leftImg);
            if (!gameObjects.get(posX - 1 + 10 * posY).isRestrictField() && this.posX != 0) {
                this.posX -= 1;
            }
        } else if (yDirection == 1) {
            this.setImage(downImg);
            if (!gameObjects.get(posX + 10 * (posY + 1)).isRestrictField() && this.posY != 9) {
                this.posY += 1;
            }
        } else if (yDirection == -1) {
            this.setImage(upImg);
            if (!gameObjects.get(posX + 10 * (posY - 1)).isRestrictField() && this.posY != 0) {
                this.posY -= 1;
            }
        }
    }
}
