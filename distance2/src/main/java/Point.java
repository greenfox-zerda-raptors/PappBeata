import static java.lang.String.valueOf;

public class Point {

    int xCoordinate;
    int yCoordinate;

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public String toString() {
        return valueOf(this.xCoordinate).concat(" ".concat(valueOf(this.yCoordinate)));
    }
}
