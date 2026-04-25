import java.util.*;

public class FindSecondLargestNumber {
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
        int result = findSecondLargestNumber(arr);
        if (result == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("The second largest number in array is: " + result);
        }
    }

    public static int findSecondLargestNumber(int arr[]) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                second = max;
                max = i;
            } else if (i != max && i > second) {
                second = i;
            }
        }
        return second;
    }
}
