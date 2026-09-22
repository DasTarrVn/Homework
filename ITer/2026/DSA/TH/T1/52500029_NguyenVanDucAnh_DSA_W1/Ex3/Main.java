public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(7);
        list.addLast(3);
        list.addLast(4);
        list.addLast(11);
        list.addLast(6);
        list.addLast(8);
        list.addLast(13);
        list.print();

        // a. Dem so chan
        System.out.println("So luong so chan: " + list.countEven());

        // b. Dem so nguyen to
        System.out.println("So luong so nguyen to: " + list.countPrime());

        // c. Them 99 truoc so chan dau tien
        list.addBeforeFirstEven(99);
        list.print();

        // d. Tim so lon nhat
        System.out.println("So lon nhat: " + list.findMax());

        // e. Dao nguoc danh sach
        list.reverse();
        list.print();

        // f. Sap xep tang dan
        list.sortAscending();
        list.print();
    }
}
