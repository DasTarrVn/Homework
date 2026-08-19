public class Product {
    protected String name;
    protected double basePrice;
    protected int stock;
    protected double promotionDiscount;

    public Product(String name, double basePrice, int stock, double promotionDiscount) {
        this.name = name;
        this.basePrice = basePrice;
        this.stock = stock;
        this.promotionDiscount = promotionDiscount;
    }

    public double calculateFinalPrice() {
        return basePrice * (1.0 - promotionDiscount / 100.0);
    }

    public boolean sellItem(int quantity) {
        if (this.stock >= quantity) {
            this.stock -= quantity;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", basePrice=" + basePrice + ", stock=" + stock
                + ", promotionDiscount=" + promotionDiscount + "]";
    }
}