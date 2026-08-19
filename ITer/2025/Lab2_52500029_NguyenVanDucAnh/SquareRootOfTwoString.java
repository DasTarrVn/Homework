package Lab2_52500029_NguyenVanDucAnh;
import java.util.*;

public class SquareRootOfTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 and 2: ");
        String s1 = sc.next();
        String s2 = sc.next();
        int num1 = Integer.valueOf(s1);
        double num2 = Double.valueOf(s2);
        String finalResult = Double.toString(Math.sqrt(num1 + num2));
        System.out.println("Final result is: " + finalResult);
        sc.close();
    }
}