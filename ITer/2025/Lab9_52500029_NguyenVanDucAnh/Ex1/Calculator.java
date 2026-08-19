public class Calculator {

    public double divide(int a, int b) throws NumberOutOfRangeException {
        if (a < -1000 || a > 1000 || b < -1000 || b > 1000) {
            throw new NumberOutOfRangeException("Number is outside the computation");
        }

        if (b == 0) {
            throw new ArithmeticException("divide by zero");
        }

        return (double) a / b;
    }

    public int multiply(int a, int b) throws NumberOutOfRangeException {
        if (a < -1000 || a > 1000 || b < -1000 || b > 1000) {
            throw new NumberOutOfRangeException("Number is outside the computation");
        }

        return a * b;
    }

    // public static void main(String[] args) {
    //     Calculator a = new Calculator();
    //     try {
    //         System.out.println(a.divide(6, 0));
    //     } catch (NumberOutOfRangeException e) {
    //         System.out.println(e.getMessage());
    //     } catch (ArithmeticException e) {
    //         System.out.println(e.getMessage());
    //     }
    // }
}
