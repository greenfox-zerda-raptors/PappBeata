import java.util.ArrayList;

import static java.lang.String.valueOf;

public class Point {

    int xCoordinate;
    int yCoordinate;
    ArrayList<Double> distanceToReference = new ArrayList<>();

    public Double getDistanceToReference(int indexOfReference) {
        return this.distanceToReference.get(indexOfReference);
    }

    public void setDistanceToReference(Double distanceToReference) {
        this.distanceToReference.add(this.distanceToReference.size(), distanceToReference);
    }

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public String toString() {
        return valueOf(this.xCoordinate).concat(" ".concat(valueOf(this.yCoordinate))).concat(" ".concat(this.distanceToReference.toString()));
    }
}
