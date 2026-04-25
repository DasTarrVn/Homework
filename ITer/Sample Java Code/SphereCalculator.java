import java.util.Scanner;

public class SphereCalculator {
    public static void main(String[] args) {
        // 1. Initialize the Scanner object attached to System.in (the keyboard)
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sphere Volume Calculator ---");
        
        // 2. Read a double value from the user
        System.out.print("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();

        // 3. Perform calculation using the Math class
        // Formula: Volume = (4/3) * PI * radius^3
        // Note: Use 4.0/3.0 to ensure floating-point division
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // 4. Output results using formatted print
        // %f is for floating-point; .2 limits it to 2 decimal places
        System.out.printf("A sphere with radius %.2f has a volume of: %.4f\n", radius, volume);

        sc.close(); // Close the scanner resource
    }
}