import java.util.*;

//Lab1_7
public class CheckAlphanumeric {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char key = sc.next().charAt(0);
        sc.close();
        checkAlphanumeric(key);
    }

    public static void checkAlphanumeric(char key) {
        // Casting
        int n = key;
        if ((n > 64 && n < 91) || (n > 96 && n < 123) || (n > 47 && n < 58)) {
            System.out.println("This is an Alphanumeric.");
        } else {
            System.out.println("This is not an Alphanumeric.");
        }
    }
}
