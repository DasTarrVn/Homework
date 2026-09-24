import java.util.Stack;

public class Cau3 {

    private static boolean isNumber(String str) {
        return str.matches("0|([1-9][0-9]*)");
    }

    public static int calculate(String[] expression) {
        Stack<Integer> stack = new Stack<>();

        // TODO: Hiện thực thuật toán duyệt mảng và tính toán với Stack

        return stack.isEmpty() ? 0 : stack.peek();
    }

    public static void main(String[] args) {
        // Kiểm thử theo test case trong đề bài: 3 4 + 2 1 + -
        String[] expression = { "3", "4", "+", "2", "1", "+", "-" };
        System.out.println("Ket qua: " + calculate(expression)); // Kết quả mong đợi: 4
    }
}