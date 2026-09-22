public class Main {
    public static long recurP(int n) {
        if (n <= 1) {
            return 3;
        }
        return (long) Math.pow(2, n) + (long) n * n + recurP(n - 1);
    }

    public static long stackP(int n) {
        if (n <= 1) {
            return 3;
        }
        MyStack<Integer> stack = new MyStack<Integer>();
        for (int i = n; i > 1; i--) {
            stack.push(i);
        }
        long result = 3;
        while (!stack.isEmpty()) {
            int k = stack.pop();
            result += (long) Math.pow(2, k) + (long) k * k;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int n = 1; n <= 6; n++) {
            long resRecur = recurP(n);
            long resStack = stackP(n);
            System.out.println("n = " + n + " | De quy: " + resRecur + " | Stack: " + resStack + " | Khop: " + (resRecur == resStack));
        }
    }
}
