import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class W06D4Eventcounter extends JFrame {

    JPanel myPanel = new JPanel();
    JLabel myLabelMouse = new JLabel("Label for MousePanel");
    JLabel myLabelKey = new JLabel("Label for KeyPanel");
    JLabel myLabelWindow = new JLabel("Label for WindowPanel");
    JTextField myText = new JTextField("", 20);
    int countMouse = 0;
    int countKey = 0;
    int countWindow = 0;

    public W06D4Eventcounter(){
        this.setVisible(true);
        this.setTitle("Event counter");
        this.setPreferredSize(new Dimension(500, 300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myPanel.setPreferredSize(new Dimension(100, 230));
        myLabelMouse.setPreferredSize(new Dimension(200, 50));
        myLabelMouse.setVerticalAlignment(SwingConstants.CENTER);
        myLabelKey.setPreferredSize(new Dimension(200, 50));
        myLabelKey.setVerticalAlignment(SwingConstants.CENTER);
        myLabelWindow.setPreferredSize(new Dimension(400, 50));
        myLabelWindow.setVerticalAlignment(SwingConstants.CENTER);
        myText.setPreferredSize(new Dimension(200, 50));
        pack();
        setLocationRelativeTo(null);

        getContentPane().add(myPanel);
        this.add(myPanel);
        myPanel.add(myLabelMouse);
        myPanel.add(myLabelKey);
        myPanel.add(myLabelWindow);
        myPanel.add(myText);
        myText.addKeyListener(new listenForKeys());
        this.addMouseListener(new listenForMouse());
        this.addWindowListener(new listenForWindow());
}

    public class listenForKeys implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {
            countKey ++;
            String isSingle = "";
            if (countKey != 1){
                isSingle = "s";
            }
            myLabelKey.setText(countKey + " key" + isSingle + " typed");
        }

        @Override
        public void keyReleased(KeyEvent e) {}
    }

    public class listenForMouse implements MouseListener {
                @Override
        public void mouseClicked(MouseEvent e) {
                    countMouse ++;
                    myLabelMouse.setText(countMouse + " mouseclicks done");
                }

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }

    public class listenForWindow implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {
            myLabelWindow.setText("Window opened " + countWindow + " time");
        }

        @Override
        public void windowClosing(WindowEvent e) {}

        @Override
        public void windowClosed(WindowEvent e) {}

        @Override
        public void windowIconified(WindowEvent e) {}

        @Override
        public void windowDeiconified(WindowEvent e) {
   //         countWindow++;
    //        myLabelWindow.setText("Window opened up again for the " + countWindow + " time");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            countWindow++;
            myLabelWindow.setText("Window opened up again for the " + countWindow + " time");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {}
    }

        public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                W06D4Eventcounter myApp =  new W06D4Eventcounter();
            }
        });
    }
}