import java.util.Scanner;

public class CalculateSin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        double result = calculateSin(x);
        System.out.println("Right-hand side: " + result);
        sc.close();
    }

    public static double calculateSin(double x) {
        double sum = 0;
        double term = x;
        int n = 1;
        for (int i = 1; i <= 20; i++) {
            sum += term;
            term = -term * x * x / ((2 * n) * (2 * n + 1));
            n++;
        }
        return sum;
    }
}