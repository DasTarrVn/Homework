public class Main {
    public static void main(String[] args) {
        MyLinkedList<Fraction> ex1 = new MyLinkedList<>();
        ex1.addFirst(new Fraction(5, 4));
        ex1.addFirst(new Fraction(1, 2));
        ex1.print();
    }
}
