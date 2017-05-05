public class Services {

    public Double calculateDistance(Point point1, Point point2) {

        Double distance;
        distance = Math.sqrt(Math.pow((point1.xCoordinate - point2.xCoordinate), 2) + Math.pow((point1.yCoordinate - point2.yCoordinate), 2));
        return distance;
    }

    public boolean isToBeIncludedInClosestPoints(Point point, ChosenPoints chosenPoints) {
        if (point.distanceToReference.get(0) > chosenPoints.getIndexOfMaximumDistancePointInList(0)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isToBeIncludedInFurthestPoints(Point point, ChosenPoints chosenPoints) {
        if (point.distanceToReference.get(1) < chosenPoints.getIndexOfMinimumDistancePointInList(1)) {
            return false;
        } else {
            return true;
        }
    }
}
