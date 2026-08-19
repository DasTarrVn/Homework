import java.util.Scanner;

public class CalculateErf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        double result = calculateErf(x);
        System.out.println("erf(" + x + ") = " + result);
        sc.close();
    }

    public static double calculateErf(double x) {
        double sum = 0;
        for (int n = 0; n < 20; n++) {
            double nume = Math.pow(-1, n) * Math.pow(x, 2 * n + 1);
            double deno = factorial(n) * (2 * n + 1);
            sum += nume / deno;
        }
        return (2 / Math.sqrt(Math.PI)) * sum;
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}