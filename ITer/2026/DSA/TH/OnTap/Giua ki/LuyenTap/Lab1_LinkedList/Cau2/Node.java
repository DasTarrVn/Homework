/**
 * Lớp Node đại diện cho một nút trong danh sách liên kết.
 * SINH VIÊN KHÔNG CHỈNH SỬA FILE NÀY.
 */
public class Node<E> {
    private E data;
    private Node<E> next;

    public Node() { data = null; next = null; }
    public Node(E data) { this(data, null); }
    public Node(E data, Node<E> next) { this.data = data; this.next = next; }
    public Node<E> getNext() { return next; }
    public E getData() { return data; }
    public void setNext(Node<E> n) { next = n; }
    public void setData(E data) { this.data = data; }
}
