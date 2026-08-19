import java.util.*;

//Lab1_9
public class HailstoneProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        hailstone(n);
    }

    public static void hailstone(int n) {
        if (n < 1) {
            System.out.println("This is not a positive number!");
            return;
        }
        while (n != 1)
            if (n % 2 == 0) {
                int temp = n;
                n /= 2;
                System.out.printf("%d is even, so we take n/2: %d\n", temp, n);
            } else {
                int temp = n;
                n = 3 * n + 1;
                System.out.printf("%d is odd, so we take 3*n+1: %d\n", temp, n);
            }
    }
}
