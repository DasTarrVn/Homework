package Lab2_52500029_NguyenVanDucAnh;

import java.math.*;


public class FindMaxBigDecimal {
    public static void main(String[] args) {
        BigDecimal[] numbers = {
                new BigDecimal("10.5"),
                new BigDecimal("3.14"),
                new BigDecimal("3.14"),
                new BigDecimal("20.99"), // Max value
                new BigDecimal("7.0"),
                new BigDecimal("15.25")
        };
        System.out.print("Max value is: " + findMax(numbers) + "\n");
    }

    public static BigDecimal findMax(BigDecimal[] arr) {
        BigDecimal max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}
