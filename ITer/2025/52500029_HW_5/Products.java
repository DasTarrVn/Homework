public class Products {
    private double basePrice;
    private String productName;

    public Products() {
        this.basePrice = 0.0;
        this.productName = "OOP1";
    }

    public Products(double basePrice, String productName) {
        this.basePrice = basePrice;
        this.productName = productName;
    }

    public Products(Products other) {
        this.basePrice = other.basePrice;
        this.productName = other.productName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Products[productName=" + productName + ", basePrice=" + basePrice + " ]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Products) {
            Products other = (Products) obj;
            return this.getBasePrice() == other.getBasePrice() &&
                    this.getProductName().equals(other.getProductName());
        } else {
            return false;
        }
    }

    public double calculatePrice(int quantity) {
        return basePrice * quantity;
    }

    public double calculatePrice(int quantity, double discount) {
        double total = quantity * basePrice;
        return total * (1 - discount / 100);
    }

}
