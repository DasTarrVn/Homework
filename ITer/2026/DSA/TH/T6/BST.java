import java.util.LinkedList;
import java.util.Queue;

public class BST {
    Node root;

    public BST() {
    }

    public BST(Node root) {
        this.root = root;
    }

    public void insert(Integer data) {
        this.root = insert(this.root, data);
    }

    public Node insert(Node curr, Integer data) {
        if (curr == null) {
            return new Node(data);
        }
        // CoMPare
        int cmp = data.compareTo(curr.getData());
        if (cmp < 0) {
            curr.left = insert(curr.left, data);
        } else if (cmp > 0) {
            curr.right = insert(curr.right, data);
        } else {
            curr.data = data;
        }
        return curr;
    }

    public void printDescending() {
        printDescending(this.root);
        System.out.println();
    }

    public void printDescending(Node node) {
        if (node != null) {
            printDescending(node.right);
            System.out.print(node.data + " ");
            printDescending(node.left);
        }
    }

    public boolean contains(Integer key) {
        return contains(this.root, key);
    }

    public boolean contains(Node x, Integer key) {
        if (x == null)
            return false;
        int cmp = key.compareTo(x.data);
        if (cmp < 0)
            return contains(x.left, key);
        else if (cmp > 0)
            return contains(x.right, key);
        else
            return true;
    }

    public void deleteMax() {
        if (this.root != null) {
            this.root = deleteMax(this.root);
        }
    }

    public Node deleteMax(Node x) {
        if (x.right == null)
            return x.left;
        x.right = deleteMax(x.right);
        return x;
    }

    public Node max(Node x) {
        if (x.right == null)
            return x;
        return max(x.right);
    }

    public void delete_pre(Integer key) {
        this.root = delete_pre(this.root, key);
    }

    public Node delete_pre(Node x, Integer key) {
        if (x == null)
            return null;
        int cmp = key.compareTo(x.data);
        if (cmp < 0) {
            x.left = delete_pre(x.left, key);
        } else if (cmp > 0) {
            x.right = delete_pre(x.right, key);
        } else {
            // 0/1 con
            if (x.right == null)
                return x.left;
            if (x.left == null)
                return x.right;

            // 2 con dung con lon hon
            Node temp = x;
            x = max(temp.left);
            x.left = deleteMax(temp.left);
            x.right = temp.right;
        }
        return x;
    }

    public int height() {
        return height(this.root);
    }

    public int height(Node x) {
        if (x == null)
            return -1;
        return 1 + Math.max(height(x.left), height(x.right));
    }

    public Integer sum() {
        return sum(this.root);
    }

    public Integer sum(Node x) {
        if (x == null)
            return 0;
        return x.data + sum(x.left) + sum(x.right);
    }

    public Integer sumEven() {
        return sumEven(this.root);
    }

    public Integer sumEven(Node x) {
        if (x == null)
            return 0;
        int currentVal = (x.data % 2 == 0) ? x.data : 0;
        return currentVal + sumEven(x.left) + sumEven(x.right);
    }

    public int countLeaves() {
        return countLeaves(this.root);
    }

    public int countLeaves(Node x) {
        if (x == null)
            return 0;
        if (x.left == null && x.right == null)
            return 1;
        return countLeaves(x.left) + countLeaves(x.right);
    }

    public int sumEvenKeysAtLeaves() {
        return sumEvenKeysAtLeaves(this.root);
    }

    public int sumEvenKeysAtLeaves(Node x) {
        if (x == null)
            return 0;
        if (x.left == null && x.right == null) {
            return (x.data % 2 == 0) ? x.data : 0;
        }
        return sumEvenKeysAtLeaves(x.left) + sumEvenKeysAtLeaves(x.right);
    }

    public void bfs() {
        if (this.root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println();
    }
}
