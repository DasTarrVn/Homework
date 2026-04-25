public class TestBook {
    public static void main(String[] args) {
        System.out.println("=== BOOK MANAGEMENT SYSTEM TEST ===");

        // 1. Testing Constructors
        Book book1 = new Book(); // Default
        Book book2 = new Book("B100", "Clean Code", "Robert C. Martin", 50.0);
        Book book3 = new Book(book2); // Copy of book2

        System.out.println("\n[Test 1] Initialization:");
        System.out.println("Book 1 (Default): " + book1.toString());
        System.out.println("Book 2 (Custom):  " + book2.toString());
        System.out.println("Book 3 (Copy):    " + book3.toString());

        // 2. Testing applyDiscount
        System.out.println("\n[Test 2] Applying Discount:");
        double discountPercent = 20.0;
        book2.applyDiscount(discountPercent);
        System.out.println("Book 2 after " + discountPercent + "% discount: " + book2.getPrice());
        // Expected: 50.0 - (50.0 * 0.2) = 40.0

        // 3. Testing comparePrice
        System.out.println("\n[Test 3] Price Comparison:");
        System.out.print(
                "Comparing Book 1 (" + book1.getPrice() + ") and Book 2 (" + book2.getPrice() + "). Higher price is: ");
        book1.comparePrice(book2);
        // Expected: Should print Book 2's info if Book 1 is 0.0

        // 4. Testing Equality
        System.out.println("\n[Test 4] Equality Check:");
        System.out.println("Is Book 2 equal to Book 3? " + book2.equals(book3));
        // Note: This might be false because book2's price changed after discount!

        // 5. Testing Setters
        System.out.println("\n[Test 5] Updating Book Info:");
        book1.setBookID("B999");
        book1.setTitle("Effective Java");
        book1.setPrice(45.0);
        System.out.println("Updated Book 1: " + book1.toString());

        System.out.println("\n=== ALL TESTS COMPLETED ===");
    }
}