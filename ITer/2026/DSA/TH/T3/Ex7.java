public class Ex7 {

    // (a)
    public static int findMinRecursive(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMinRecursive(arr, n - 1));
    }

    // (b)
    public static int sumArrayRecursive(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + sumArrayRecursive(arr, n - 1);
    }

    // (c)
    public static int countEvenRecursive(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        int isEven = (arr[n - 1] % 2 == 0) ? 1 : 0;
        return isEven + countEvenRecursive(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 8, 3, 14, 7, 2 };
        int n = arr.length;
        System.out.println(findMinRecursive(arr, n)); // 2
        System.out.println(sumArrayRecursive(arr, n)); // 51
        System.out.println(countEvenRecursive(arr, n)); // 4 (12, 8, 14, 2)
    }
}