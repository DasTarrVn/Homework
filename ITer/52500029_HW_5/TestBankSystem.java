public class TestBankSystem {
    public static void main(String[] args) {
        System.out.println("=== BANKING SYSTEM TEST SUITE ===");

        // 1. Testing Constructors
        BankSystem acc1 = new BankSystem(); // Default: Account1, User1, 0.0
        BankSystem acc2 = new BankSystem("VND12345", "Nguyen Van A", 5000.0);

        System.out.println("\n[Test 1] Initialization:");
        System.out.println("Default Account: " + acc1.toString());
        System.out.println("Custom Account:  " + acc2.toString());

        // 2. Testing deposit(double amount)
        System.out.println("\n[Test 2] Simple Deposit:");
        acc2.deposit(1500.0);
        System.out.println("After depositing 1500.0: Balance = " + acc2.getBalance());
        // Expected: 5000 + 1500 = 6500.0

        // 3. Testing deposit(double amount, String note)
        System.out.println("\n[Test 3] Deposit with Note:");
        acc2.deposit(2000.0, "Salary for February");
        System.out.println("After depositing 2000.0 with note: Balance = " + acc2.getBalance());
        // Expected: 6500 + 2000 = 8500.0

        // 4. Testing Equality
        System.out.println("\n[Test 4] Equality Check:");
        BankSystem acc3 = new BankSystem("VND12345", "Nguyen Van A", 8500.0);
        System.out.println("Is acc2 equal to acc3? " + acc2.equals(acc3));
        // Expected: true (Same account info and current balance)

        // 5. Testing Setters
        System.out.println("\n[Test 5] Using Setters:");
        acc1.setOwnerName("Tran Thi B");
        acc1.setBalance(100.0);
        System.out.println("Updated acc1: " + acc1.toString());

        System.out.println("\n=== ALL TESTS COMPLETED ===");
    }
}