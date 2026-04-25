public class SevenElevenOrderManager {
    public static void main(String[] args) {
        Product[] inventory = new Product[6];
        inventory[0] = new FoodItem("Grilled Chicken Sandwich", 45000, 10, 0, true);
        inventory[1] = new FoodItem("Ham Sandwich", 30000, 15, 0, false);
        inventory[2] = new FoodItem("Sweet Pastry", 17000, 20, 0, false);
        inventory[3] = new BeverageItem("Vietnamese Iced Coffee", 35000, 30, 10, 'M');
        inventory[4] = new BeverageItem("Green Tea", 28000, 25, 5, 'S'); // 'S' vì không có phụ phí (None)
        inventory[5] = new BeverageItem("Orange Juice", 24000, 20, 0, 'L');

        OrderManager manager = new OrderManager(inventory);

        String[] orderNames = {
                "Grilled Chicken Sandwich",
                "Ham Sandwich",
                "Sweet Pastry",
                "Vietnamese Iced Coffee",
                "Green Tea"
        };
        int[] quantities = { 2, 3, 4, 2, 3 };

        double totalCost = manager.processOrder(orderNames, quantities);

        System.out.println("Total Cost: " + totalCost + " VND");
        for (Product p : inventory) {
            System.out.println(p.toString());
        }
    }
}