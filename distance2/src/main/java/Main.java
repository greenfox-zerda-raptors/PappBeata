import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class Main {

    static ChosenPoints points;
    static ChosenPoints closestPoints;
    static ChosenPoints furthestPoints;
    static Point pointToBeMovedToLastPosition;
    static int indexToBeRemoved;

    public static void main(String[] args) throws IOException {
        File pointsFile = new File("src/main/resources/points.dat");
        byte[] bytes = Files.toByteArray(pointsFile);
        Point origo = new Point(0, 0);
        points = new ChosenPoints(origo, bytes.length / 4);
        Point referencePoint1 = new Point(-200, 300);
        Point referencePoint2 = new Point(1000, 25);
        closestPoints = new ChosenPoints(referencePoint1, 10);
        furthestPoints = new ChosenPoints(referencePoint2, 20);

        for (int i = 0; i < bytes.length / 4; i++) {
            int convertedByteX;
            int convertedByteY;
            Point currentPoint;
            convertedByteX = ((bytes[4 * i]) << 8) | (bytes[4 * i + 1] & 0xff);
            convertedByteY = ((bytes[4 * i + 2]) << 8) | (bytes[4 * i + 3] & 0xff);
            currentPoint = new Point(convertedByteX, convertedByteY);
            points.chosenPoints.add(currentPoint);

            if (i == closestPoints.maxSize) {
                moveMaximumItemToTheEnd(closestPoints);
            }
            if (i < closestPoints.maxSize) {
                closestPoints.chosenPoints.add(currentPoint);
            } else if (isToBeIncludedInClosestPoints(currentPoint, closestPoints)) {
                moveMaximumItemToTheEnd(closestPoints);
                changeLastItemToCurrentItem(closestPoints, currentPoint);
            }
            if (i == furthestPoints.maxSize) {
                moveMinimumItemToTheEnd(furthestPoints);
            }
            if (i < furthestPoints.maxSize) {
                furthestPoints.chosenPoints.add(currentPoint);
            } else if (isToBeIncludedInFurthestPoints(currentPoint, furthestPoints)) {
                moveMinimumItemToTheEnd(furthestPoints);
                changeLastItemToCurrentItem(furthestPoints, currentPoint);
            }
        }
        System.out.println(bytes.length);
        System.out.println(points.chosenPoints.get(3).toString());
        System.out.println(closestPoints.chosenPoints.toString());
        System.out.println(furthestPoints.chosenPoints.toString());
    }

    public static void moveMaximumItemToTheEnd(ChosenPoints chosenPoints) {
        chosenPoints.setIndexOfMaximumDistancePointInChosenPoints();
        indexToBeRemoved = chosenPoints.indexOfMaximumDistancePointInChosenPoints;
        pointToBeMovedToLastPosition = new Point(chosenPoints.chosenPoints.get(indexToBeRemoved).xCoordinate, chosenPoints.chosenPoints.get(indexToBeRemoved).yCoordinate);
        chosenPoints.chosenPoints.remove(indexToBeRemoved);
        chosenPoints.chosenPoints.add(chosenPoints.maxSize - 1, pointToBeMovedToLastPosition);
    }

    public static void moveMinimumItemToTheEnd(ChosenPoints chosenPoints) {
        chosenPoints.setIndexOfMinimumDistancePointInChosenPoints();
        indexToBeRemoved = chosenPoints.indexOfMinimumDistancePointInChosenPoints;
        pointToBeMovedToLastPosition = new Point(chosenPoints.chosenPoints.get(indexToBeRemoved).xCoordinate, chosenPoints.chosenPoints.get(indexToBeRemoved).yCoordinate);
        chosenPoints.chosenPoints.remove(indexToBeRemoved);
        chosenPoints.chosenPoints.add(chosenPoints.maxSize - 1, pointToBeMovedToLastPosition);
    }

    public static void changeLastItemToCurrentItem(ChosenPoints chosenPoints, Point point) {
        chosenPoints.chosenPoints.remove(chosenPoints.maxSize - 1);
        chosenPoints.chosenPoints.add(chosenPoints.maxSize - 1, point);
    }

    public static boolean isToBeIncludedInClosestPoints(Point point, ChosenPoints chosenPoints) {
        return points.getDistanceToReference(point, closestPoints.chosenPoints.get(chosenPoints.maxSize - 1)) <= chosenPoints.getMaximumDistanceInChosenPoints();
    }

    public static boolean isToBeIncludedInFurthestPoints(Point point, ChosenPoints chosenPoints) {
        return points.getDistanceToReference(point, furthestPoints.chosenPoints.get(chosenPoints.maxSize - 1)) >= chosenPoints.getMinimumDistanceInChosenPoints();
    }
}
