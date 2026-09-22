public class Ex2 {
    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static int xToTheN(int x, int n) {
        if (n == 0)
            return 1;
        return x * xToTheN(x, n - 1);
    }

    public static int countNumDigit(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + countNumDigit(n / 10);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
        System.out.println(xToTheN(2, 10)); // 1024
        System.out.println(xToTheN(3, 0)); // 1
        System.out.println(countNumDigit(10));
        System.out.println(findGCD(18, 8));// 2
    }
}
