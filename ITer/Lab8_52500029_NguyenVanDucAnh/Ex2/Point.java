import java.util.ArrayList;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point[x=" + getX() + ", y=" + getY() + "].";
    }

    public double distanceToOrigin() {
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(0.5, 0.5));
        points.add(new Point(1.0, 1.0));
        points.add(new Point(-0.2, 0.8));
        points.add(new Point(0, 0.9));
        points.add(new Point(2, 3));

        System.out.println("Points inside the circle with center O(0,0) and radius 1:");
        for (Point p : points) {
            if (p.distanceToOrigin() <= 1.0) {
                System.out.println(p);
            }
        }
    }
}
