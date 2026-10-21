public class Node {
    public Integer key;
    public Integer data;
    public Node left, right;
    public int height;

    public Node(Integer key) {
        this.key = key;
        this.data = key;
        this.height = 0;
        this.left = null;
        this.right = null;
    }
}
