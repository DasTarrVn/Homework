import java.util.*;
import java.awt.*;

public class DistanceTwoPoint {
    public static void main(String[] args) {
        // Instantiates a Random object
        Random rd = new Random();
        // Generates two random integers x and y
        int x = rd.nextInt(101);
        int y = rd.nextInt(101);
        // // Creates point
        Point p1 = new Point(x, y);
        System.out.println(toString(p1));
        // Creates another point
        x = rd.nextInt(101);
        y = rd.nextInt(101);
        Point p2 = new Point(x, y);
        // (Optional)
        // System.out.println(toString(p2));
        System.out.println("Distance between two points: " + p1.distance(p2));
    }

    public static String toString(Point p) {
        return "Point location: [x=" + p.x + "][y=" + p.y + "]";
    }

}