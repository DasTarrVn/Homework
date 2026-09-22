public class Ex6 {

    // (a)
    public static int findMin(int[] arr, int n) {
        if (arr == null || n <= 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // (b)
    public static int sumArray(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // (c)
    public static int countEven(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = { 12, 5, 8, 3, 14, 7, 2 };
        int n = a.length;

        System.out.println(findMin(a, n)); // 2
        System.out.println(sumArray(a, n)); // 51
        System.out.println(countEven(a, n)); // 4 (12, 8, 14, 2)
    }
}