package WandererGame;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameObject {

    BufferedImage image;
    int posX, posY;

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

    public void Move(int xDirection, int yDirection) {
        if (xDirection == 1) {
            this.posX += 1;
        } else if (xDirection == -1) {
            this.posX -= 1;
        } else if (yDirection == 1) {
            this.posY += 1;
        }else if (yDirection == -1){
            this.posY -= 1;
        }
    }
}