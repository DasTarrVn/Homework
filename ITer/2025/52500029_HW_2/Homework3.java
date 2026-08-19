import java.util.*;

public class Homework3 {

    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            sc.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element of [%d]: ", i + 1);
            arr[i] = sc.nextInt();
        }
        int[] output = processArray(arr);
        sc.close();
        System.out.println("Input:  " + java.util.Arrays.toString(arr));
        System.out.println("Output: " + java.util.Arrays.toString(output));
    }

    public static int[] processArray(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            int currentVal = list[i];
            currentVal = Math.abs(currentVal);
            if (currentVal % 2 == 0) {
                currentVal = currentVal * 2;
            }
            result[i] = currentVal;
        }
        return result;
    }
}