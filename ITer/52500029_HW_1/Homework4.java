import java.util.*;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        int total = 0;
        if (n == 0) {
            System.out.print("0");
        }
        while (n != 0) {
            total = total + (n % 10);
            n /= 10;
        }
        System.out.println("Sum of digits: " + total);
    }
}