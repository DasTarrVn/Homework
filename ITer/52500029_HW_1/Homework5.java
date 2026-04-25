import java.util.*;

public class Homework5 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // System.out.print("Enter n: ");
        int n = sc.nextInt();
        boolean check = isPrime(n);
        if (check == true) {
            System.out.print(n + " is a Prime number\n");
        } else {
            System.out.print(n + " is not a Prime number\n");
        }
        sc.close();
    }
}
