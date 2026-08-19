public class CurrencyConverter {
    private double amount;
    private String currencyCode;

    // Constructor
    public CurrencyConverter() {
        amount = 0.0;
        currencyCode = "VND";
    }

    public CurrencyConverter(double amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public CurrencyConverter(CurrencyConverter other) {
        this.amount = other.amount;
        this.currencyCode = other.currencyCode;
    }

    // Getter
    public double getAmount() {
        return this.amount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    // Setter
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    // Method
    public double toUSD() {
        if (this.currencyCode.equals("VND"))
            return amount * 0.000038;
        if (this.currencyCode.equals("EUR"))
            return amount * 1.19;
        return amount;
    }

    public double toEUR() {
        if (this.currencyCode.equals("VND"))
            return amount * 0.000032;
        if (this.currencyCode.equals("USD"))
            return amount * 0.84;
        return amount;
    }

    public String toString() {
        return "Currency[amount=" + amount + ",currencyCode=" + currencyCode + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof CurrencyConverter) {
            CurrencyConverter other = (CurrencyConverter) obj;
            return this.getAmount() == other.getAmount() && this.getCurrencyCode().equals(other.getCurrencyCode());
        } else {
            return false;
        }
    }

}
