public class TestRectangle {
    public static void main(String[] args) {
        System.out.println("=== RECTANGLE GEOMETRY TEST SUITE ===");

        // 1. Testing Constructors
        Rectangle r1 = new Rectangle(); // Default: 0.0, 0.0
        Rectangle r2 = new Rectangle(5.0, 10.0);
        Rectangle r3 = new Rectangle(r2); // Copy of r2

        System.out.println("\n[Test 1] Initialization:");
        System.out.println("Rectangle 1 (Default): " + r1.toString());
        System.out.println("Rectangle 2 (Custom):  " + r2.toString());
        System.out.println("Rectangle 3 (Copy):    " + r3.toString());

        // 2. Testing Calculations
        System.out.println("\n[Test 2] Area and Perimeter Calculation (Rectangle 2):");
        System.out.println("Width: " + r2.getWidth() + ", Length: " + r2.getLength());
        System.out.println("Area: " + r2.calculateArea()); // Expected: 50.0
        System.out.println("Perimeter: " + r2.calculatePerimeter()); // Expected: 30.0

        // 3. Testing Mutators (Setters)
        System.out.println("\n[Test 3] Updating Dimensions (Rectangle 1):");
        r1.setWidth(4.5);
        r1.setLength(2.0);
        System.out.println("After Update: " + r1.toString());
        System.out.println("New Area: " + r1.calculateArea()); // Expected: 9.0

        // 4. Testing Equality
        System.out.println("\n[Test 4] Equality Check:");
        System.out.println("Is r2 equal to r3? " + r2.equals(r3)); // Expected: true

        Rectangle r4 = new Rectangle(10.0, 5.0);
        System.out.println("Is r2 (5x10) equal to r4 (10x5)? " + r2.equals(r4));
        // Note: Returns false based on current logic

        // 5. Practical Logic Test
        System.out.println("\n[Test 5] Zero Dimension Test:");
        Rectangle r5 = new Rectangle(0, 10);
        System.out.println("Rectangle with width 0: Area = " + r5.calculateArea());
        // Expected: 0.0

        System.out.println("\n=== ALL TESTS COMPLETED ===");
    }
}