/**
 * ============================================================
 * ĐỀ BÀI - Câu 1 (4 điểm) [Sorting - Lab 4]
 * ============================================================
 *
 * Trong lớp Cau1, sinh viên hiện thực các thuật toán sắp xếp đã học.
 * Tất cả các phương thức sort trực tiếp sửa mảng arr (không trả về giá trị).
 *
 * Định nghĩa các phương thức:
 *
 * 1. selectionSort(int[] arr)
 * Sắp xếp mảng tăng dần bằng thuật toán Selection Sort.
 * Ý tưởng: Tìm phần tử nhỏ nhất trong phần chưa sắp xếp,
 * đổi chỗ với phần tử đầu tiên của phần chưa sắp xếp.
 *
 * 2. bubbleSort(int[] arr)
 * Sắp xếp mảng tăng dần bằng thuật toán Bubble Sort.
 * Ý tưởng: So sánh và đổi chỗ các cặp phần tử liền kề nếu sai thứ tự.
 *
 * 3. insertionSort(int[] arr)
 * Sắp xếp mảng tăng dần bằng thuật toán Insertion Sort.
 * Ý tưởng: Chèn từng phần tử vào đúng vị trí trong phần đã sắp xếp.
 *
 * 4. countSwaps(int[] arr)
 * Trả về số lần đổi chỗ (swap) trong thuật toán Bubble Sort
 * khi sắp xếp mảng arr.
 * LƯU Ý: KHÔNG được sửa mảng arr gốc! Hãy tạo bản sao trước.
 */
public class Cau1 {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static int countSwaps(int[] arr) {
        int[] copy = copyArray(arr);
        int count = 0;
        int n = copy.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (copy[j] > copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                    count++;
                }
            }
        }
        return count;
    }

    public static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1)
                sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    public static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            copy[i] = arr[i];
        return copy;
    }

    public static void main(String[] args) {
        int[] original = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("=== Selection Sort ===");
        int[] a1 = copyArray(original);
        selectionSort(a1);
        printArray(a1);
        // Ky vong: 11 12 22 25 34 64 90

        System.out.println("=== Bubble Sort ===");
        int[] a2 = copyArray(original);
        bubbleSort(a2);
        printArray(a2);
        // Ky vong: 11 12 22 25 34 64 90

        System.out.println("=== Insertion Sort ===");
        int[] a3 = copyArray(original);
        insertionSort(a3);
        printArray(a3);
        // Ky vong: 11 12 22 25 34 64 90

        System.out.println("=== Count Swaps ===");
        int[] a4 = { 4, 3, 1, 2 };
        System.out.println("countSwaps({4,3,1,2}) = " + countSwaps(a4));
        // Ky vong: 5
        // Vong 1: (4>3)swap, (4>1)swap, (4>2)swap → 3 swaps
        // Vong 2: (3>1)swap, (3>2)swap → 2 swaps
        // Tong: 5

        int[] a5 = { 1, 2, 3, 4 };
        System.out.println("countSwaps({1,2,3,4}) = " + countSwaps(a5));
        // Ky vong: 0 (da sap xep)

        // Kiem tra mang goc khong bi sua
        printArray(a4);
        // Ky vong: 4 3 1 2 (giu nguyen)
    }
}
