import java.util.*;

public class TestBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] inventory = new Book[10];
        inventory[0] = new Book("Java Basics", 150.0, 10);
        inventory[1] = new Book("Clean Code", 200.0, 5);
        inventory[2] = new Book("Design Patterns", 250.0, 8);
        inventory[3] = new Book("Data Structures", 180.0, 15);
        inventory[4] = new Book("Algorithms", 220.0, 3);
        inventory[5] = new Book("Database Design", 190.0, 12);
        inventory[6] = new Book("Web Development", 160.0, 20);
        inventory[7] = new Book("Machine Learning", 300.0, 4);
        inventory[8] = new Book("Operating Systems", 210.0, 7);
        inventory[9] = new Book("Computer Networks", 170.0, 9);
        int bought = 0;
        double totalCost = 0;
        System.out.println("=== BOOK LIST ===");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ". " + inventory[i].toString());
        }
        System.out.println("\n=== START SHOPPING (Max 4 types of books) ===");
        while (bought < 4) {
            System.out.println("\nItem " + (bought + 1) + " (Enter -1 to stop buying):");
            System.out.print("Enter book ID (0-9): ");
            int bookIndex = sc.nextInt();
            if (bookIndex == -1) {
                break;
            }
            if (bookIndex < 0 || bookIndex > 9) {
                System.out.println("Error: Book ID does not exist. Please try again.");
                continue;
            }
            System.out.print("Enter quantity to buy: ");
            int buyQty = sc.nextInt();
            Book selectedBook = inventory[bookIndex];
            if (buyQty <= 0) {
                System.out.println("Error: Buy quantity must be greater than 0.");
            } else if (buyQty > selectedBook.getQty()) {
                System.out.println("Error: Buy quantity exceeds inventory (In stock: " + selectedBook.getQty() + ").");
            } else {
                double cost = selectedBook.getPrice() * buyQty;
                totalCost += cost;
                selectedBook.setQty(selectedBook.getQty() - buyQty);
                bought++;
            }
        }
        System.out.println("\n==================================");
        System.out.println("SHOPPING COMPLETED!");
        System.out.println("Total amount to pay: " + totalCost);
        System.out.println("==================================");
        sc.close();
    }
}
