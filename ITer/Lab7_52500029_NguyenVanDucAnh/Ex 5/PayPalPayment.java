public class PayPalPayment extends PaymentMethod {
    private String email;

    public PayPalPayment(String email, double balance) {
        super(balance);
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal [Email: " + email + "]";
    }
}