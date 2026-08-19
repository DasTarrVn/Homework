public abstract class PaymentMethod {
    protected double balance;

    public PaymentMethod(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean processPayment(double amount);

    public abstract String getPaymentDetails();
}