public class DoubleNode {
    private double data;
    private DoubleNode next;
    private DoubleNode prev;

    public DoubleNode() {
        this.data = 0.0;
        this.next = null;
        this.prev = null;
    }

    public DoubleNode(double data) {
        this(data, null, null);
    }

    public DoubleNode(double data, DoubleNode next, DoubleNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }
}
