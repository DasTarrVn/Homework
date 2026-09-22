import java.util.NoSuchElementException;

public class MyDoubleLinkedList {
    private DoubleNode head;
    private int numNode;

    public MyDoubleLinkedList() {
        head = null;
        numNode = 0;
    }

    public void addFirst(double item) {
        DoubleNode newNode = new DoubleNode(item, head, null);
        if (head != null) {
            head.setPrev(newNode);
        }
        head = newNode;
        numNode++;
    }

    public void addLast(double item) {
        if (head == null) {
            addFirst(item);
        } else {
            DoubleNode tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            DoubleNode newNode = new DoubleNode(item, null, tmp);
            tmp.setNext(newNode);
            numNode++;
        }
    }

    public void addAfter(DoubleNode curr, double item) {
        if (curr == null) {
            addFirst(item);
        } else {
            DoubleNode nextNode = curr.getNext();
            DoubleNode newNode = new DoubleNode(item, nextNode, curr);
            curr.setNext(newNode);
            if (nextNode != null) {
                nextNode.setPrev(newNode);
            }
            numNode++;
        }
    }

    public double removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            DoubleNode tmp = head;
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            }
            numNode--;
            return tmp.getData();
        }
    }

    public double removeLast() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            if (head.getNext() == null) {
                return removeFirst();
            }
            DoubleNode tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            DoubleNode preNode = tmp.getPrev();
            preNode.setNext(null);
            numNode--;
            return tmp.getData();
        }
    }

    public Double removeCurr(DoubleNode curr) {
        if (head == null || curr == null) {
            return null;
        }
        if (head == curr) {
            return removeFirst();
        }
        if (curr.getNext() == null) {
            return removeLast();
        }
        DoubleNode preNode = curr.getPrev();
        DoubleNode nextNode = curr.getNext();
        preNode.setNext(nextNode);
        if (nextNode != null) {
            nextNode.setPrev(preNode);
        }
        numNode--;
        return curr.getData();
    }

    public DoubleNode find(double item) {
        DoubleNode tmp = head;
        while (tmp != null) {
            if (tmp.getData() == item) {
                return tmp;
            }
            tmp = tmp.getNext();
        }
        return null;
    }

    public boolean contains(double item) {
        return find(item) != null;
    }

    public void print() {
        if (head != null) {
            DoubleNode tmp = head;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while (tmp != null) {
                System.out.print(" <-> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        } else {
            System.out.println("List is empty!");
        }
    }

    public boolean isEmpty() {
        if (numNode == 0)
            return true;
        return false;
    }

    public double getFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't get element from an empty list");
        } else {
            return head.getData();
        }
    }

    public DoubleNode getHead() {
        return head;
    }

    public int size() {
        return numNode;
    }
}
