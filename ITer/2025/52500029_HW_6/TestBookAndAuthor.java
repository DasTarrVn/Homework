public class TestBookAndAuthor {
    public static void main(String[] args) {
        System.out.println("=== TESTING AUTHOR CLASS ===");
        Author author1 = new Author("John Doe", 1980);
        System.out.println("Author 1 created: " + author1.toString());
        Author author2 = new Author();
        author2.setFullname("Jane Smith");
        author2.setBirthyear(1995);
        System.out.println("Author 2 created: " + author2.toString());
        // System.out.println("\n=== TESTING BOOK CLASS CONSTRUCTORS ===");
        Book book1 = new Book("Java Programming", 50.0, 10);
        book1.setAuthor(author1); // Inject author into book
        System.out.println("Book 1 (Original): " + book1.toString());
        Book book2 = new Book(book1);
        System.out.println("Book 2 (Copied from Book 1): " + book2.toString());
        Book book3 = new Book();
        book3.setTitle("Python Basics");
        book3.setPrice(30.0);
        book3.setQty(5);
        book3.setAuthor(author2);
        System.out.println("Book 3 (Default + Setters): " + book3.toString());
        System.out.println("\n=== TESTING EQUALS METHOD ===");
        boolean isOneEqualToTwo = book1.equals(book2);
        System.out.println("Is Book 1 equal to Book 2? -> " + isOneEqualToTwo + " (Expected: true)");
        boolean isOneEqualToThree = book1.equals(book3);
        System.out.println("Is Book 1 equal to Book 3? -> " + isOneEqualToThree + " (Expected: false)");
        System.out.println("\n=== TESTING DISCOUNT METHOD ===");
        double discountAmount = book1.getDiscount(15);
        System.out.println("15% discount amount for Book 1 ($50.0): $" + discountAmount + " (Expected: $7.5)");
    }
}