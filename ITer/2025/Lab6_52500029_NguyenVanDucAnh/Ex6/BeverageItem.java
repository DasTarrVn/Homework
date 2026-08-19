public class BeverageItem extends Product {
    private char size;

    public BeverageItem(String name, double basePrice, int stock, double promotionDiscount, char size) {
        super(name, basePrice, stock, promotionDiscount);
        this.size = size;
    }

    @Override
    public double calculateFinalPrice() {
        double price = super.calculateFinalPrice();
        if (size == 'M') {
            price += 3000.0;
        } else if (size == 'L') {
            price += 6000.0;
        }
        return price;
    }
}