public class Main {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();

        System.out.println("Them: 4, 1, 7, 5, 2");
        list.add(4);
        list.add(1);
        list.add(7);
        list.add(5);
        list.add(2);
        System.out.print("Danh sach: ");
        list.print();
        System.out.print("Xoa phan tu 4 : ");
        boolean r1 = list.remove(4);
        System.out.println("Ket qua: " + r1);
        System.out.print("Danh sach sau khi xoa: ");
        list.print();

        System.out.print("\nXoa PHan tu thu 10 (Khong co): ");
        boolean r2 = list.remove(10);
        System.out.println("Ket qua: " + r2);
        System.out.print("Danh sach sau khi xoa: ");
        list.print();
    }
}
