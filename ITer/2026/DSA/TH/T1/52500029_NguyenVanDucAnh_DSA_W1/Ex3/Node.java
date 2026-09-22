public class Node<E> {
    private E element;
    private Node<E> next;

    public Node() {
        this.element = null;
        this.next = null;
    }

    public Node(E data) {
        this(data, null);
    }

    public Node(E data, Node<E> next) {
        this.element = data;
        this.next = next;
    }

    public E getData() {
        return element;
    }

    public void setData(E data) {
        this.element = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> curr) {
        this.next = curr;
    }
}
