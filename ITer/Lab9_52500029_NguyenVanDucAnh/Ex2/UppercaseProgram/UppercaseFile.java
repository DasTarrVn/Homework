import java.util.*;
import java.io.*;

public class UppercaseFile {
    public static void main(String[] args) {
        try (
                Scanner sc = new Scanner(new File("input.txt"));
                PrintWriter pw = new PrintWriter(new File("output.txt"))) {
            while (sc.hasNextLine()) {
                pw.println(sc.nextLine().toUpperCase());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}