import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File points = new File("src/main/resources/points.dat");
        byte[] bytes = Files.toByteArray(points);

        int firstNr = ((bytes[2]) << 8) | (bytes[3] & 0xff);
        System.out.println(firstNr);


    }
}
