public class Ex1 {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static long power(int x, int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }

    public static int countDigit(int n) {
        int result = 0;
        while (n > 0) {
            result += 1;
            n /= 10;
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        int i = 3;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i += 2;
        }
        return true;
    }

    public static int findGCD(int x, int y) {
        while (y > 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }

    public static void main(String[] args) {
        long testFactorial = factorial(5);
        System.out.println(testFactorial);
        long testPower = power(2, 5);
        System.out.println(testPower);
        int testCountDigit = countDigit(1);
        System.out.println(testCountDigit);
        boolean testIsPrime = isPrime(9);
        System.out.println(testIsPrime);
        int testFindGCD = findGCD(3, 6);
        System.out.println(testFindGCD);
    }

}
