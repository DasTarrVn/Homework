import java.util.*;

//Lab1_11
public class CountNumberDigitsProg {

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        System.out.printf("Number of digits in number is: %d\n", countNumberDigits(n));
        sc.close();
    }

    public static int countNumberDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

}
