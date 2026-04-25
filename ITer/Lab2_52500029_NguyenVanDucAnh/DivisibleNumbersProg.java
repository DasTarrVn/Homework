package Lab2_52500029_NguyenVanDucAnh;
import java.util.*;

//Lab2 a8
public class DivisibleNumbersProg {
    public static void main(String[] args) {
        // 1. Define Scanner object
        Scanner sc = new Scanner(System.in);

        // 2. Enter array size and validate it
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be a positive integer.");
            sc.close();
            return;
        }

        // 3. Enter array's elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // 4. Close Scanner object

        System.out.print("Enter a number you want to divisible: ");
        int k = sc.nextInt();
        sc.close();
        int[] result = divisibleNumbers(arr, k);

        if (result.length == 0) {
            System.out.printf("No element in the array is divisible by %d", k);
        } else {
            System.out.println("Divisible numbers: " + Arrays.toString(result));
        }
    }

    public static int[] divisibleNumbers(int arr[], int k) {
        int count = 0;
        for (int i : arr) {
            if (i % k == 0) {
                count++;
            }
        }
        if (count == 0) {
            return new int[0];

        }
        int[] result = new int[count];
        int j = 0;
        for (int i : arr) {
            if (i % k == 0) {
                result[j] = i;
                j = j + 1;
            }
        }
        return result;
    }
}