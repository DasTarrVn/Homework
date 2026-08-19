import java.util.Scanner;

public class SplitWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input List: ");
        String input = sc.nextLine();
        String[] words = splitByComma(input);

        System.out.println("Result:");
        for (String w : words) {
            System.out.println(w);
        }
        sc.close();
    }

    public static String[] splitByComma(String s) {
        if (s == null || s.isEmpty()) {
            return new String[0];
        }
        String[] parts = s.split(",");
        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].trim();
        }
        return parts;
    }
}