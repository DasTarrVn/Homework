import java.util.*;

//Lab1_10
public class SumFirstAndLastDigitProg {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("Sum of first and last digit is: " + sumFirstLastDigit(n));
    }

    public static int sumFirstLastDigit(int n) {
        int lastDigit = n % 10;
        while (n > 9) {
            n = n / 10;
        }
        int firstDigit = n;
        return firstDigit + lastDigit;
    }
}
