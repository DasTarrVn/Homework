public class MyQueue<E> implements QueueInterface<E> {
    private Node<E> front;
    private Node<E> rear;
    private int numNode;

    public MyQueue() {
        this.front = null;
        this.rear = null;
        this.numNode = 0;
    }

    @Override
    public void enQueue(E item) {
        Node<E> newNode = new Node<E>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        numNode++;
    }

    @Override
    public E deQueue() {
        if (isEmpty()) {
            return null;
        }
        E data = front.getData();
        front = front.getNext();
        numNode--;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    @Override
    public int size() {
        return numNode;
    }

    @Override
    public boolean contains(E item) {
        Node<E> curr = front;
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
            System.out.println("Queue rong");
            return;
        }
        Node<E> curr = front;
        System.out.print("Queue: ");
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
    public E getFront() {
        if (isEmpty()) {
            return null;
        }
        return front.getData();
    }
}
