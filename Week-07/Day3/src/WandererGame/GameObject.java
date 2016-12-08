package WandererGame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GameObject {

    String facing = "";
    BufferedImage upImg;
    BufferedImage downImg;
    BufferedImage rightImg;
    BufferedImage leftImg;
    BufferedImage image;
    int posX, posY;
    ArrayList<String> imgNameList = new ArrayList<>();

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
        if (image != null && this.facing == "") {
            if (this.facing == "down") {
                setImage(this.downImg);
            } else if (this.facing == "up") {
                setImage(this.upImg);
            } else if (this.facing == "left") {
                setImage(this.leftImg);
            } else if (this.facing == "right") {
                setImage(rightImg);
            }
            graphics.drawImage(image, posX * 72, posY * 72, null);
        }
    }

    public void Move(int xDirection, int yDirection) {
        if (xDirection == 1) {
            if (this.posX != 9) {
                this.posX += 1;
            }
            this.facing = "right";
            this.setImage(rightImg);
        } else if (xDirection == -1) {
            if (this.posX != 0) {
                this.posX -= 1;
            }
            this.facing = "left";
            this.setImage(leftImg);
        } else if (yDirection == 1) {
            if (this.posY != 9) {
                this.posY += 1;
            }
            this.facing = "down";
            this.setImage(downImg);
        } else if (yDirection == -1) {
            if (this.posY != 0) {
                this.posY -= 1;
            }
            this.facing = "up";
            this.setImage(upImg);
        }
    }
}