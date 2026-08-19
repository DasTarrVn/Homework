import java.util.*;

public class Test {
    public static <T, S> void printList(ArrayList<Pair<T, S>> list) {
        for (Pair<T, S> item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ArrayList<Pair<String, Double>> list = new ArrayList<>();
        list.add(new Pair<String, Double>("A", 1.0));
        list.add(new Pair<String, Double>("B", 2.0));
        list.add(new Pair<String, Double>("C", 3.0));
        printList(list);
    }

}
