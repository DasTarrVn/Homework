import java.util.*;
import java.io.*;

public class SumIntergersFile {
    public static void main(String[] args) {
        int sum = 0;
        try (Scanner sc = new Scanner(new File("input.txt"));
                PrintWriter pw = new PrintWriter(new File("output.txt"))) {
            while (sc.hasNextLine()) {
                sum += sc.nextInt();
            }
            pw.println(sum);
        } catch (Exception e) {
            System.out.println("File not found!");
        }
    }
}
