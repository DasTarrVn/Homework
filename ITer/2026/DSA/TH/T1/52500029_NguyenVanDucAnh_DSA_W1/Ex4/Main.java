public class Main {
    public static void main(String[] args) {
        MyDoubleLinkedList list = new MyDoubleLinkedList();

        // Them phan tu
        list.addFirst(3.14);
        list.addFirst(1.41);
        list.addLast(2.71);
        list.addLast(9.81);
        list.print();

        // Tim va them sau
        DoubleNode node = list.find(2.71);
        if (node != null) {
            list.addAfter(node, 5.55);
        }
        list.print();

        // Xoa phan tu
        DoubleNode toRemove = list.find(5.55);
        if (toRemove != null) {
            list.removeCurr(toRemove);
        }
        list.print();

        list.removeFirst();
        list.removeLast();
        list.print();
    }
}
