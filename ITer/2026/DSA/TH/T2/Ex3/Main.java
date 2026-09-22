public class Main {
    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        MyStack<Character> stack = new MyStack<Character>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            String input = args[0];
            System.out.println("Goc: " + input);
            System.out.println("Dao nguoc: " + reverse(input));
            return;
        }

        String[] testCases = {
            "Hello World!",
            "Data Structures and Algorithms",
            "123456789",
            "Stack Queue"
        };

        for (String s : testCases) {
            System.out.println("Goc: " + s);
            System.out.println("Dao nguoc: " + reverse(s));
            System.out.println();
        }
    }
}
