public class StringExercises {
    public static String shortName(String str) {
        String[] parts = str.trim().split("\\s+");
        if (parts.length < 2)
            return str;
        return parts[0] + " " + parts[parts.length - 1];
    }

    public static String hashtagName(String str) {
        String[] parts = str.trim().split("\\s+");
        return "#" + String.join("", parts);
    }

    public static String upperCaseAllVowel(String str) {
        char[] chars = str.toCharArray();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < chars.length; i++) {
            if (vowels.indexOf(chars[i]) != -1) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public static String upperCaseAllN(String str) {
        return str.replace('n', 'N');
    }

    public static int countWord(String paragraph) {
        return paragraph.trim().split("\\s+").length;
    }

    public static int countSentences(String paragraph) {
        return paragraph.split("[.!?]").length;
    }

    public static int countAppear(String paragraph, String word) {
        String[] words = paragraph.toLowerCase().split("\\W+");
        int count = 0;
        for (String w : words) {
            if (w.equals(word.toLowerCase()))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String name = "Nguyen Le Trong Tin";
        System.out.println(name);
        System.out.println("1. shortName: " + shortName(name));
        System.out.println("2. hashtagName: " + hashtagName(name));
        System.out.println("3. upperCaseAllVowel: " + upperCaseAllVowel(name));
        String paragraph = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        System.out.println("\n" + paragraph + "\n");
        System.out.println("1. countWord: " + countWord(paragraph));
        System.out.println("2. countSentences: " + countSentences(paragraph));
        System.out.println("3. countAppear ('is'): " + countAppear(paragraph, "is"));
        System.out.println("4. countAppear ('and'): " + countAppear(paragraph, "and"));
    }
}