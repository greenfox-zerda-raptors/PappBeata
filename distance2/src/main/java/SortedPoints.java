import java.util.ArrayList;

public class SortedPoints {

    ArrayList<Point> sortedPoints = new ArrayList<>();
    int indexOfMinimumDistancePointInList;
    int indexOfMaximumDistancePointInList;
    int maxIndex;
    Services services = new Services();

    public int getIndexOfMinimumDistancePointInList(int positionOfReference) {
        int indexOfMinimumDistance = 0;
        for (Point currPoint : this.sortedPoints) {
            if (currPoint.getDistanceToReference(positionOfReference) < this.sortedPoints.get(indexOfMinimumDistance).distanceToReference.get(positionOfReference)) {
                indexOfMinimumDistance = this.sortedPoints.indexOf(currPoint);
            }
        }
        return indexOfMinimumDistance;
    }

    public int getIndexOfMaximumDistancePointInList(int positionOfReference) {
        int indexOfMaximumDistance = 0;
        for (Point currPoint : this.sortedPoints) {
            if (currPoint.getDistanceToReference(positionOfReference) > this.sortedPoints.get(indexOfMaximumDistance).distanceToReference.get(positionOfReference)) {
                indexOfMaximumDistance = this.sortedPoints.indexOf(currPoint);
            }
        }
        return indexOfMaximumDistance;
    }
}
