import java.util.*;

//Homework1
public class Homework1 {
    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            sc.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element of [%d]: ", i + 1);
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Average of the elements is: " + average(arr));
        System.out.println("Median of the elements is: " + median(arr));
    }

    public static double average(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return (double) sum / arr.length;
    }

    public static double median(int[] arr) {
        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);
        if (arr.length % 2 == 1) {
            return arr[arr.length / 2];
        } else {
            return (double) (arr[(arr.length / 2)] + arr[((arr.length / 2) - 1)]) / 2;
        }
    }
}
