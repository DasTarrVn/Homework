public class TestWallet {
    public static void main(String[] args) {
        System.out.println("=== WALLET CLASS TEST SUITE ===");

        // 1. Testing Constructors
        Wallet w1 = new Wallet(); // Default: Human1, 0.0, false
        Wallet w2 = new Wallet("User123", 500.0, false);
        Wallet w3 = new Wallet(w2); // Copy of w2

        System.out.println("\n[Test 1] Initialization:");
        System.out.println("Default Wallet: " + w1.toString());
        System.out.println("Custom Wallet:  " + w2.toString());
        System.out.println("Copied Wallet:  " + w3.toString());

        // 2. Testing Deposit
        System.out.println("\n[Test 2] Deposit functionality:");
        w1.deposit(150.0);
        System.out.println("Deposit 150.0 into Default Wallet: " + w1.getBalance());
        // Expected: 150.0

        // 3. Testing Withdrawal
        System.out.println("\n[Test 3] Withdrawal functionality:");
        w2.withdraw(200.0);
        System.out.println("Withdraw 200.0 from w2 (500.0 balance): " + w2.getBalance());
        // Expected: 300.0

        w2.withdraw(1000.0);
        System.out.println("Withdraw 1000.0 (Insufficient funds): " + w2.getBalance());
        // Expected: 300.0 (No change)

        // 4. Testing Locking Mechanism
        System.out.println("\n[Test 4] Lock/Unlock Mechanism:");
        w1.lock();
        System.out.println("Wallet 1 status: locked = " + w1.getIsLocked());

        w1.deposit(50.0);
        System.out.println("Deposit 50.0 while locked: " + w1.getBalance());
        // Expected: 150.0 (No change)

        w1.unlock();
        w1.deposit(50.0);
        System.out.println("Deposit 50.0 after unlocking: " + w1.getBalance());
        // Expected: 200.0

        // 5. Testing Equality
        System.out.println("\n[Test 5] Equality Check:");
        Wallet w4 = new Wallet("User123", 300.0, false);
        System.out.println("Is w2 equal to w4? " + w2.equals(w4));
        // Expected: true (both are User123, 300.0, unlocked)

        System.out.println("Is w1 equal to w2? " + w1.equals(w2));
        // Expected: false

        // 6. Testing Setters
        System.out.println("\n[Test 6] Setters:");
        w1.setOwnerId("Human2");
        System.out.println("Updated w1 Owner: " + w1.getOwnerId());

        System.out.println("\n=== ALL TESTS COMPLETED ===");
    }
}