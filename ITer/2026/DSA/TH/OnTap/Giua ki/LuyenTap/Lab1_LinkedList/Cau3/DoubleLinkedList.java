/**
 * ============================================================
 * ĐỀ BÀI - Câu 3 (3 điểm) [Bài tập mở rộng]
 * ============================================================
 *
 * Dựa vào file Node.java đính kèm trong thư mục
 * (sinh viên KHÔNG chỉnh sửa hoặc thêm code trên file này),
 * sinh viên định nghĩa lớp DoubleLinkedList tạo ra danh sách liên kết
 * chứa các số thực (double).
 *
 * Định nghĩa các phương thức trong lớp DoubleLinkedList:
 *
 * 1. DoubleLinkedList()
 *    Phương thức khởi tạo không tham số, gán head = null.
 *
 * 2. getHead()
 *    Trả về head của danh sách liên kết.
 *
 * 3. addLast(double data)
 *    Thêm vào cuối danh sách một nút có giá trị data.
 *
 * 4. addAfterIndex(double data, int index)
 *    Thêm một nút với giá trị data vào SAU nút ở vị trí index (bắt đầu từ 0),
 *    sau đó trả về true.
 *    Nếu index không hợp lệ (index < 0 hoặc index >= size()) thì KHÔNG thêm,
 *    trả về false.
 *    Ví dụ: Danh sách 1.5, 2.7, 3.0, 4.8 (vị trí 0, 1, 2, 3)
 *    Gọi addAfterIndex(9.9, 1) → danh sách: 1.5, 2.7, 9.9, 3.0, 4.8  trả về true.
 *
 * 5. sumPositive()
 *    Tính và trả về tổng các phần tử DƯƠNG (> 0) trong danh sách.
 *    Nếu danh sách rỗng hoặc không có phần tử dương thì trả về 0.
 *    Ví dụ: Danh sách -1.5, 2.0, -3.0, 4.5 → sumPositive() = 6.5.
 *
 * Sinh viên tự định nghĩa phương thức print() in danh sách ra màn hình
 * và định nghĩa lớp Test chứa phương thức main để kiểm tra lại bài làm.
 */
public class DoubleLinkedList {

    private Node<Double> head;

    // ============================================================
    // [1] Constructor
    // ============================================================
    public DoubleLinkedList() {
        // TODO: gán head = null
    }

    // ============================================================
    // [2] getHead()
    // ============================================================
    public Node<Double> getHead() {
        return null; // TODO
    }

    // ============================================================
    // [3] addLast(double data)
    // Gợi ý: tương tự addLast của IntLinkedList
    // ============================================================
    public void addLast(double data) {
        // TODO
    }

    // ============================================================
    // [4] addAfterIndex(double data, int index)
    // Gợi ý:
    //   Kiểm tra: index < 0 hoặc index >= size() → return false
    //   Duyệt đến nút ở vị trí index, thêm nút mới sau nó → return true
    // ============================================================
    public boolean addAfterIndex(double data, int index) {
        return false; // TODO
    }

    // ============================================================
    // [5] sumPositive()
    // Gợi ý: Duyệt danh sách, cộng dồn các phần tử có getData() > 0
    // ============================================================
    public double sumPositive() {
        return 0; // TODO
    }

    // ============================================================
    // [6] print()
    // ============================================================
    public void print() {
        // TODO
    }

    // Hàm hỗ trợ: trả về kích thước danh sách
    public int size() {
        int count = 0;
        Node<Double> curr = head;
        while (curr != null) { count++; curr = curr.getNext(); }
        return count;
    }
}
