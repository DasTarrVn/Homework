public class Main {
    public static BST createTree(String strKey) {
        BST tree = new BST();
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
        String input = "40 25 78 10 32 50 93 3 17 30 38";
        BST myBST = createTree(input);

        System.out.print("Ex 3\n");
        myBST.printDescending();
        System.out.println("Ex 4\n" + myBST.contains(32)); // true
        System.out.println("Ex 4\n" + myBST.contains(99)); // false
        System.out.println("Ex 7\n" + myBST.height()); // 3
        System.out.println("Ex 8\n" + myBST.sum()); // 416
        System.out.println("Ex 9\n" + myBST.sumEven()); // 248
        System.out.println("Ex 10\n" + myBST.countLeaves()); // 5
        System.out.println("Ex 11\n" + myBST.sumEvenKeysAtLeaves()); // 68 (30 + 38)
        System.out.print("Ex 12\n");
        myBST.bfs();
        System.out.print("Ex 5\n");
        myBST.deleteMax();
        myBST.bfs();
        System.out.print("Ex 6\n");
        myBST.delete_pre(25);
        myBST.bfs();
    }
}