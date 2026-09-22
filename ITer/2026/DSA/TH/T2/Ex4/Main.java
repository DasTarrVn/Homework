public class Main {
    public static boolean isBalanced(String expr) {
        if (expr == null) {
            return true;
        }
        MyStack<Character> stack = new MyStack<Character>();
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] testCases = {
            "{[()]}",
            "{[(])}",
            "((()))",
            "())",
            "([{}])",
            "{[}",
            "a * (b + c) - [d / {e * f}]",
            "a * (b + c) - [d / {e * f)]"
        };

        for (String expr : testCases) {
            System.out.println("Bieu thuc: " + expr);
            System.out.println("Can bang: " + isBalanced(expr));
            System.out.println();
        }
    }
}
