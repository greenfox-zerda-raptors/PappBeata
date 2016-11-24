import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class W06D4Eventcounter extends JFrame implements ActionListener {

    JLabel myLabel = new JLabel("Pressed 0 times");


    public W06D4Eventcounter(){
            this.setVisible(true);
            this.setTitle("ClickCounter");
    setSize(500, 500);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panelCount = new JPanel();
    getContentPane().add(panelCount);
    Toolkit tk = Toolkit.getDefaultToolkit();
            panelCount.add(myLabel);
        myLabel.setPreferredSize(new Dimension(200, 30));
            this.add(panelCount);

    JButton button = new JButton("Count");
            button.addActionListener(this);
            button.setText("Press me!");
            button.setToolTipText("I am counting how many times you click on me!");
            panelCount.add(button);
    pack();
    setLocationRelativeTo(null);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        this.myLabel.setText("Pressed " + " times");
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
