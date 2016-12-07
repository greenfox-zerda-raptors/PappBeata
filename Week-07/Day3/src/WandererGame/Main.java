package WandererGame;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Wanderer Game");
        Board board = new Board();
        myFrame.add(board);
        myFrame.pack();
        myFrame.setVisible(true);
        myFrame.addKeyListener(board);
    }
}


