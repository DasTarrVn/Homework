public class CharLinkedList implements ListInterface {
    private Node head;

    public CharLinkedList() {
        this.head = null;
    }

    @Override

    public Node getHead() {
        return this.head;
    }

    @Override

    public void addFirst(char data) {
        Node newNode = new Node(data, null);
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    /*
     * Hoac
     * public void addFirst(char data){
     * this.head = new Node(data, this.head);
     * }
     */
    @Override
    public boolean addAfterFirstKey(char data, char key) {
        Node curr = this.head;
        while (curr != null) {
            if (curr.getData() == key) {
                Node newNode = new Node(data, curr.getNext());
                curr.setNext(newNode);
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    @Override

    public int largestCharPosition() {
        if (this.head == null) {
            return -1;
        }
        int currIndex = 0;
        char maxChar = this.head.getData();
        int maxIndex = 0;
        Node curr = this.head;
        while (curr != null) {
            if (curr.getData() > maxChar) {
                maxChar = curr.getData();
                maxIndex = currIndex;
            }
            currIndex++;
            curr = curr.getNext();
        }
        return maxIndex;

    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }
}
