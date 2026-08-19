import java.io.*;

public class CharacterManagement {

    public CharacterManagement() {
    }

    public void serializeCharacter(Character character, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(character);
        } catch (IOException e) {
        }
    }

    public Character deserializeCharacter(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Character) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }

    public Character action(Character character) {
        if (character != null && "Warrior".equalsIgnoreCase(character.getName())) {
            double currentScore = character.getScore();
            character.setScore(currentScore + 100.0);
        }
        return character;
    }
}