package WandererGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Board extends JComponent implements KeyListener {

    public ArrayList<GameObject> gameObjects = new ArrayList<>();
    public ArrayList<Characters> enemyObjects = new ArrayList<>();
    private final Hero hero;
    private final Boss boss;
    private final Monster skelet1;
    private final Monster skelet2;
    private final Monster skelet3;
    public int level = 1;

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
                {0, 0, 0, 1, 0, 1, 1, 0, 1, 0}};

        //drawing the gameboard acc to hardcode board template as shown above
        for (int i = 0; i < tilesArray.length; i++) {
            for (int j = 0; j < tilesArray[i].length; j++) {
                if (tilesArray[i][j] == 1) {
                    gameObjects.add(new Wall(j, i));
                    gameObjects.get(gameObjects.size() - 1).setRestrictField(true);
                } else {
                    gameObjects.add(new Floor(j, i));
                    gameObjects.get(gameObjects.size() - 1).setRestrictField(false);
                }
            }
        }
        boss = new Boss(5, 5);
        enemyObjects.add(boss);
        skelet1 = new Monster(7, 8, "skelet1");
        enemyObjects.add(skelet1);
        skelet2 = new Monster(2, 6, "skelet2");
        enemyObjects.add(skelet2);
        skelet3 = new Monster(8, 3, "skelet3");
        enemyObjects.add(skelet3);
        hero = new Hero(0, 0);
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 900));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {

        graphics.setColor(Color.lightGray);
        graphics.fillRect(0, 0, 720, 900);

        if (hero.isAlive) {


            // here you have a 720x720 canvas
            for (GameObject gameObject : gameObjects) {
                graphics.setFont(new Font("TimesRoman", Font.PLAIN, 18));
                gameObject.draw(graphics);
            }

            graphics.setColor(Color.BLACK);

            if (skelet1.isAlive) {
                skelet1.draw(graphics);
                if (skelet1.isFighting) {
                    graphics.drawString(skelet1.toString(), 220, 790);
                }
            }
            if (skelet2.isAlive) {
                skelet2.draw(graphics);
                if (skelet1.isFighting) {
                    graphics.drawString(skelet2.toString(), 220, 850);
                }
            }
            if (skelet3.isAlive) {
                skelet3.draw(graphics);
                if (skelet1.isFighting) {
                    graphics.drawString(skelet3.toString(), 220, 820);
                }
            }
            if (boss.isAlive) {
                boss.draw(graphics);
                if (skelet1.isFighting) {
                    graphics.drawString(boss.toString(), 220, 880);
                }
            }
            hero.draw(graphics);
            graphics.drawString(hero.toString(), 220, 760);
        } else {
            graphics.setColor(Color.BLACK);
            graphics.setFont(new Font("TimesRoman", Font.PLAIN, 18));
            graphics.drawString(hero.endOfGame(), 20, 260);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hero.Move(0, -1, gameObjects);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.Move(0, 1, gameObjects);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.Move(-1, 0, gameObjects);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.Move(1, 0, gameObjects);
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {

            for (Characters enemy : enemyObjects) {
                if (enemy.posX == hero.posX && enemy.posY == hero.posY) {
                    Battle(hero, enemy);
                }
            }
        }
        paint(getGraphics());
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void Battle(Characters attacker, Characters defender) {
        attacker.isFighting = true;
        defender.isFighting = true;
        System.out.println("fighting with " + defender);
        attacker.Strike(attacker, defender);
        if (defender.isAlive) {
            defender.Strike(defender, attacker);
        }
        paint(getGraphics());
        defender.isFighting = false;
        attacker.isFighting = false;
    }
}