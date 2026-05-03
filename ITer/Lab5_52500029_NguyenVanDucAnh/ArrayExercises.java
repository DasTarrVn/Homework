import java.util.Scanner;

public class ArrayExercises {
    public static int maxEven(int[] a) {
        int max = Integer.MIN_VALUE;
        boolean found = false;
        for (int x : a) {
            if (x % 2 == 0 && x > max) {
                max = x;
                found = true;
            }
        }
        return found ? max : -1;
    }

    public static int minOdd(int[] a) {
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for (int x : a) {
            if (x % 2 != 0 && x < min) {
                min = x;
                found = true;
            }
        }
        return found ? min : -1;
    }

    public static int sumMEMO(int[] a) {
        return maxEven(a) + minOdd(a);
    }

    public static int sumEven(int[] a) {
        int sum = 0;
        for (int x : a)
            if (x % 2 == 0)
                sum += x;
        return sum;
    }

    public static int prodOdd(int[] a) {
        int prod = 1;
        boolean found = false;
        for (int x : a) {
            if (x % 2 != 0) {
                prod *= x;
                found = true;
            }
        }
        return found ? prod : 0;
    }

    public static int idxFirstEven(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                return i;
        }
        return -1;
    }

    public static int idxLastOdd(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 != 0)
                return i;
        }
        return -1;
    }

    public static int[] input(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input element " + i + ": ");
            a[i] = sc.nextInt();
            sc.close();
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] a = input(n);
        System.out.println("1. maxEven: " + maxEven(a));
        System.out.println("2. minOdd: " + minOdd(a));
        System.out.println("3. sumMEMO: " + sumMEMO(a));
        System.out.println("4. sumEven: " + sumEven(a));
        System.out.println("5. prodOdd: " + prodOdd(a));
        System.out.println("6. idxFirstEven: " + idxFirstEven(a));
        System.out.println("7. idxLastOdd: " + idxLastOdd(a));
        sc.close();
    }

}