import java.util.NoSuchElementException;

public class MyIntLinkedList {
    private IntNode head;
    private int numNode;

    public MyIntLinkedList() {
        head = null;
        numNode = 0;
    }

    public void addFirst(int item) {
        head = new IntNode(item, head);
        numNode++;
    }

    public void addAfter(IntNode curr, int item) {
        if (curr == null) {
            addFirst(item);
        } else {
            IntNode newNode = new IntNode(item, curr.getNext());
            curr.setNext(newNode);
            numNode++;
        }
    }

    public void addLast(int item) {
        if (head == null) {
            addFirst(item);
        } else {
            IntNode tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            IntNode newNode = new IntNode(item, null);
            tmp.setNext(newNode);
            numNode++;
        }
    }

    public int removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            IntNode tmp = head;
            head = head.getNext();
            numNode--;
            return tmp.getData();
        }
    }

    public int removeAfter(IntNode curr) throws NoSuchElementException {
        if (curr == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            IntNode delNode = curr.getNext();
            if (delNode != null) {
                curr.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            } else {
                throw new NoSuchElementException("No next node to remove");
            }
        }
    }

    public int removeLast() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            IntNode preNode = null;
            IntNode delNode = head;
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

    public Integer removeCurr(IntNode curr) {
        if (head == null || curr == null) {
            return null;
        }
        if (head == curr) {
            return removeFirst();
        }
        IntNode pre = head;
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
            IntNode tmp = head;
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

    public int getFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't get element from an empty list");
        } else {
            return head.getData();
        }
    }

    public IntNode getHead() {
        return head;
    }

    public int size() {
        return numNode;
    }

    public boolean contains(int item) {
        IntNode tmp = head;
        while (tmp != null) {
            if (tmp.getData() == item)
                return true;
            tmp = tmp.getNext();
        }
        return false;
    }

    // Exercise 3
    // (a) Dem so phan tu chan
    public int countEven() {
        int count = 0;
        IntNode tmp = head;
        while (tmp != null) {
            if (tmp.getData() % 2 == 0) {
                count++;
            }
            tmp = tmp.getNext();
        }
        return count;
    }

    // Ham phu kiem tra so nguyen to
    private boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // (b) Dem so phan tu la so nguyen to
    public int countPrime() {
        int count = 0;
        IntNode tmp = head;
        while (tmp != null) {
            if (isPrime(tmp.getData())) {
                count++;
            }
            tmp = tmp.getNext();
        }
        return count;
    }

    // (c) Them x vao truoc so chan dau tien
    public boolean addBeforeFirstEven(int x) {
        if (head == null)
            return false;
        if (head.getData() % 2 == 0) {
            addFirst(x);
            return true;
        }
        IntNode prev = head;
        while (prev.getNext() != null && prev.getNext().getData() % 2 != 0) {
            prev = prev.getNext();
        }
        if (prev.getNext() != null) {
            addAfter(prev, x);
            return true;
        }
        return false;
    }

    // (d) Tim so lon nhat trong danh sach
    public int findMax() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't find max from an empty list");
        }
        int max = head.getData();
        IntNode tmp = head.getNext();
        while (tmp != null) {
            if (tmp.getData() > max) {
                max = tmp.getData();
            }
            tmp = tmp.getNext();
        }
        return max;
    }

    // (e) Dao nguoc danh sach (khong dung danh sach phu)
    public void reverse() {
        IntNode prev = null;
        IntNode curr = head;
        while (curr != null) {
            IntNode next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // (f) Sap xep danh sach tang dan
    public void sortAscending() {
        for (IntNode i = head; i != null; i = i.getNext()) {
            for (IntNode j = i.getNext(); j != null; j = j.getNext()) {
                if (i.getData() > j.getData()) {
                    int temp = i.getData();
                    i.setData(j.getData());
                    j.setData(temp);
                }
            }
        }
    }
}
