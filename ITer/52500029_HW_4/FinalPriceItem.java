import java.util.*;
import java.text.DecimalFormat;

public class FinalPriceItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original price: ");
        double og = sc.nextDouble();
        System.out.print("Enter discount rate: ");
        double discount = sc.nextDouble();
        System.out.print("Enter tax rate: ");
        double taxRate = sc.nextDouble();
        sc.close();
        // price format
        DecimalFormat dfPrice = new DecimalFormat("$#,##0.00");

        // percent format
        DecimalFormat dfPercent = new DecimalFormat("0%");
        // Receipt
        System.out.println("---Receipt---");
        System.out.println("Discount Rate: " + dfPercent.format(discount));
        System.out.println("Total Price: " + dfPrice.format(calPrice(og, discount, taxRate)));
    }

    public static double calPrice(double og, double discount, double taxRate) {
        og = og * (1 - discount);
        return og * (1 + taxRate);
    }
}
