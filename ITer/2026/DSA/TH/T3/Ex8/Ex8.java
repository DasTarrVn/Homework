public class Ex8 {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();

        list.addSortedList(5);
        list.addSortedList(2);
        list.addSortedList(9);
        list.addSortedList(1);
        list.addSortedList(6);
        list.addSortedList(4);

        list.print();

        System.out.println("Even count: " + list.countEven());
        System.out.println("Total sum: " + list.sumAll());
    }
}