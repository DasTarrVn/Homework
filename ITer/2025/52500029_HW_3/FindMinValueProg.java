import java.util.*;

public class FindMinValueProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be a positive integer.");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Number of Prime Number is: " + countPrimeNum(arr));

    }

    public static int countPrimeNum(int arr[]) {
        int count = 0;
        for (int i : arr) {
            if (i < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }
}
