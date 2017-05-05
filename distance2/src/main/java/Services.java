public class Services {

    public Double calculateDistance(Point point1, Point point2) {

        Double distance;
        distance = Math.sqrt(Math.pow((point1.xCoordinate - point2.xCoordinate), 2) + Math.pow((point1.yCoordinate - point2.yCoordinate), 2));
        return distance;
    }

    public boolean isToBeIncludedInClosestPoints(Point point, SortedPoints sortedPoints) {
        if (point.distanceToReference.get(0) > sortedPoints.getIndexOfMaximumDistancePointInList(0)) {
            return false;
        }
        return true;
    }

    public boolean isToBeIncludedInFurthestPoints(Point point, SortedPoints sortedPoints) {
        if (point.distanceToReference.get(1) < sortedPoints.getIndexOfMinimumDistancePointInList(1)) {
            return false;
        }
        return true;
    }
}
