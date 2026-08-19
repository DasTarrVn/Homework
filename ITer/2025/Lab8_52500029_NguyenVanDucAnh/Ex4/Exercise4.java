import java.util.Vector;

public class Exercise4 {
    public static void main(String[] args) {
        int n = 5;
        Vector<Integer> X = new Vector<>();
        // Assume hard-coded input for X
        X.add(1);
        X.add(2);
        X.add(3);
        X.add(4);
        X.add(5);

        Vector<Integer> Y = new Vector<>();
        for (Integer x : X) {
            int yValue = 2 * (x * x) + 1;
            Y.add(yValue);
        }

        System.out.println("Vector X: " + X);
        System.out.println("Vector Y (2x^2 + 1): " + Y);
    }
}