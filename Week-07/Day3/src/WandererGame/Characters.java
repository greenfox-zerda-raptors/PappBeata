package WandererGame;

import java.util.ArrayList;
import java.util.Random;

public class Characters extends GameObject {

    public int currHP;
    public int maxHP;
    public int currDP;
    public int currSP;
    public int currSV;
    public boolean isAlive = true;
    public boolean isFighting = false;
    Random random = new Random();
    public int d = random.nextInt(6) + 1;

    public int getCurrHP() {
        return currHP;
    }

    public void setCurrHP(int currHP) {
        this.currHP = currHP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurrDP() {
        return currDP;
    }

    public void setCurrDP(int currDP) {
        this.currDP = currDP;
    }

    public int getCurrSP() {
        return currSP;
    }

    public void setCurrSP(int currSP) {
        this.currSP = currSP;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Characters(String filename, int posX, int posY, String name) {
        super(filename, posX, posY, name);
    }

    public void Move(int xDirection, int yDirection, ArrayList<GameObject> gameObjects) {
        if (xDirection == 1) {
            this.setImage(rightImg);
            if (this.posX != 9 && !gameObjects.get(posX + 1 + 10 * posY).isRestrictField()) {
                this.posX += 1;
            }
        } else if (xDirection == -1) {
            this.setImage(leftImg);
            if (this.posX != 0 && !gameObjects.get(posX - 1 + 10 * posY).isRestrictField()) {
                this.posX -= 1;
            }
        } else if (yDirection == 1) {
            this.setImage(downImg);
            if (this.posY != 9 && !gameObjects.get(posX + 10 * (posY + 1)).isRestrictField()) {
                this.posY += 1;
            }
        } else if (yDirection == -1) {
            this.setImage(upImg);
            if (this.posY != 0 && !gameObjects.get(posX + 10 * (posY - 1)).isRestrictField()) {
                this.posY -= 1;
            }
        }
    }

    public void Strike(Characters attacker, Characters defender, ArrayList<Characters> enemyObjects) {
        attacker.currSV = attacker.currSP + d * 2;
        if (attacker.currSV > defender.currDP) {
            defender.currHP -= attacker.currSV - defender.currDP;
            attacker.currHP += defender.currDP / 2;
        }
        if (attacker.currHP <= 0) {
            attacker.isAlive = false;
            System.out.println("attacker dead");
        }
        if (defender.currHP <= 0) {
            defender.isAlive = false;
            System.out.println("defender dead");
            enemyObjects.remove(defender);
        }
    }

    public String toString() {
        return String.format("%s (Level 1) HP: %d/%d | DP: %d | SP: %d", this.getObjectName(), this.getCurrHP(), this.getMaxHP(), this.getCurrDP(), this.getCurrSP());
    }
}


