public class Main {
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        MyStack<Character> stack = new MyStack<Character>();
        MyQueue<Character> queue = new MyQueue<Character>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                char lower = Character.toLowerCase(c);
                stack.push(lower);
                queue.enQueue(lower);
            }
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            char c1 = stack.pop();
            char c2 = queue.deQueue();
            if (c1 != c2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] testCases = {
            "dad",
            "A man, a plan, a canal: Panama",
            "racecar",
            "hello",
            "Was it a car or a cat I saw?",
            "No 'x' in Nixon"
        };

        for (String s : testCases) {
            System.out.println("Chuoi: \"" + s + "\"");
            System.out.println("Doi xung: " + isPalindrome(s));
            System.out.println();
        }
    }
}
