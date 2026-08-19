import java.util.*;

public class PIApproximation {
    public static void main(String[] args) {
        // 1. Initialize the Scanner object attached to System.in (the keyboard)
        Scanner sc = new Scanner(System.in);

        System.out.println("PI Approximation");
        
        // 2. Read a double value from the user
        System.out.print("Enter the number of loops: ");
        int loop = sc.nextInt();

        // 3. Perform calculation
        double output = 0.0;
        for(int i = 0; i <= loop; i++)
        {
            output = output + (Math.pow(-1, i) * (4.0 / (2*i + 1)));
        }

        // 4. Output results using formatted print
        System.out.printf("Result of PI approximation of %d is: %.4f\n", loop, output);

        sc.close(); // Close the scanner resource
    }
}