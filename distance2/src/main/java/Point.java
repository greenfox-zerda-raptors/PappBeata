import lombok.Getter;
import lombok.Setter;

import static java.lang.String.valueOf;

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
        distance = Math.sqrt(Math.pow((point1.xCoordinate - point2.xCoordinate), 2) + Math.pow((point1.yCoordinate - point2.yCoordinate), 2));
        return distance;
    }

    public String toString() {

        return valueOf(this.xCoordinate).concat(" ".concat(valueOf(this.yCoordinate)));
    }

}
