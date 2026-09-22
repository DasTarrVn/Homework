public class IntNode {
    private int element;
    private IntNode next;

    public IntNode() {
        this.element = 0;
        this.next = null;
    }

    public IntNode(int data) {
        this(data, null);
    }

    public IntNode(int data, IntNode next) {
        this.element = data;
        this.next = next;
    }

    public int getData() {
        return element;
    }

    public void setData(int data) {
        this.element = data;
    }

    public IntNode getNext() {
        return next;
    }

    public void setNext(IntNode curr) {
        this.next = curr;
    }
}
