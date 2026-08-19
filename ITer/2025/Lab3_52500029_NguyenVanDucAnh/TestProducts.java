public class TestProducts {
    public static void main(String[] args) {
        System.out.println("=== PRODUCT MANAGEMENT SYSTEM TEST ===");

        // 1. Testing Constructors
        Products p1 = new Products(); // Default: OOP1, 0.0
        Products p2 = new Products(150.0, "Java Book");
        Products p3 = new Products(p2); // Copy of p2

        System.out.println("\n[Test 1] Object Initialization:");
        System.out.println("Product 1 (Default): " + p1.toString());
        System.out.println("Product 2 (Custom):  " + p2.toString());
        System.out.println("Product 3 (Copy):    " + p3.toString());

        // 2. Testing calculatePrice(int quantity)
        System.out.println("\n[Test 2] Basic Price Calculation (No Discount):");
        int qty1 = 5;
        double basicPrice = p2.calculatePrice(qty1);
        System.out.println("Price for " + qty1 + " '" + p2.getProductName() + "': " + basicPrice);
        // Expected: 150.0 * 5 = 750.0

        // 3. Testing calculatePrice(int quantity, double discount)
        System.out.println("\n[Test 3] Price Calculation with Discount:");
        int qty2 = 10;
        double discount = 20.0; // 20% discount
        double discountedPrice = p2.calculatePrice(qty2, discount);
        System.out.println("Price for " + qty2 + " '" + p2.getProductName() + "' with " + discount + "% discount: "
                + discountedPrice);
        // Expected: (150.0 * 10) * (1 - 0.2) = 1200.0

        // 4. Testing Equality
        System.out.println("\n[Test 4] Equality Test:");
        System.out.println("Is Product 2 equal to Product 3? " + p2.equals(p3)); // Should be true
        System.out.println("Is Product 1 equal to Product 2? " + p1.equals(p2)); // Should be false

        // 5. Testing Setters and Getters
        System.out.println("\n[Test 5] Updating Product Info:");
        p1.setProductName("Laptop");
        p1.setBasePrice(1200.0);
        System.out.println("Updated Product 1: " + p1.getProductName() + " costs $" + p1.getBasePrice());

        System.out.println("\n=== ALL TESTS COMPLETED ===");
    }
}