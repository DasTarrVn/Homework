public class TestMyPoint {
    public static void main(String[] args) {
        System.out.println("=== 1. TEST CONSTRUCTORS & TOSTRING ===");

        // Test Default Constructor
        MyPoint p1 = new MyPoint();
        System.out.println("Point 1 (Default): " + p1.toString());

        // Test Parameterized Constructor
        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("Point 2 (Params): " + p2.toString());

        // Test Copy Constructor
        MyPoint p3 = new MyPoint(p2);
        System.out.println("Point 3 (Copy of p2): " + p3.toString());

        System.out.println("\n=== 2. TEST SETTERS & GETTERS ===");
        p1.setX(8);
        p1.setY(6);
        System.out.println("Point 1 (After Set): x=" + p1.getX() + " y=" + p1.getY());

        System.out.println("\n=== 3. TEST DISTANCE METHODS ===");

        // Kết quả mong đợi: 5.0 (vì 3^2 + 4^2 = 25, căn 25 = 5)
        System.out.println("Distance from p2 to origin (0,0): " + p2.distance());

        // Kết quả mong đợi: 10.0
        System.out.println("Distance from p1 to coordinate (0,0): " + p1.distance(0, 0));

        System.out.println("Distance from p1 to p2: " + p1.distance(p2));

        System.out.println("\n=== 4. TEST EQUALS ===");
        MyPoint p4 = new MyPoint(3, 4);

        System.out.println("p2 equals p3? " + p2.equals(p3)); // True
        System.out.println("p2 equals p4? " + p2.equals(p4)); // True
        System.out.println("p1 equals p2? " + p1.equals(p2)); // False
    }
}