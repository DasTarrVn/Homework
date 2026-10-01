/**
 * Test class - Sinh viên chạy file này để kiểm tra bài làm DoubleLinkedList.
 */
public class Test {
    public static void main(String[] args) {

        // =====================================================
        // TEST addLast
        // =====================================================
        System.out.println("=== Test addLast ===");
        DoubleLinkedList list = new DoubleLinkedList();
        list.addLast(1.5);
        list.addLast(2.7);
        list.addLast(3.0);
        list.addLast(4.8);
        list.print();
        // Ky vong: 1.5 2.7 3.0 4.8

        // =====================================================
        // TEST addAfterIndex
        // =====================================================
        System.out.println("\n=== Test addAfterIndex (them sau index 1) ===");
        boolean r1 = list.addAfterIndex(9.9, 1);
        System.out.println("Return value: " + r1);  // Ky vong: true
        list.print();
        // Ky vong: 1.5 2.7 9.9 3.0 4.8

        System.out.println("\n=== Test addAfterIndex (index am) ===");
        boolean r2 = list.addAfterIndex(0.0, -1);
        System.out.println("Return value: " + r2);  // Ky vong: false

        System.out.println("\n=== Test addAfterIndex (index vuot qua size) ===");
        boolean r3 = list.addAfterIndex(0.0, 100);
        System.out.println("Return value: " + r3);  // Ky vong: false

        System.out.println("\n=== Test addAfterIndex (them sau phan tu cuoi) ===");
        // Danh sach hien tai co 5 phan tu, index cuoi = 4
        boolean r4 = list.addAfterIndex(99.0, 4);
        System.out.println("Return value: " + r4);  // Ky vong: true
        list.print();
        // Ky vong: 1.5 2.7 9.9 3.0 4.8 99.0

        // =====================================================
        // TEST sumPositive
        // =====================================================
        System.out.println("\n=== Test sumPositive ===");
        DoubleLinkedList list2 = new DoubleLinkedList();
        list2.addLast(-1.5);
        list2.addLast(2.0);
        list2.addLast(-3.0);
        list2.addLast(4.5);
        System.out.println("Tong duong: " + list2.sumPositive());
        // Ky vong: 6.5

        DoubleLinkedList empty = new DoubleLinkedList();
        System.out.println("Danh sach rong: " + empty.sumPositive());
        // Ky vong: 0.0

        DoubleLinkedList allNeg = new DoubleLinkedList();
        allNeg.addLast(-1.0);
        allNeg.addLast(-2.0);
        System.out.println("Toan so am: " + allNeg.sumPositive());
        // Ky vong: 0.0
    }
}
