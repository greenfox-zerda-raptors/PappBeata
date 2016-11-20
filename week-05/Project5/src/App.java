import com.bap.todo.*;

public class App {

    public static void main(String[] args) {

        new Initiate();

        //read file

        char cmd = '0';
        Scanner objScan = new Scanner();
        Commands objCommands = new Commands();

        while (cmd != 'q') {

            String lastinput = objScan.Scan();

            cmd = lastinput.charAt(0);

            if (cmd == 'a') {
                objCommands.addItem(lastinput.substring(3));

            } else if (cmd == 'h') {
                objCommands.help();

            } else if (cmd == 'l') {
                objCommands.listItems();

            } else if (cmd == 'c') {
                objCommands.complete(lastinput);

            } else if (cmd == 'r') {
                objCommands.removeItem(lastinput.substring(6));

            } else { //command quit

            }

            //output into file
        }

    }
}