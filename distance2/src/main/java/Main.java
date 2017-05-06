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
        ChosenPoints chosenPoints;

        for (int i = 0; i < bytes.length / 4; i++) {
            int convertedByteX;
            int convertedByteY;
            Point currentPoint;
            convertedByteX = ((bytes[4 * i]) << 8) | (bytes[4 * i + 1] & 0xff);
            convertedByteY = ((bytes[4 * i + 2]) << 8) | (bytes[4 * i + 3] & 0xff);
            currentPoint = new Point(convertedByteX, convertedByteY);
            points.chosenPoints.add(currentPoint);
            mutateChosenPoints(i, closestPoints, currentPoint);
            mutateChosenPoints(i, furthestPoints, currentPoint);
        }
        System.out.println(closestPoints.chosenPoints.toString());
        System.out.println(furthestPoints.chosenPoints.toString());
    }

    public static void moveExtremeToTheEnd(ChosenPoints chosenPoints) {
        if (chosenPoints == furthestPoints) {
            chosenPoints.setIndexOfMinimumDistancePointInChosenPoints();
            indexToBeRemoved = chosenPoints.indexOfMinimumDistancePointInChosenPoints;
        } else if (chosenPoints == closestPoints) {
            chosenPoints.setIndexOfMaximumDistancePointInChosenPoints();
            indexToBeRemoved = chosenPoints.indexOfMaximumDistancePointInChosenPoints;
        }
        pointToBeMovedToLastPosition = new Point(chosenPoints.chosenPoints.get(indexToBeRemoved).xCoordinate, chosenPoints.chosenPoints.get(indexToBeRemoved).yCoordinate);
        chosenPoints.chosenPoints.remove(indexToBeRemoved);
        chosenPoints.chosenPoints.add(chosenPoints.maxSize - 1, pointToBeMovedToLastPosition);
    }

    public static void changeLastItemToCurrentItem(ChosenPoints chosenPoints, Point point) {
        chosenPoints.chosenPoints.remove(chosenPoints.maxSize - 1);
        chosenPoints.chosenPoints.add(chosenPoints.maxSize - 1, point);
    }

    public static boolean isToBeIncludedInChosenPoints(Point point, ChosenPoints chosenPoints) {
        if (chosenPoints == closestPoints) {
            return points.getDistanceToReference(point, closestPoints.chosenPoints.get(chosenPoints.maxSize - 1)) <= chosenPoints.getMaximumDistanceInChosenPoints();
        } else {
            return points.getDistanceToReference(point, furthestPoints.chosenPoints.get(chosenPoints.maxSize - 1)) >= chosenPoints.getMinimumDistanceInChosenPoints();
        }
    }

    public static void mutateChosenPoints(int i, ChosenPoints chosenPoints, Point currentPoint) {
        if (i == chosenPoints.maxSize) {
            moveExtremeToTheEnd(chosenPoints);
        }
        if (i < chosenPoints.maxSize) {
            chosenPoints.chosenPoints.add(currentPoint);
        } else if (isToBeIncludedInChosenPoints(currentPoint, chosenPoints)) {
            moveExtremeToTheEnd(chosenPoints);
            changeLastItemToCurrentItem(chosenPoints, currentPoint);
        }
    }
}
