package lc.twopointer.m;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
};

public class LowestCommonAncestorOfABinaryTreeIII {
    // O(n) O(1)
    public Node lowestCommonAncestor(Node p, Node q) {
        Node a = p, b = q;
        while (a != b) {
            a = a.parent == null ? q : a.parent;
            b = b.parent == null ? p : b.parent;
        }
        return a;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        Node node5 = new Node(5);
        Node node1 = new Node(1);
        Node node6 = new Node(6);
        Node node2 = new Node(2);
        Node node0 = new Node(0);
        Node node8 = new Node(8);
        Node node7 = new Node(7);
        Node node4 = new Node(4);
        root.left = node5;      // root level
        root.right = node1;
        node5.parent = root;
        node1.parent = root;
        node5.left = node6;     // 1st level left
        node5.right = node2;
        node6.parent = node5;
        node2.parent = node5;
        node1.left = node0;     // 1st level right
        node1.right = node8;
        node0.parent = node1;
        node8.parent = node1;
        node2.left = node7;     // 2st level left
        node2.right = node4;
        node7.parent = node2;
        node4.parent = node2;
        Node p = node5;
        Node q = node1;
        Node lca = new LowestCommonAncestorOfABinaryTreeIII().lowestCommonAncestor(p, q);
        System.out.println("For p " + p.val + " q " + q.val + " LCA = " + lca.val);
}
}
