import java.util.NoSuchElementException;

/**
 * ============================================================
 * ĐỀ BÀI - Câu 1 (4 điểm) [Tương tự đề thi số 1]
 * ============================================================
 *
 * Dựa vào hai file ListInterface.java và Node.java đính kèm trong thư mục
 * (sinh viên KHÔNG chỉnh sửa hoặc thêm code trên hai file này),
 * sinh viên định nghĩa lớp IntLinkedList tạo ra danh sách liên kết chứa các số
 * nguyên.
 *
 * Định nghĩa các phương thức trong lớp IntLinkedList:
 *
 * 1. IntLinkedList()
 * Phương thức khởi tạo không tham số, gán head = null.
 *
 * 2. getHead()
 * Trả về head của danh sách liên kết.
 *
 * 3. addLast(int data)
 * Thêm vào cuối danh sách một nút có giá trị data.
 * Ví dụ: Gọi addLast(3), addLast(7), addLast(4), addLast(9)
 * → danh sách: 3 -> 7 -> 4 -> 9 (head = nút 3)
 *
 * 4. addBeforeFirstEven(int data)
 * Thêm một nút với giá trị data vào TRƯỚC nút chứa số chẵn đầu tiên
 * tính từ đầu danh sách, sau đó trả về true.
 * Nếu danh sách không có số chẵn nào thì KHÔNG thêm và trả về false.
 * Ví dụ: Danh sách 3, 7, 4, 9 → gọi addBeforeFirstEven(10)
 * → danh sách: 3, 7, 10, 4, 9 và trả về true.
 * Chú ý trường hợp đặc biệt: số chẵn đầu tiên chính là head!
 *
 * 5. countPrime()
 * Trả về số lượng phần tử trong danh sách là số nguyên tố.
 * Số nguyên tố: số nguyên > 1, chỉ chia hết cho 1 và chính nó.
 * Nếu danh sách rỗng thì trả về 0.
 * Ví dụ: Danh sách 3, 7, 10, 4, 9 → countPrime() = 2 (là 3 và 7).
 *
 * Sinh viên tự định nghĩa phương thức print() in danh sách ra màn hình
 * và định nghĩa lớp Test chứa phương thức main để kiểm tra lại bài làm.
 */
public class IntLinkedList implements ListInterface<Integer> {

    private Node<Integer> head;

    public IntLinkedList() {
        this.head = null;
    }

    // ============================================================
    // [2] getHead()
    // ============================================================
    @Override
    public Node<Integer> getHead() {
        return this.head;
    }

    // ============================================================
    // [3] addLast(int data)
    // Gợi ý:
    // - Nếu head == null: tạo nút mới, gán cho head
    // - Nếu không: duyệt tới nút cuối (curr.getNext() == null), rồi setNext
    // ============================================================
    public void addLast(int data) {
        Node<Integer> newNode = new Node<>(data);
        if (head == null) {
            this.head = newNode;
            return;
        }
        Node<Integer> curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(newNode);
    }

    // ============================================================
    // [4] addBeforeFirstEven(int data)
    // Gợi ý:
    // TH1 - head là số chẵn: tạo nút mới, newNode.setNext(head), head = newNode →
    // true
    // TH2 - số chẵn ở giữa/cuối: duyệt, giữ con trỏ prev; khi curr.getData() % 2 ==
    // 0
    // → tạo nút mới, prev.setNext(newNode), newNode.setNext(curr) → true
    // TH3 - không có số chẵn: return false
    // ============================================================
    public boolean addBeforeFirstEven(int data) {
        if (head == null) {
            return false;
        }
        Node<Integer> newNode = new Node<>(data);
        Node<Integer> curr = head.getNext();
        if (head.getData() % 2 == 0) {
            newNode.setNext(head);
            head = newNode;
            return true;
        }
        Node<Integer> prev = head;
        while (curr != null) {
            if (curr.getData() % 2 == 0) {
                newNode.setNext(curr);
                prev.setNext(newNode);
                return true;
            }
            prev = prev.getNext();
            curr = curr.getNext();
        }
        return false;
    }

    // ============================================================
    // [5] countPrime()
    // Gợi ý: Duyệt danh sách, dùng isPrime() để đếm
    // ============================================================
    public int countPrime() {
        Node<Integer> curr = head;
        int count = 0;
        while (curr != null) {
            if (isPrime(curr.getData())) {
                count++;
            }
            curr = curr.getNext();
        }
        return count;
    }

    // Hàm hỗ trợ: kiểm tra số nguyên tố
    // Gợi ý: n <= 1 → false; for i = 2; i*i <= n; nếu n%i==0 → false; return true
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // ============================================================
    // [6] print() - in danh sách ra màn hình
    // ============================================================
    @Override
    public void print() {
        Node<Integer> curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
    }

    // ============================================================
    // Các phương thức còn lại của ListInterface (đã implement sẵn,
    // sinh viên không cần thay đổi)
    // ============================================================
    @Override
    public void addFirst(Integer item) {
        Node<Integer> newNode = new Node<>(item);
        newNode.setNext(head);
        head = newNode;
    }

    @Override
    public void addAfter(Node<Integer> curr, Integer item) {
        if (curr == null)
            return;
        Node<Integer> newNode = new Node<>(item, curr.getNext());
        curr.setNext(newNode);
    }

    @Override
    public void addLast(Integer item) {
        addLast((int) item);
    }

    @Override
    public Integer removeFirst() throws NoSuchElementException {
        if (head == null)
            throw new NoSuchElementException();
        Integer val = head.getData();
        head = head.getNext();
        return val;
    }

    @Override
    public Integer removeAfter(Node<Integer> curr) throws NoSuchElementException {
        if (curr == null || curr.getNext() == null)
            throw new NoSuchElementException();
        Node<Integer> toRemove = curr.getNext();
        curr.setNext(toRemove.getNext());
        return toRemove.getData();
    }

    @Override
    public Integer removeLast() throws NoSuchElementException {
        if (head == null)
            throw new NoSuchElementException();
        if (head.getNext() == null) {
            Integer val = head.getData();
            head = null;
            return val;
        }
        Node<Integer> curr = head;
        while (curr.getNext().getNext() != null)
            curr = curr.getNext();
        Integer val = curr.getNext().getData();
        curr.setNext(null);
        return val;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Integer getFirst() throws NoSuchElementException {
        if (head == null)
            throw new NoSuchElementException();
        return head.getData();
    }

    @Override
    public int size() {
        int count = 0;
        Node<Integer> curr = head;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }
        return count;
    }

    @Override
    public boolean contains(Integer item) {
        Node<Integer> curr = head;
        while (curr != null) {
            if (curr.getData().equals(item))
                return true;
            curr = curr.getNext();
        }
        return false;
    }
}
