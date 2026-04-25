import java.util.*;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, total = 0;
        do {
            System.out.print("Enter n: ");
            n = sc.nextInt();
            total = total + n;
        } while (n != 0);
        System.out.println("Total: " + total);
        sc.close();
    }
}
