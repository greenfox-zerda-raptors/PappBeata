import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class Main {

    static ChosenPoints points;
    static ChosenPoints closestPoints;
    static ChosenPoints furthestPoints;

    public static void main(String[] args) throws IOException {
        File pointsFile = new File("src/main/resources/points.dat");
        byte[] bytes = Files.toByteArray(pointsFile);
        Point origo = new Point(0, 0);
        points = new ChosenPoints(origo, bytes.length / 4);
        Point referencePoint1 = new Point(-200, 300);
        Point referencePoint2 = new Point(1000, 25);
        closestPoints = new ChosenPoints(referencePoint1, 10);
        furthestPoints = new ChosenPoints(referencePoint2, 20);
        Point pointToBeMovedToLastPosition;
        int toBeRemoved;

        for (int i = 0; i < bytes.length / 4; i++) {
            int convertedByteX;
            int convertedByteY;
            Point currentPoint;
            convertedByteX = ((bytes[4 * i]) << 8) | (bytes[4 * i + 1] & 0xff);
            convertedByteY = ((bytes[4 * i + 2]) << 8) | (bytes[4 * i + 3] & 0xff);
            currentPoint = new Point(convertedByteX, convertedByteY);
            points.chosenPoints.add(currentPoint);

            if (i == closestPoints.maxSize) {
                closestPoints.setIndexOfMaximumDistancePointInChosenPoints(0);
                toBeRemoved = closestPoints.indexOfMaximumDistancePointInChosenPoints;
                pointToBeMovedToLastPosition = new Point(closestPoints.chosenPoints.get(toBeRemoved).xCoordinate, closestPoints.chosenPoints.get(toBeRemoved).yCoordinate);
                closestPoints.chosenPoints.remove(toBeRemoved);
                closestPoints.chosenPoints.add(closestPoints.maxSize - 1, pointToBeMovedToLastPosition);
            }
            if (i < closestPoints.maxSize) {
                closestPoints.chosenPoints.add(currentPoint);
            } else if (isToBeIncludedInClosestPoints(currentPoint, closestPoints)) {
                closestPoints.chosenPoints.remove(closestPoints.maxSize - 1);
                closestPoints.chosenPoints.add(currentPoint);
            }
            if (i == furthestPoints.maxSize) {
                furthestPoints.setIndexOfMinimumDistancePointInChosenPoints(1);
                toBeRemoved = furthestPoints.indexOfMinimumDistancePointInChosenPoints;
                pointToBeMovedToLastPosition = new Point(furthestPoints.chosenPoints.get(toBeRemoved).xCoordinate, furthestPoints.chosenPoints.get(toBeRemoved).yCoordinate);
                furthestPoints.chosenPoints.remove(toBeRemoved);
                furthestPoints.chosenPoints.add(furthestPoints.maxSize - 1, pointToBeMovedToLastPosition);
            }
            if (i < furthestPoints.maxSize) {
                furthestPoints.chosenPoints.add(currentPoint);
            } else if (isToBeIncludedInFurthestPoints(currentPoint, furthestPoints)) {
                furthestPoints.chosenPoints.remove(furthestPoints.maxSize - 1);
                furthestPoints.chosenPoints.add(currentPoint);
            }
        }
        System.out.println(bytes.length);
        System.out.println(points.chosenPoints.get(0).toString());
        System.out.println(furthestPoints.chosenPoints.toString());
        System.out.println(closestPoints.chosenPoints.toString());
    }

    public static boolean isToBeIncludedInClosestPoints(Point point, ChosenPoints chosenPoints) {
        return points.getDistanceToReference(point, closestPoints.chosenPoints.get(chosenPoints.maxSize - 1)) <= chosenPoints.indexOfMaximumDistancePointInChosenPoints;
    }

    public static boolean isToBeIncludedInFurthestPoints(Point point, ChosenPoints chosenPoints) {
        return points.getDistanceToReference(point, furthestPoints.chosenPoints.get(chosenPoints.maxSize - 1)) >= chosenPoints.indexOfMinimumDistancePointInChosenPoints;
    }
}
