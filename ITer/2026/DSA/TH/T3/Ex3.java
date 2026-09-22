public class Ex3 {
    public static boolean checkPrime(int n, int d) {
        if (n <= 1) {
            return false;
        }
        if (d < 2) {
            return checkPrime(n, 2);

        }
        if (d * d > n) {
            return true;
        }
        if (n % d == 0) {
            return false;
        }
        return checkPrime(n, d + 1);
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(5, 2));
    }
}
