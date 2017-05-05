public class Services {

    public static double calculateDistance(Point point1, Point point2) {

        double distance;
        distance = Math.sqrt(Math.pow((point1.xCoordinate - point2.xCoordinate), 2) + Math.pow((point1.yCoordinate - point2.yCoordinate), 2));
        return distance;
    }
}
