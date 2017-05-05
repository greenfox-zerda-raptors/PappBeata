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
        ReferencePoints referencePoints = new ReferencePoints();
        referencePoints.add(0, referencePoint1);
        referencePoints.add(1, referencePoint2);
        ClosestPoints closestPoints = new ClosestPoints();
        FurthestPoints furthestPoints = new FurthestPoints();

        for (int i = 0; i < bytes.length / 4; i++) {
            int convertedByteX;
            int convertedByteY;
            Point currentPoint;
            convertedByteX = ((bytes[4 * i]) << 8) | (bytes[4 * i + 1] & 0xff);
            convertedByteY = ((bytes[4 * i + 2]) << 8) | (bytes[4 * i + 3] & 0xff);
            currentPoint = new Point(convertedByteX, convertedByteY);
            currentPoint.setDistanceToReference(services.calculateDistance(currentPoint, referencePoint1));
            currentPoint.setDistanceToReference(services.calculateDistance(currentPoint, referencePoint2));
            points.add(currentPoint);

            if (i < closestPoints.maxIndex || services.isToBeIncludedInClosestPoints(currentPoint, closestPoints)) {
                closestPoints.sortedPoints.add(currentPoint);
            }
            if (i < furthestPoints.maxIndex || services.isToBeIncludedInFurthestPoints(currentPoint, furthestPoints)) {
                furthestPoints.sortedPoints.add(currentPoint);
            }
        }

        System.out.println(points.get(0).toString());
        System.out.println(furthestPoints.sortedPoints.get(0).toString());
        System.out.println(furthestPoints.sortedPoints.get(19).toString());
    }
}
