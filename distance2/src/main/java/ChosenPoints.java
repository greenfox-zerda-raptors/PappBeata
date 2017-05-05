import java.util.ArrayList;

public class ChosenPoints {

    Point referencePoint;
    ArrayList<Point> chosenPoints = new ArrayList<>();
    ArrayList<Double> distancesOfChosenPoints = new ArrayList<>();
    int indexOfMinimumDistancePointInChosenPoints;
    int indexOfMaximumDistancePointInChosenPoints;
    int maxSize;
    int indexInPoints;

    public void setIndexOfMinimumDistancePointInChosenPoints(int positionOfReference) {
        int indexOfMinimumDistance = 0;
        for (Point currPoint : this.chosenPoints) {
            if (getDistanceToReference(currPoint, referencePoint) < getDistanceToReference(this.chosenPoints.get(indexOfMinimumDistance), referencePoint)) {
                indexOfMinimumDistance = this.chosenPoints.indexOf(currPoint);
            }
        }
        indexOfMinimumDistancePointInChosenPoints = indexOfMinimumDistance;
    }

    public void setIndexOfMaximumDistancePointInChosenPoints(int positionOfReference) {
        int indexOfMaximumDistance = 0;
        for (Point currPoint : this.chosenPoints) {
            if (getDistanceToReference(currPoint, referencePoint) > getDistanceToReference(this.chosenPoints.get(indexOfMaximumDistance), referencePoint)) {
                indexOfMaximumDistance = this.chosenPoints.indexOf(currPoint);
            }
        }
        indexOfMaximumDistancePointInChosenPoints = indexOfMaximumDistance;
    }

    public ChosenPoints(Point referencePoint, int maxSize) {
        this.maxSize = maxSize;
        this.referencePoint = referencePoint;
    }

    public Double getDistanceToReference(Point point1, Point point2) {
        Double distance;
        distance = Math.sqrt(Math.pow((point1.xCoordinate - point2.xCoordinate), 2) + Math.pow((point1.yCoordinate - point2.yCoordinate), 2));
        return distance;
    }
}
