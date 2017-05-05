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
        Point pointToBeMovedToLastPosition;

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

            if (i == closestPoints.maxSize) {
                int toBeRemoved = closestPoints.getIndexOfMaximumDistancePointInList(0);
                pointToBeMovedToLastPosition = new Point(closestPoints.chosenPoints.get(toBeRemoved).xCoordinate, closestPoints.chosenPoints.get(toBeRemoved).yCoordinate);
                pointToBeMovedToLastPosition.setDistanceToReference(services.calculateDistance(pointToBeMovedToLastPosition, referencePoint1));
                pointToBeMovedToLastPosition.setDistanceToReference(services.calculateDistance(pointToBeMovedToLastPosition, referencePoint2));
                closestPoints.chosenPoints.remove(toBeRemoved);
                closestPoints.chosenPoints.add(closestPoints.maxSize - 1, pointToBeMovedToLastPosition);
            }
            if (i < closestPoints.maxSize) {
                closestPoints.chosenPoints.add(currentPoint);
            } else if (services.isToBeIncludedInClosestPoints(currentPoint, closestPoints)) {
                closestPoints.chosenPoints.remove(closestPoints.maxSize - 1);
                closestPoints.chosenPoints.add(currentPoint);
            }
            if (i == furthestPoints.maxSize) {
                int toBeRemoved = furthestPoints.getIndexOfMinimumDistancePointInList(1);
                pointToBeMovedToLastPosition = new Point(furthestPoints.chosenPoints.get(toBeRemoved).xCoordinate, furthestPoints.chosenPoints.get(toBeRemoved).yCoordinate);
                pointToBeMovedToLastPosition.setDistanceToReference(services.calculateDistance(pointToBeMovedToLastPosition, referencePoint1));
                pointToBeMovedToLastPosition.setDistanceToReference(services.calculateDistance(pointToBeMovedToLastPosition, referencePoint2));
                furthestPoints.chosenPoints.remove(toBeRemoved);
                furthestPoints.chosenPoints.add(furthestPoints.maxSize - 1, pointToBeMovedToLastPosition);
            }
            if (i < furthestPoints.maxSize) {
                furthestPoints.chosenPoints.add(currentPoint);
            } else if (services.isToBeIncludedInFurthestPoints(currentPoint, furthestPoints)) {
                furthestPoints.chosenPoints.remove(furthestPoints.maxSize - 1);
                furthestPoints.chosenPoints.add(currentPoint);
            }
        }
        System.out.println(points.get(0).toString());
        System.out.println(furthestPoints.chosenPoints.get(0).toString());
        System.out.println(furthestPoints.chosenPoints.get(19).toString());
    }
}
