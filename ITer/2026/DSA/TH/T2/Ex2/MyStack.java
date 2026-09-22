public class MyStack<E> implements StackInterface<E> {
    private Node<E> top;
    private int numNode;

    public MyStack() {
        this.top = null;
        this.numNode = 0;
    }

    @Override
    public void push(E item) {
        top = new Node<E>(item, top);
        numNode++;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E data = top.getData();
        top = top.getNext();
        numNode--;
        return data;
    }

    @Override
    public int size() {
        return numNode;
    }

    @Override
    public boolean contains(E item) {
        Node<E> curr = top;
        while (curr != null) {
            if (curr.getData() == null) {
                if (item == null) {
                    return true;
                }
            } else if (curr.getData().equals(item)) {
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack rong");
            return;
        }
        Node<E> curr = top;
        System.out.print("Stack: ");
        while (curr != null) {
            System.out.print(curr.getData());
            if (curr.getNext() != null) {
                System.out.print(" -> ");
            }
            curr = curr.getNext();
        }
        System.out.println();
    }

    @Override
    public boolean isEmpty() {
        return numNode == 0;
    }

    @Override
    public E getPeek() {
        if (isEmpty()) {
            return null;
        }
        return top.getData();
    }
}
