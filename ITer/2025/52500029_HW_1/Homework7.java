import java.util.*;

public class Homework7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Iterative way: " + fibIterative(n));
        System.out.println("Recursion way: " + fibRecursive(n));
    }

    public static int fibIterative(int n) {
        if (n <= 1)
            return n;
        int prev = 0, curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static int fibRecursive(int n) {
        if (n <= 1)
            return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

}