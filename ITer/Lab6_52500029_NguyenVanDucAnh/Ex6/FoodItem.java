public class FoodItem extends Product {
    private boolean isHot;

    public FoodItem(String name, double basePrice, int stock, double promotionDiscount, boolean isHot) {
        super(name, basePrice, stock, promotionDiscount);
        this.isHot = isHot;
    }

    @Override
    public double calculateFinalPrice() {
        double price = super.calculateFinalPrice();
        if (isHot) {
            price += 5000.0;
        }
        return price;
    }
}