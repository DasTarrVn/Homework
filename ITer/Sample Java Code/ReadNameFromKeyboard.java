import java.util.Scanner; // Import the Scanner class

public class ReadNameFromKeyboard {
  public static void main(String[] args) {
    Scanner scannerObj = new Scanner(System.in); // Create a Scanner object

    System.out.print("Enter your full name: ");
    String fullName = scannerObj.nextLine(); // Read user input (a full line)

    System.out.println("Your full name is: " + fullName);

    scannerObj.close(); // Close the scanner when finished
  }
}