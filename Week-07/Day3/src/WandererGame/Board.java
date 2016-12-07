package WandererGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Board extends JComponent implements KeyListener {

    ArrayList<GameObject> gameObjects;
    private final Hero hero;
    private final Boss boss;
    private final Monster scelet1;
    private final Monster scelet2;

    public Board() {
        //board template, zero = floor, 1 = wall - used only once to set the array of boardelement objects
        int[][] tilesArray = {
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 1, 0, 1, 1, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 1, 0, 1, 0} };

        //drawing the gameboard acc to hardcode board template as shown above
        gameObjects = new ArrayList<>();
        for (int i = 0; i < tilesArray.length; i++) {
            for (int j = 0; j < tilesArray[i].length; j++) {
                if (tilesArray[i][j]==1) {
                    gameObjects.add(new Wall(i, j));
                } else {
                    gameObjects.add(new Floor(i, j));
                }
            }
        }
        hero = new Hero(0,0);
        boss = new Boss(5,5);
        scelet1 = new Monster(3,8);
        scelet2 = new Monster(2,6);
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);

    }

    @Override
    public void paint(Graphics graphics) {
        // here you have a 720x720 canvas
        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }
        hero.draw(graphics);
        boss.draw(graphics);
        scelet1.draw(graphics);
        scelet2.draw(graphics);
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hero.posY -=1;
            paint(getGraphics());
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.posY +=1;
            paint(getGraphics());
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.posX -=1;
            paint(getGraphics());
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.posX +=1;
            paint(getGraphics());
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            paint(getGraphics());
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {}
}