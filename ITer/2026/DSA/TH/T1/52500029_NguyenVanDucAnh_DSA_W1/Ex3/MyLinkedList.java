import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private Node<E> head;
    private int numNode;

    public MyLinkedList() {
        head = null;
        numNode = 0;
    }

    public void addFirst(E item) {
        head = new Node<E>(item, head);
        numNode++;
    }

    public void addAfter(Node<E> curr, E item) {
        if (curr == null) {
            addFirst(item);
        } else {
            Node<E> newNode = new Node<E>(item, curr.getNext());
            curr.setNext(newNode);
            numNode++;
        }
    }

    public void addLast(E item) {
        if (head == null) {
            addFirst(item);
        } else {
            Node<E> tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            Node<E> newNode = new Node<E>(item, null);
            tmp.setNext(newNode);
            numNode++;
        }
    }

    public E removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            Node<E> tmp = head;
            head = head.getNext();
            numNode--;
            return tmp.getData();
        }
    }

    public E removeAfter(Node<E> curr) throws NoSuchElementException {
        if (curr == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            Node<E> delNode = curr.getNext();
            if (delNode != null) {
                curr.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            } else {
                throw new NoSuchElementException("No next node to remove");
            }
        }
    }

    public E removeLast() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            Node<E> preNode = null;
            Node<E> delNode = head;
            if (delNode.getNext() == null) {
                return removeFirst();
            }
            while (delNode.getNext() != null) {
                preNode = delNode;
                delNode = delNode.getNext();
            }
            preNode.setNext(delNode.getNext());
            numNode--;
            return delNode.getData();
        }
    }

    public E removeCurr(Node<E> curr) {
        if (head == null || curr == null) {
            return null;
        }
        if (head == curr) {
            return removeFirst();
        }
        Node<E> pre = head;
        while (pre != null && pre.getNext() != curr) {
            pre = pre.getNext();
        }
        if (pre != null) {
            return removeAfter(pre);
        }
        return null;
    }

    public void print() {
        if (head != null) {
            Node<E> tmp = head;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while (tmp != null) {
                System.out.print(" -> " + tmp.getData());
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

    public E getFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't get element from an empty list");
        } else {
            return head.getData();
        }
    }

    public Node<E> getHead() {
        return head;
    }

    public int size() {
        return numNode;
    }

    public boolean contains(E item) {
        Node<E> tmp = head;
        while (tmp != null) {
            if (tmp.getData().equals(item))
                return true;
            tmp = tmp.getNext();
        }
        return false;
    }

    // ==========================================
    // Exercise 3
    // ==========================================

    // (a) Dem so phan tu chan
    public int countEven() {
        int count = 0;
        Node<E> tmp = head;
        while (tmp != null) {
            if ((Integer) tmp.getData() % 2 == 0) {
                count++;
            }
            tmp = tmp.getNext();
        }
        return count;
    }

    // Ham phu kiem tra so nguyen to
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // (b) Dem so phan tu la so nguyen to
    public int countPrime() {
        int count = 0;
        Node<E> tmp = head;
        while (tmp != null) {
            if (isPrime((Integer) tmp.getData())) {
                count++;
            }
            tmp = tmp.getNext();
        }
        return count;
    }

    // (c) Them x vao truoc so chan dau tien
    public boolean addBeforeFirstEven(E x) {
        if (head == null) return false;
        if ((Integer) head.getData() % 2 == 0) {
            addFirst(x);
            return true;
        }
        Node<E> prev = head;
        while (prev.getNext() != null && (Integer) prev.getNext().getData() % 2 != 0) {
            prev = prev.getNext();
        }
        if (prev.getNext() != null) {
            addAfter(prev, x);
            return true;
        }
        return false;
    }

    // (d) Tim so lon nhat trong danh sach
    public E findMax() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't find max from an empty list");
        }
        E max = head.getData();
        Node<E> tmp = head.getNext();
        while (tmp != null) {
            if ((Integer) tmp.getData() > (Integer) max) {
                max = tmp.getData();
            }
            tmp = tmp.getNext();
        }
        return max;
    }

    // (e) Dao nguoc danh sach (khong dung danh sach phu)
    public void reverse() {
        Node<E> prev = null;
        Node<E> curr = head;
        while (curr != null) {
            Node<E> next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // (f) Sap xep danh sach tang dan
    public void sortAscending() {
        for (Node<E> i = head; i != null; i = i.getNext()) {
            for (Node<E> j = i.getNext(); j != null; j = j.getNext()) {
                if ((Integer) i.getData() > (Integer) j.getData()) {
                    E temp = i.getData();
                    i.setData(j.getData());
                    j.setData(temp);
                }
            }
        }
    }
}
