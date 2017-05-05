import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Services services = new Services();
        File pointsFile = new File("src/main/resources/points.dat");
        byte[] bytes = Files.toByteArray(pointsFile);
        ArrayList<Point> points = new ArrayList<>();
        Point referencePoint1 = new Point(-200, 300);
        Point referencePoint2 = new Point(1000, 25);

        for (int i = 0; i < bytes.length / 4; i++) {
            int convertedByteX;
            int convertedByteY;
            Point currentPoint;
            convertedByteX = ((bytes[4 * i]) << 8) | (bytes[4 * i + 1] & 0xff);
            convertedByteY = ((bytes[4 * i + 2]) << 8) | (bytes[4 * i + 3] & 0xff);
            currentPoint = new Point(convertedByteX, convertedByteY);
            double x = services.calculateDistance(currentPoint, referencePoint1);
            services.calculateDistance(currentPoint, referencePoint2);
            currentPoint.setDistanceToXm200Y300(x);
            points.add(currentPoint);
        }
        System.out.println(points.get(0).toString());
    }
}
