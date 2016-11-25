import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WrapperApp  extends JFrame implements ActionListener{

    JPanel myPanel = new JPanel();
    JLabel myLabel = new JLabel("Label text for myLabel");
    JMenuBar myMenuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenuItem exitAction = new JMenuItem("Exit");

    public WrapperApp (){
        this.setVisible(true);
        this.setTitle("WrapperApp");
        this.setResizable(true);
        this.setPreferredSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        getContentPane().add(myPanel);
        this.add(myPanel);
        myPanel.add(myMenuBar);
        myMenuBar.add(fileMenu);
        myMenuBar.add(editMenu);
        fileMenu.add(exitAction);
        exitAction.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {System.exit(0);}
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                WrapperApp myApp =  new WrapperApp();
            }
        });
    }
}
