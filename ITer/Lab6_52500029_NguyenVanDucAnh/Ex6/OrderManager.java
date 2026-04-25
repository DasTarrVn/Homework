public class OrderManager {
    private Product[] inventory;

    public OrderManager(Product[] inventory) {
        this.inventory = inventory;
    }

    public Product findProduct(String name) {
        for (Product p : inventory) {
            if (p != null && p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public double processOrder(String[] orderNames, int[] quantities) {
        double totalCost = 0.0;
        boolean hasHamSandwich = false;
        boolean hasVietnameseIcedCoffee = false;
        double coffeePrice = 0.0;

        for (int i = 0; i < orderNames.length; i++) {
            Product p = findProduct(orderNames[i]);
            if (p != null) {
                int qty = quantities[i];
                if (p.sellItem(qty)) {
                    double itemTotal = p.calculateFinalPrice() * qty;
                    totalCost += itemTotal;

                    if (p.getName().equals("Ham Sandwich")) {
                        hasHamSandwich = true;
                    }
                    if (p.getName().equals("Vietnamese Iced Coffee")) {
                        hasVietnameseIcedCoffee = true;
                        coffeePrice = p.calculateFinalPrice(); // Lưu lại giá 1 ly để trừ
                    }
                }
            }
        }

        if (hasHamSandwich && hasVietnameseIcedCoffee) {
            totalCost -= coffeePrice;
        }

        return totalCost;
    }
}