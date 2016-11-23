import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CounterApp extends JFrame implements ActionListener{

    int clicks = 0;
    JLabel labelCount;


    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CounterApp myApp =  new CounterApp();
            }
        });
    }
        public CounterApp() {

            this.setVisible(true);
            this.setTitle("ClickCounter");
            setSize(500, 500);
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panelCount = new JPanel();
            getContentPane().add(panelCount);
            Toolkit tk = Toolkit.getDefaultToolkit();
            JLabel labelCount = new JLabel("Pressed 0 times");
            panelCount.add(labelCount);
            labelCount.setPreferredSize(new Dimension(200, 30));
            this.add(panelCount);

            JButton button = new JButton("Count");
            button.addActionListener(this);
            button.setText("Press me!");
            button.setToolTipText("I am counting how many times you click on me!");
            panelCount.add(button);
        //    pack();
            setLocationRelativeTo(null);

        }


    public void updateLabel(){
        this.labelCount.setText("Pressed " + this.clicks + " times");
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicks++;
        updateLabel();
    }
}

