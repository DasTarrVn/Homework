import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Cat("Meo"));
        list.add(new Dog("Chos"));
        for (Animal animal : list) {
            animal.makeSound();
        }
    }
}