import java.util.ArrayList;

public class FurthestPoints extends ArrayList<Point> {

    int indexOfMinimumDistancePoint;
    int indexOfMaximumDistancePoint;

    public int getIndexOfMinimumDistancePoint() {
        int indexOfMinimumDistance = 0;
        for (Point currPoint : this) {
            if (currPoint.distanceToX1000Y25 < this.get(indexOfMinimumDistance).distanceToX1000Y25) {
                indexOfMinimumDistance = this.indexOf(currPoint);
            }
        }
        return indexOfMinimumDistance;
    }

    public int getIndexOfMaximumDistancePoint() {
        int indexOfMaximumDistance = 0;
        for (Point currPoint : this) {
            if (currPoint.distanceToX1000Y25 > this.get(indexOfMaximumDistance).distanceToX1000Y25) {
                indexOfMaximumDistance = this.indexOf(currPoint);
            }
        }
        return indexOfMaximumDistance;
    }
}
