public class Ex4 {
    // a
    public static int qA(int n) {
        if (n == 1) {
            return 2 * n + 1;
        }
        return (2 * n + 1) + qA(n - 1);
    }

    // b
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    public static int qB(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n) + qB(n - 1);
    }

    // c
    public static int qC(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n) * qC(n - 1);
    }

    // d
    public static long qD(int n, int r) {
        if (!(n >= r && r > 0)) {
            return 1;
        }
        return n * qD(n - 1, r - 1);
    }

    // e
    public static long qE(int n) {
        if (n <= 1) {
            return 3;
        }
        long powerOfTwo = 1L << n; // 2^n
        long nSquared = (long) n * n; // n^2
        return powerOfTwo + nSquared + qE(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(qB(4));// 33
    }
}