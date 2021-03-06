import java.util.ArrayList;

public class ChosenPoints {

    Point referencePoint;
    ArrayList<Point> chosenPoints = new ArrayList<>();
    int indexOfMinimumDistancePointInChosenPoints;
    int indexOfMaximumDistancePointInChosenPoints;
    Double minimumDistanceInChosenPoints;
    Double maximumDistanceInChosenPoints;
    int maxSize;

    public Double getMinimumDistanceInChosenPoints() {
        return minimumDistanceInChosenPoints;
    }

    public Double getMaximumDistanceInChosenPoints() {
        return maximumDistanceInChosenPoints;
    }

    public void setIndexOfMinimumDistancePointInChosenPoints() {
        int indexOfMinimumDistance = 0;
        for (Point currPoint : this.chosenPoints) {
            if (getDistanceToReference(currPoint, referencePoint) < getDistanceToReference(this.chosenPoints.get(indexOfMinimumDistance), referencePoint)) {
                indexOfMinimumDistance = this.chosenPoints.indexOf(currPoint);
            }
        }
        indexOfMinimumDistancePointInChosenPoints = indexOfMinimumDistance;
        minimumDistanceInChosenPoints = getDistanceToReference(this.chosenPoints.get(indexOfMinimumDistance), referencePoint);
    }

    public void setIndexOfMaximumDistancePointInChosenPoints() {
        int indexOfMaximumDistance = 0;
        for (Point currPoint : this.chosenPoints) {
            if (getDistanceToReference(currPoint, referencePoint) > getDistanceToReference(this.chosenPoints.get(indexOfMaximumDistance), referencePoint)) {
                indexOfMaximumDistance = this.chosenPoints.indexOf(currPoint);
            }
        }
        indexOfMaximumDistancePointInChosenPoints = indexOfMaximumDistance;
        maximumDistanceInChosenPoints = getDistanceToReference(this.chosenPoints.get(indexOfMaximumDistance), referencePoint);
    }

    public ChosenPoints(Point referencePoint, int maxSize) {
        this.maxSize = maxSize;
        this.referencePoint = referencePoint;
    }

    public Double getDistanceToReference(Point point1, Point point2) {
        return Math.sqrt(Math.pow((point1.xCoordinate - point2.xCoordinate), 2) + Math.pow((point1.yCoordinate - point2.yCoordinate), 2));
    }
}
