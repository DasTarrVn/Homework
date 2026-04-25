import java.util.*;

public class Homework6 {
    public static double calAvg(double math, double lite, double eng) {
        return (math * 2 + lite + eng) / 4;
    }

    public static String calRank(double result) {
        if (result > 8.0) {
            return "A";
        }
        if (result > 5.0) {
            return "B";
        }
        return "C";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Math scores: ");
        double math = sc.nextDouble();
        System.out.print("Enter Literature scores: ");
        double lite = sc.nextDouble();
        System.out.print("Enter English scores: ");
        double eng = sc.nextDouble();
        sc.close();
        double result = calAvg(math, lite, eng);
        System.out.printf("Weighted average is: %.2f\n", result);
        System.out.println("Rank is: " + calRank(result));
    }
}
