import javafx.stage.Screen;
import sun.applet.Main;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;


public class Workshop1 extends JFrame {

    public static void main(String args[]) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Workshop1();
            }
        });

    }

    public Workshop1() {
        System.out.println("Heki gyereki!");
        this.setVisible(true);
        this.setTitle("Swing the world!");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] hellos = new String[]{"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
        JPanel panelHeki = new JPanel();
        Toolkit tk = Toolkit.getDefaultToolkit();
        setLocationRelativeTo(null);
/*        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.setResizable(false);*/

        for (int e = 1; e < hellos.length; e++) {
            JLabel labelHeki = new JLabel(hellos[e]);
            panelHeki.add(labelHeki);
            this.add(panelHeki);

        }

    }
}
