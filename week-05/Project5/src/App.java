import com.bap.todo.*;

public class App {

    public static void main(String[] args) {

        new Initiate();

        //read file

        String lastinput = Scanner.Scan();

        char cmd = lastinput.charAt(0);
        System.out.println(cmd);

        if (cmd == 'a'){
            Commands.addItem(lastinput.substring(3, 100));

        } else if (cmd == 'h'){
            Commands.help();

        } else if (cmd == 'l'){
            Commands.listItems();

        }else if (cmd == 'c'){
            Commands.complete(lastinput);

        } else { //command remove
            Commands.removeItem(lastinput);

        }


    }
}