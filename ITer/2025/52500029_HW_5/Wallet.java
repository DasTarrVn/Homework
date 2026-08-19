public class Wallet {
    // attribute
    private String ownerId;
    private double balance;
    private boolean isLocked;

    // Constructor
    public Wallet() {
        ownerId = "Human1";
        balance = 0.0;
        isLocked = false;
    }

    public Wallet(String ownerId, double balance, boolean isLocked) {
        this.ownerId = ownerId;
        this.balance = balance;
        this.isLocked = isLocked;

    }

    public Wallet(Wallet other) {
        this.ownerId = other.ownerId;
        this.balance = other.balance;
        this.isLocked = other.isLocked;
    }

    // getter
    public String getOwnerId() {
        return ownerId;

    }

    public double getBalance() {
        return balance;

    }

    public boolean getIsLocked() {
        return isLocked;
    }

    // setter
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    // toString
    public String toString() {
        return "Wallet[ownerID=" + getOwnerId() + ",balance=" + getBalance() + ",status=" + getIsLocked() + "]";
    }

    // equals
    public boolean equals(Object obj) {
        if (obj instanceof Wallet) {
            Wallet other = (Wallet) obj;
            return this.getOwnerId().equals(other.getOwnerId()) &&
                    this.getBalance() == other.getBalance() &&
                    this.getIsLocked() == other.getIsLocked();
        } else
            return false;
    }

    // method
    public void deposit(double amount) {
        if (getIsLocked() == false && amount > 0.0) {
            setBalance(getBalance() + amount);
        }
    }

    public void withdraw(double amount) {
        if (getIsLocked() == false && amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }
    }

    public void lock() {
        setIsLocked(true);
    }

    public void unlock() {
        setIsLocked(false);
    }
}
