
public class Homework3 {
    public static final double PI = 3.14;

    public static double calAreaOfCircle(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        // Given radius = 9
        double radius = 9;
        double areaOfCircle = calAreaOfCircle(radius);
        System.out.println("Area of circle is: " + areaOfCircle);
    }
}
