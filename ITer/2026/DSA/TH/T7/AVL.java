import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    public Node root;

    public AVL() {
        this.root = null;
    }

    public AVL(Node root) {
        this.root = root;
    }

    public int height() {
        return height(this.root);
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public int checkBalance(Node x) {
        if (x == null) {
            return 0;
        }
        return height(x.left) - height(x.right);
    }

    // Quay trai (Left rotation)
    public Node rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    public Node rotateRight(Node x) {
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    public Node balance(Node x) {
        if (x == null) {
            return null;
        }

        if (checkBalance(x) < -1) {
            if (checkBalance(x.right) > 0) {
                x.right = rotateRight(x.right);
            }
            x = rotateLeft(x);
        } else if (checkBalance(x) > 1) {
            if (checkBalance(x.left) < 0) {
                x.left = rotateLeft(x.left);
            }
            x = rotateRight(x);
        }
        return x;
    }

    // Chen nut
    public void insert(Integer key) {
        this.root = insert(this.root, key);
    }

    public Node insert(Node curr, Integer key) {
        if (curr == null) {
            return new Node(key);
        }

        int cmp = key.compareTo(curr.key);
        if (cmp < 0) {
            curr.left = insert(curr.left, key);
        } else if (cmp > 0) {
            curr.right = insert(curr.right, key);
        } else {
            curr.key = key;
            return curr;
        }

        curr.height = 1 + Math.max(height(curr.left), height(curr.right));
        return balance(curr);
    }

    // Tim nut nho nhat (dung de tim successor khi xoa)
    public Node min() {
        return min(this.root);
    }

    public Node min(Node x) {
        if (x == null) {
            return null;
        }
        if (x.left == null) {
            return x;
        }
        return min(x.left);
    }

    public void delete(Integer key) {
        if (this.root != null && key != null) {
            this.root = delete(this.root, key);
        }
    }

    public Node delete(Node x, Integer key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = delete(x.left, key);
        } else if (cmp > 0) {
            x.right = delete(x.right, key);
        } else {
            // Nut can xoa co 0 hoac 1 con
            if (x.left == null) {
                return x.right;
            } else if (x.right == null) {
                return x.left;
            } else {
                // Nut co 2 con: dung successor (nut nho nhat ben phai)
                Node successor = min(x.right);
                x.key = successor.key;
                x.right = delete(x.right, successor.key);
            }
        }

        x.height = 1 + Math.max(height(x.left), height(x.right));
        return balance(x);
    }

    // Tim kiem (Search / Contains)
    public boolean contains(Integer key) {
        return search(this.root, key) != null;
    }

    public Node search(Integer key) {
        return search(this.root, key);
    }

    public Node search(Node x, Integer key) {
        if (x == null || key == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return search(x.left, key);
        } else if (cmp > 0) {
            return search(x.right, key);
        } else {
            return x;
        }
    }

    // Duyet cay theo thu tu truoc (Pre-order / NLR)
    public void NLR() {
        NLR(this.root);
        System.out.println();
    }

    public void NLR(Node x) {
        if (x != null) {
            System.out.print(x.key + " ");
            NLR(x.left);
            NLR(x.right);
        }
    }

    // Duyet cay theo thu tu giua (In-order / LNR)
    public void LNR() {
        LNR(this.root);
        System.out.println();
    }

    public void LNR(Node x) {
        if (x != null) {
            LNR(x.left);
            System.out.print(x.key + " ");
            LNR(x.right);
        }
    }

    // Duyet cay theo muc (BFS)
    public void bfs() {
        if (this.root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.key + " ");

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
