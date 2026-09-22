import java.util.Arrays;

public class Ex1 {
    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = a[minIdx];
            a[minIdx] = a[i];
            a[i] = temp;
        }
        return;
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                return;
            }
        }

    }

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            int pos = i - 1;
            while (pos >= 0 && x < a[pos]) {
                a[pos + 1] = a[pos];
                pos--;
            }
            a[pos + 1] = x;
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSort(arr, first, middle);
            mergeSort(arr, middle + 1, last);
            merge(arr, first, middle, last);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 36, 24, 10, 6, 12 };
        selectionSort(arr1);
        System.out.println("Selection Sort: " + Arrays.toString(arr1));

        int[] arr2 = { 36, 24, 10, 6, 12 };
        bubbleSort(arr2);
        System.out.println("Bubble Sort:    " + Arrays.toString(arr2));

        int[] arr3 = { 36, 24, 10, 6, 12 };
        insertionSort(arr3);
        System.out.println("Insertion Sort: " + Arrays.toString(arr3));

        int[] arr4 = { 38, 27, 43, 3, 9, 82, 10 };
        mergeSort(arr4, 0, arr4.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(arr4));

        int[] arr5 = { 3, 7, 8, 5, 2, 1, 9, 5, 4 };
        quickSort(arr5, 0, arr5.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(arr5));
    }
}