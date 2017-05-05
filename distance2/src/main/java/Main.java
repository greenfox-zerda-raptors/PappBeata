import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        File pointsFile = new File("src/main/resources/points.dat");
        byte[] bytes = Files.toByteArray(pointsFile);
        ArrayList<Point> points = new ArrayList<>();

        for (int i = 0; i < bytes.length / 4; i++) {
            int convertedByteX;
            int convertedByteY;
            Point currentPoint;
            convertedByteX = ((bytes[4 * i]) << 8) | (bytes[4 * i + 1] & 0xff);
            convertedByteY = ((bytes[4 * i + 2]) << 8) | (bytes[4 * i + 3] & 0xff);
            currentPoint = new Point(convertedByteX, convertedByteY);
            points.add(currentPoint);
        }
        
        System.out.println(points.get(0).toString());

    }
}
