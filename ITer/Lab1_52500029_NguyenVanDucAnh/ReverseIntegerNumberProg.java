import java.util.Scanner;

//Lab1_12
public class ReverseIntegerNumberProg {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.printf("Reverse Number: %d\n", reverseNumber(n));
    }

    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            reverse = reverse * 10 + digit;
        }
        return reverse;
    }
}
