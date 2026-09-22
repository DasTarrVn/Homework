public class Ex5 {
    public static int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return decimalToBinary(n / 2) * 10 + (n % 2);

    }

    public static void main(String[] args) {
        System.out.print(decimalToBinary(21));// 10101
        ;
    }
}
