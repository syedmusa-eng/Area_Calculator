public class AreaCalculator {

    private static final double INVALID_VALUE = -1;

    //Creating a method to find area of a circle
    public static double area(double radius) {

        if (radius < 0) {
            return INVALID_VALUE;
        }
        return radius * radius * Math.PI;

    }

    //Creating a method to find area of the rectangle
    public static double area(double x, double y) {

        if (x < 0 || y < 0) {
            return INVALID_VALUE;
        }

        return x * y;
    }
}
