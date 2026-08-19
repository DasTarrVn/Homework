package Lab2_52500029_NguyenVanDucAnh;
import java.text.DecimalFormat;

public class DataParserWrapper {
    public static void main(String[] args) {
        // Given data = "45,72,18"
        String data = "45,72,18";
        int commaIndex1 = data.indexOf(",");
        int commaIndex2 = data.indexOf(",", commaIndex1 + 1);
        String str1 = data.substring(0, commaIndex1);
        String str2 = data.substring(commaIndex1 + 1, commaIndex2);
        String str3 = data.substring(commaIndex2 + 1);
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int num3 = Integer.parseInt(str3);
        int maxVal = Math.max(num1, Math.max(num2, num3));
        double average = (num1 + num2 + num3) / 3.0;
        DecimalFormat df = new DecimalFormat("0.00%");
        String avgFormatted = df.format(average / 100);
        System.out.println("Data String: " + data);
        System.out.println("Max Value: " + maxVal);
        System.out.println("Average (formatted): " + avgFormatted);
    }
}