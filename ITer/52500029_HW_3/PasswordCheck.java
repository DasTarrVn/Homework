import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password to check: ");
        String password = sc.nextLine();

        boolean isValid = getPasswordValidator(password);

        if (isValid) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("The password is invalid!");
        }
        sc.close();
    }

    public static boolean getPasswordValidator(String password) {
        boolean isValid = true;
        if (password.length() < 8) {
            System.out.println("Missing: The length must be at least 8 characters.");
            isValid = false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c))
                hasUpper = true;
            if (Character.isLowerCase(c))
                hasLower = true;
            if (Character.isDigit(c))
                hasDigit = true;
        }
        if (!hasUpper) {
            System.out.println("Missing: At least one capital letter.");
            isValid = false;
        }
        if (!hasLower) {
            System.out.println("Missing: At least 1 lowercase letter.");
            isValid = false;
        }
        if (!hasDigit) {
            System.out.println("Missing: At least one digit.");
            isValid = false;
        }
        return isValid;
    }
}