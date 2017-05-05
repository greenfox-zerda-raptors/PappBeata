import lombok.Setter;

import java.util.ArrayList;

@Setter
public class ClosestPoints extends ArrayList<Point> {

    int indexOfMinimumDistancePoint;
    int indexOfMaximumDistancePoint;

    public int getIndexOfMinimumDistancePoint() {
        int indexOfMinimumDistance = 0;
        for (Point currPoint : this) {
            if (currPoint.distanceToXm200Y300 < this.get(indexOfMinimumDistance).distanceToXm200Y300) {
                indexOfMinimumDistance = this.indexOf(currPoint);
            }
        }
        return indexOfMinimumDistance;
    }

    public int getIndexOfMaximumDistancePoint() {
        int indexOfMaximumDistance = 0;
        for (Point currPoint : this) {
            if (currPoint.distanceToXm200Y300 > this.get(indexOfMaximumDistance).distanceToXm200Y300) {
                indexOfMaximumDistance = this.indexOf(currPoint);
            }
        }
        return indexOfMaximumDistance;
    }
}
