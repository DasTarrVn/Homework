import java.util.*;

public class VendingMachineProg {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("\n=== MENU ===");
            System.out.println("1. Coca");
            System.out.println("2. Pepsi");
            System.out.println("3. Sprite");
            System.out.println("4. Snack");
            System.out.println("5. Shutdown Machine");
            System.out.println("Please enter the number:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    calculate(sc, 10, "Coca");
                    break;
                case 2:
                    calculate(sc, 11, "Pepsi");

                    break;
                case 3:
                    calculate(sc, 14, "Sprite");

                    break;
                case 4:
                    calculate(sc, 5, "Snack");

                    break;
                case 5:
                    System.out.println("Machine is shutting down.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }

        }
    }

    public static void calculate(Scanner sc, int n, String item) {
        System.out.printf("The price of %s is: %d$, please enter the amount of money:\n", item, n);
        double money = sc.nextDouble();
        if (money == n) {
            System.out.print("Thanks for buying an item!");
        } else if (money < n) {
            System.out.print("Not enough money to buy this item. Please select again");
        } else {
            System.out.print("Your change is: " + (float) (money - n) + "$");
        }
        return;
    }
}
