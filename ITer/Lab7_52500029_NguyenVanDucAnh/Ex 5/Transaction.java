public class Transaction {
    private PaymentMethod paymentMethod;
    private double amount;

    public Transaction(PaymentMethod paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public boolean execute() {
        return paymentMethod.processPayment(amount);
    }

    public boolean issueRefund() {
        if (paymentMethod instanceof Refundable) {
            Refundable refundableMethod = (Refundable) paymentMethod;
            return refundableMethod.refund(amount);
        }
        System.out.println("Error");
        return false;
    }

    public String getPaymentDetails() {
        return paymentMethod.getPaymentDetails();
    }

    public double getBalance() {
        return paymentMethod.getBalance();
    }
}