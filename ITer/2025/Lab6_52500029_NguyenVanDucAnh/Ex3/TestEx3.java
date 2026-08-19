

import java.util.Arrays;

public class TestEx3 {
    public static void main(String[] args) {

        Point2D p2a = new Point2D();
        System.out.println(p2a.toString());
        // Expect: 0.0; 0.0

        Point2D p2b = new Point2D(3.5f, 5.5f);
        System.out.println(p2b.toString());
        // Expect: 3.5; 5.5

        p2b.setXY(10.0f, 20.0f);
        System.out.println(p2b.toString());
        // Expect: 10.0; 20.0

        System.out.println(Arrays.toString(p2b.getXY()));
        // Expect: [10.0, 20.0]

        Point3D p3a = new Point3D();
        System.out.println(p3a.toString());
        // Expect: 0.0; 0.0; 0.0 (Assuming the toString bug is fixed)

        Point3D p3b = new Point3D(1.2f, 3.4f, 5.6f);
        System.out.println(p3b.toString());
        // Expect: 1.2; 3.4; 5.6

        p3b.setXYZ(7.7f, 8.8f, 9.9f);
        System.out.println(p3b.toString());
        // Expect: 7.7; 8.8; 9.9

        System.out.println(Arrays.toString(p3b.getXYZ()));
        // Expect: [7.7, 8.8, 9.9]
    }
}