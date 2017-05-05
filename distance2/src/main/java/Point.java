import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Point {

    int xCoordinate;
    int yCoordinate;
    double distanceToXm200Y300;
    double distanceToX1000Y25;

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double calculateDistance(Point point1, Point point2) {
        double distance;

        return 0;
    }
}
