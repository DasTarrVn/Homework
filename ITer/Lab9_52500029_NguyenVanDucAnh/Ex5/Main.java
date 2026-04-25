public class Main {
    public static void main(String[] args) {
        CharacterManagement cm = new CharacterManagement();

        Character c = cm.deserializeCharacter("character.ser");
        if (c == null)
            c = new Character("Warrior", 10, 100, 50, 30);
        System.out.println(c);

        c = cm.action(c);
        System.out.println(c);

        cm.serializeCharacter(c, "hero.ser");
        Character reloaded = cm.deserializeCharacter("hero.ser");
        System.out.println(reloaded);
    }
}