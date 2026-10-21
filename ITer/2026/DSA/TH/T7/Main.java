public class Main {
    public static AVL createTree(String strKey) {
        AVL tree = new AVL();
        if (strKey == null || strKey.trim().isEmpty()) {
            return tree;
        }
        String[] nums = strKey.trim().split("\\s+");
        for (String num : nums) {
            tree.insert(Integer.parseInt(num));
        }
        return tree;
    }

    public static void main(String[] args) {
        AVL llTree = createTree("30 20 10");
        System.out.print("LL Case (insert 30, 20, 10) -> BFS: ");
        llTree.bfs(); // Goc thanh 20, con trai 10, con phai 30
        AVL rrTree = createTree("10 20 30");
        System.out.print("RR Case (insert 10, 20, 30) -> BFS: ");
        rrTree.bfs(); // Goc thanh 20, con trai 10, con phai 30
        AVL lrTree = createTree("30 10 20");
        System.out.print("LR Case (insert 30, 10, 20) -> BFS: ");
        lrTree.bfs(); // Goc thanh 20, con trai 10, con phai 30
        AVL rlTree = createTree("10 30 20");
        System.out.print("RL Case (insert 10, 30, 20) -> BFS: ");
        rlTree.bfs(); // Goc thanh 20, con trai 10, con phai 30
        AVL fig1Tree = createTree("41 20 65 11 29 50 91 32 72 99");
        System.out.print("BFS (theo muc): ");
        fig1Tree.bfs();
        System.out.println("Chieu cao cay (root height): " + fig1Tree.height());
        System.out.print("Pre-order (NLR): ");
        fig1Tree.NLR();
        System.out.print("In-order (LNR): ");
        fig1Tree.LNR();
        System.out.println("Contains 29: " + fig1Tree.contains(29));
        System.out.println("Contains 100: " + fig1Tree.contains(100));
        System.out.print("Truoc khi xoa 20 -> BFS: ");
        fig1Tree.bfs();
        fig1Tree.delete(20);
        System.out.print("Sau khi xoa 20   -> BFS: ");
        fig1Tree.bfs();
        System.out.println("Chieu cao sau khi xoa: " + fig1Tree.height());
    }
}
