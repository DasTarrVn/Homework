import java.util.*;
import java.text.DecimalFormat;

public class SavingsInterestCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double og = sc.nextDouble();
        System.out.print("Annual interest rate: ");
        double interestRate = sc.nextDouble();
        sc.close();
        // Final Result
        DecimalFormat dfResult = new DecimalFormat("$#,##0.00");
        System.out.println("Total after one year " + dfResult.format(SavingsInterestCal.totalCal(og, interestRate)));
    }

    public static double totalCal(double og, double interestRate) {
        return og + (1 + interestRate);
    }
}
