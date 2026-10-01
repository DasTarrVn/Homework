/**
 * Lớp Test - Sinh viên chạy file này để kiểm tra bài làm IntLinkedList.
 *
 * Kết quả kỳ vọng được ghi chú sau mỗi dòng in.
 * Nếu output khớp với kỳ vọng → bài làm đúng!
 */
public class Test {
    public static void main(String[] args) {

        // =====================================================
        // TEST addLast
        // =====================================================
        System.out.println("=== Test addLast ===");
        IntLinkedList list = new IntLinkedList();
        list.addLast(3);
        list.addLast(7);
        list.addLast(4);
        list.addLast(9);
        list.print();
        // Ky vong: 3 7 4 9

        // =====================================================
        // TEST addBeforeFirstEven - truong hop binh thuong
        // =====================================================
        System.out.println("\n=== Test addBeforeFirstEven (so chan o giua) ===");
        boolean r1 = list.addBeforeFirstEven(10);
        System.out.println("Return value: " + r1); // Ky vong: true
        list.print();
        // Ky vong: 3 7 10 4 9

        // TEST addBeforeFirstEven - so chan dau tien la head
        System.out.println("\n=== Test addBeforeFirstEven (so chan la head) ===");
        IntLinkedList list2 = new IntLinkedList();
        list2.addLast(4);
        list2.addLast(3);
        list2.addLast(9);
        boolean r2 = list2.addBeforeFirstEven(20);
        System.out.println("Return value: " + r2); // Ky vong: true
        list2.print();
        // Ky vong: 20 4 3 9

        // TEST addBeforeFirstEven - khong co so chan
        System.out.println("\n=== Test addBeforeFirstEven (khong co so chan) ===");
        IntLinkedList list3 = new IntLinkedList();
        list3.addLast(1);
        list3.addLast(3);
        list3.addLast(5);
        boolean r3 = list3.addBeforeFirstEven(100);
        System.out.println("Return value: " + r3); // Ky vong: false
        list3.print();
        // Ky vong: 1 3 5 (khong doi)

        // =====================================================
        // TEST countPrime
        // =====================================================
        System.out.println("\n=== Test countPrime ===");
        // list hien tai: 3 7 10 4 9
        System.out.println("countPrime: " + list.countPrime());
        // Ky vong: 2 (3 va 7 la so nguyen to)

        IntLinkedList list4 = new IntLinkedList();
        list4.addLast(2);
        list4.addLast(5);
        list4.addLast(11);
        list4.addLast(15);
        list4.addLast(1);
        System.out.println("countPrime: " + list4.countPrime());
        // Ky vong: 3 (2, 5, 11)

        IntLinkedList empty = new IntLinkedList();
        System.out.println("countPrime (rong): " + empty.countPrime());
        // Ky vong: 0
    }
}
