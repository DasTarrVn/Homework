public class Test {
    public static void main(String[] args) {
        CharLinkedList list = new CharLinkedList();

        // Test addFirst
        list.addFirst('c');
        list.addFirst('b');
        list.addFirst('A');
        System.out.print("Danh sach ban dau: ");
        list.printList(); // Kết quả mong đợi: A b c

        // Test addAfterFirstKey
        list.addAfterFirstKey('E', 'b');
        System.out.print("Sau khi addAfterFirstKey('E', 'b'): ");
        list.printList(); // Kết quả mong đợi: A b E c

        // Test largestCharPosition
        System.out.println("Vi tri ky tu lon nhat: " + list.largestCharPosition());
    }
}