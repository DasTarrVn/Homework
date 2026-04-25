import java.util.*;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int reverse;
        if (n == 0) {
            System.out.println("0");
        }
        while (n != 0) {
            reverse = n % 10;
            System.out.print(reverse);
            n /= 10;
        }
        sc.close();
    }
}