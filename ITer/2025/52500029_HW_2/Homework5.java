
import java.util.Scanner;

public class Homework5 {
    public static String cleanName(String input) {
        input = input.trim();
        String[] inputs = input.split(" ");
        String output = new String();

        for (int i = 0; i < inputs.length; ++i) {
            if (!inputs[i].isEmpty()) {
                output = output + inputs[i].substring(0, 1).toUpperCase() + inputs[i].substring(1).toLowerCase()
                        + " ";
            }
        }
        return output.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter name: ");

        String input = sc.nextLine();
        sc.close();
        System.out.println("Cleaned name: " + cleanName(input));
    }
}
