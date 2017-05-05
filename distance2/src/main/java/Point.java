import lombok.Getter;

import static java.lang.String.valueOf;
import static oracle.jrockit.jfr.events.Bits.intValue;

@Getter

public class Point {

    int xCoordinate;
    int yCoordinate;
    double distanceToXm200Y300;
    double distanceToX1000Y25;

    public void setDistanceToXm200Y300(double distanceToXm200Y300) {
        this.distanceToXm200Y300 = distanceToXm200Y300;
    }

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public String toString() {
        return valueOf(this.xCoordinate).concat(" ".concat(valueOf(this.yCoordinate))).concat(" ".concat(valueOf(intValue(this.distanceToXm200Y300))));
    }
}
