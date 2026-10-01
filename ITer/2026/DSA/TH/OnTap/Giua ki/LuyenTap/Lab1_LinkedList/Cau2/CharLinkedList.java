import java.util.NoSuchElementException;

/**
 * ============================================================
 * ĐỀ BÀI - Câu 2 (4 điểm) [Tương tự đề ôn tập]
 * ============================================================
 *
 * Dựa vào hai file ListInterface.java và Node.java đính kèm trong thư mục
 * (Sinh viên KHÔNG chỉnh sửa hoặc thêm code trên hai file này),
 * sinh viên định nghĩa lớp CharLinkedList tạo ra danh sách liên kết chứa các ký tự.
 *
 * Định nghĩa các phương thức trong lớp CharLinkedList:
 *
 * 1. CharLinkedList()
 *    Phương thức khởi tạo không tham số, gán head = null.
 *
 * 2. getHead()
 *    Trả về head của danh sách liên kết.
 *
 * 3. addFirst(char data)
 *    Thêm vào ĐẦU danh sách một nút có giá trị data.
 *
 * 4. addAfterFirstKey(char data, char key)
 *    Thêm một nút với giá trị data vào SAU nút chứa giá trị key đầu tiên
 *    tính từ đầu danh sách, sau đó trả về true.
 *    Nếu danh sách không có giá trị nào bằng key thì KHÔNG thêm và trả về false.
 *    Ví dụ: Danh sách 'A', 'b', 'c' → gọi addAfterFirstKey('E', 'b')
 *    → danh sách: 'A', 'b', 'E', 'c'  và trả về true.
 *
 * 5. largestCharPosition()
 *    Trả về vị trí của phần tử đầu tiên có mã ASCII lớn nhất trong danh sách.
 *    Vị trí head = 0.
 *    Nếu danh sách rỗng thì trả về -1.
 *    Ví dụ: Danh sách 'A'(65), 'b'(98), 'c'(99) → largestCharPosition() = 2.
 *    Lưu ý: Nếu có nhiều phần tử cùng giá trị ASCII lớn nhất → trả về vị trí ĐẦU TIÊN.
 *
 * Sinh viên tự định nghĩa phương thức print() in danh sách ra màn hình
 * và định nghĩa lớp Test chứa phương thức main để kiểm tra lại bài làm.
 */
public class CharLinkedList implements ListInterface<Character> {

    private Node<Character> head;

    // ============================================================
    // [1] Constructor
    // ============================================================
    public CharLinkedList() {
        // TODO: gán head = null
    }

    // ============================================================
    // [2] getHead()
    // ============================================================
    @Override
    public Node<Character> getHead() {
        return null; // TODO: trả về head
    }

    // ============================================================
    // [3] addFirst(char data)
    // Gợi ý: tạo nút mới, newNode.setNext(head), cập nhật head = newNode
    // ============================================================
    public void addFirst(char data) {
        // TODO
    }

    // ============================================================
    // [4] addAfterFirstKey(char data, char key)
    // Gợi ý:
    //   Duyệt danh sách tìm nút curr có curr.getData() == key
    //   Nếu tìm thấy: tạo nút mới, newNode.setNext(curr.getNext()),
    //                 curr.setNext(newNode), return true
    //   Nếu không: return false
    // ============================================================
    public boolean addAfterFirstKey(char data, char key) {
        return false; // TODO
    }

    // ============================================================
    // [5] largestCharPosition()
    // Gợi ý:
    //   Nếu rỗng → return -1
    //   Duyệt danh sách, theo dõi maxChar và maxPos
    //   Dùng > (không phải >=) để lấy phần tử ĐẦU TIÊN có giá trị lớn nhất
    // ============================================================
    public int largestCharPosition() {
        return -1; // TODO
    }

    // ============================================================
    // [6] print()
    // ============================================================
    @Override
    public void print() {
        // TODO
    }

    // ============================================================
    // Các phương thức còn lại của ListInterface (đã implement sẵn)
    // ============================================================
    @Override
    public void addFirst(Character item) {
        addFirst((char) item);
    }

    @Override
    public void addAfter(Node<Character> curr, Character item) {
        if (curr == null) return;
        Node<Character> newNode = new Node<>(item, curr.getNext());
        curr.setNext(newNode);
    }

    @Override
    public void addLast(Character item) {
        if (head == null) {
            head = new Node<>(item);
        } else {
            Node<Character> curr = head;
            while (curr.getNext() != null) curr = curr.getNext();
            curr.setNext(new Node<>(item));
        }
    }

    @Override
    public Character removeFirst() throws NoSuchElementException {
        if (head == null) throw new NoSuchElementException();
        Character val = head.getData();
        head = head.getNext();
        return val;
    }

    @Override
    public Character removeAfter(Node<Character> curr) throws NoSuchElementException {
        if (curr == null || curr.getNext() == null) throw new NoSuchElementException();
        Node<Character> toRemove = curr.getNext();
        curr.setNext(toRemove.getNext());
        return toRemove.getData();
    }

    @Override
    public Character removeLast() throws NoSuchElementException {
        if (head == null) throw new NoSuchElementException();
        if (head.getNext() == null) {
            Character val = head.getData();
            head = null;
            return val;
        }
        Node<Character> curr = head;
        while (curr.getNext().getNext() != null) curr = curr.getNext();
        Character val = curr.getNext().getData();
        curr.setNext(null);
        return val;
    }

    @Override
    public boolean isEmpty() { return head == null; }

    @Override
    public Character getFirst() throws NoSuchElementException {
        if (head == null) throw new NoSuchElementException();
        return head.getData();
    }

    @Override
    public int size() {
        int count = 0;
        Node<Character> curr = head;
        while (curr != null) { count++; curr = curr.getNext(); }
        return count;
    }

    @Override
    public boolean contains(Character item) {
        Node<Character> curr = head;
        while (curr != null) {
            if (curr.getData().equals(item)) return true;
            curr = curr.getNext();
        }
        return false;
    }
}
