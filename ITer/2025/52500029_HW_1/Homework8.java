import java.util.*;

public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("Binary: ");
        decimalToBinary(n);
        System.out.println();
    }

    public static void decimalToBinary(int n) {
        if (n == 0) {
            System.out.print("0");
            return;
        }
        String binary = "";
        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }
        System.out.print(binary);
    }
}
