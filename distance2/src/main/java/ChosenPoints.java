import java.util.ArrayList;

public class ChosenPoints {

    ArrayList<Point> chosenPoints = new ArrayList<>();
    int indexOfMinimumDistancePointInList;
    int indexOfMaximumDistancePointInList;
    int maxSize;
    Services services = new Services();

    public int getIndexOfMinimumDistancePointInList(int positionOfReference) {
        int indexOfMinimumDistance = 0;
        for (Point currPoint : this.chosenPoints) {
            if (currPoint.getDistanceToReference(positionOfReference) < this.chosenPoints.get(indexOfMinimumDistance).distanceToReference.get(positionOfReference)) {
                indexOfMinimumDistance = this.chosenPoints.indexOf(currPoint);
            }
        }
        return indexOfMinimumDistance;
    }

    public int getIndexOfMaximumDistancePointInList(int positionOfReference) {
        int indexOfMaximumDistance = 0;
        for (Point currPoint : this.chosenPoints) {
            if (currPoint.getDistanceToReference(positionOfReference) > this.chosenPoints.get(indexOfMaximumDistance).distanceToReference.get(positionOfReference)) {
                indexOfMaximumDistance = this.chosenPoints.indexOf(currPoint);
            }
        }
        return indexOfMaximumDistance;
    }
}
