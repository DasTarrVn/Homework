/**
 * Test class - Sinh viên chạy file này để kiểm tra bài làm CharLinkedList.
 */
public class Test {
    public static void main(String[] args) {

        // =====================================================
        // TEST addFirst
        // =====================================================
        System.out.println("=== Test addFirst ===");
        CharLinkedList list = new CharLinkedList();
        list.addFirst('c');
        list.addFirst('b');
        list.addFirst('A');
        list.print();
        // Ky vong: A b c

        // =====================================================
        // TEST addAfterFirstKey - truong hop binh thuong
        // =====================================================
        System.out.println("\n=== Test addAfterFirstKey ('E' sau 'b') ===");
        boolean r1 = list.addAfterFirstKey('E', 'b');
        System.out.println("Return value: " + r1);  // Ky vong: true
        list.print();
        // Ky vong: A b E c

        // TEST addAfterFirstKey - key la phan tu cuoi
        System.out.println("\n=== Test addAfterFirstKey ('Z' sau 'c') ===");
        boolean r2 = list.addAfterFirstKey('Z', 'c');
        System.out.println("Return value: " + r2);  // Ky vong: true
        list.print();
        // Ky vong: A b E c Z

        // TEST addAfterFirstKey - key khong ton tai
        System.out.println("\n=== Test addAfterFirstKey (key khong ton tai) ===");
        boolean r3 = list.addAfterFirstKey('X', 'z');
        System.out.println("Return value: " + r3);  // Ky vong: false

        // =====================================================
        // TEST largestCharPosition
        // =====================================================
        System.out.println("\n=== Test largestCharPosition ===");
        CharLinkedList list2 = new CharLinkedList();
        list2.addLast('A');   // vi tri 0, ASCII 65
        list2.addLast('b');   // vi tri 1, ASCII 98
        list2.addLast('c');   // vi tri 2, ASCII 99
        System.out.println("Vi tri lon nhat: " + list2.largestCharPosition());
        // Ky vong: 2  ('c' co ma lon nhat)

        // Test: lon nhat o dau
        CharLinkedList list3 = new CharLinkedList();
        list3.addLast('z');   // vi tri 0
        list3.addLast('a');   // vi tri 1
        list3.addLast('m');   // vi tri 2
        System.out.println("Vi tri lon nhat (dau): " + list3.largestCharPosition());
        // Ky vong: 0

        // Test: danh sach rong
        CharLinkedList empty = new CharLinkedList();
        System.out.println("Danh sach rong: " + empty.largestCharPosition());
        // Ky vong: -1

        // Test: trung nhau - lay vi tri DAU TIEN
        CharLinkedList list4 = new CharLinkedList();
        list4.addLast('a');
        list4.addLast('z');
        list4.addLast('z');
        System.out.println("Trung nhau - vi tri dau tien: " + list4.largestCharPosition());
        // Ky vong: 1
    }
}
