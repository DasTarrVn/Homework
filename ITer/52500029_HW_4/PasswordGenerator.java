import java.util.*;

public class PasswordGenerator {
    public static void main(String[] args) {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        Random rd = new Random();

        String password = "";

        for (int i = 0; i < 10; i++) {
            int choice = rd.nextInt(3);
            if (choice == 0) {
                int chars = rd.nextInt(26);
                password += upperCaseLetters.charAt(chars);
            } else if (choice == 1) {
                int chars = rd.nextInt(26);
                password += lowerCaseLetters.charAt(chars);
            } else {
                int digits = rd.nextInt(10);
                password += digits;
            }
        }
        System.out.println("Your password is: " + password);
    }
}
