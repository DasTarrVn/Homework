public class BankSystem {
    private String bankAccount;
    private String ownerName;
    private double balance;

    public BankSystem() {
        bankAccount = "Account1";
        ownerName = "User1";
        balance = 0.0;
    }

    public BankSystem(String bankAccount, String ownerName, double balance) {
        this.bankAccount = bankAccount;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public BankSystem(BankSystem other) {
        this.bankAccount = other.bankAccount;
        this.ownerName = other.ownerName;
        this.balance = other.balance;
    }

    // getter
    public String getBankAccount() {
        return bankAccount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    // setter
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "BankSystem[bankAccount=" + bankAccount + ",ownerName=" + ownerName + ",balance=" + balance + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof BankSystem) {
            BankSystem other = (BankSystem) obj;
            return this.getBalance() == other.getBalance() &&
                    this.getBankAccount().equals(other.getBankAccount()) &&
                    this.getOwnerName().equals(other.getOwnerName());
        } else {
            return false;
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void deposit(double amount, String note) {
        this.balance += amount;
        System.out.println("Note: " + note);
    }
}
