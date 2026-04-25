import java.util.*;

public class FindMinArray {

    public static int findMin(int[] arr) {
        if(arr.length == 0)
            return -1;
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

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
        sc.close();

        // 5. Call findMin function
        int minElement = findMin(arr);
        System.out.println("Min = " + minElement);
	}
}