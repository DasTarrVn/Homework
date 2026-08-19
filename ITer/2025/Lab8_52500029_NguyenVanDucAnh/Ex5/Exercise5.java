import java.util.*;

public class Exercise5 {
    private HashMap<String, String> dict = new HashMap<>();

    public Exercise5() {
        dict.put("always", "Luôn luôn");
        dict.put("beautiful", "Xinh đẹp");
        dict.put("careful", "Cẩn thận");
        dict.put("different", "Khác biệt");
        dict.put("early", "Sớm");
        dict.put("family", "Gia đình");
        dict.put("happy", "Vui vẻ");
        dict.put("important", "Quan trọng");
        dict.put("learn", "Học");
        dict.put("together", "Cùng nhau");
    }

    public boolean checkWord(String word) {
        return dict.containsKey(word.toLowerCase());
    }

    public String findMeaning(String word) {
        return dict.get(word.toLowerCase());
    }

    public static void main(String[] args) {
        Exercise5 dictionary = new Exercise5();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to look up (or 'exit' to stop): ");
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit"))
                break;

            if (dictionary.checkWord(input)) {
                System.out.println("Meaning: " + dictionary.findMeaning(input));
            } else {
                System.out.println("Word not found in the dictionary.");
            }
            System.out.print("Enter another word: ");
        }
        scanner.close();
    }
}