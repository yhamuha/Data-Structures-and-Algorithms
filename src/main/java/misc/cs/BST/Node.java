package misc.cs.BST;

/**
 * Binary Search Tree
 */
public class Node {
    Integer key     = null;
    Integer value   = null;
    Node left       = null;
    Node right      = null;


    void createNode(Node node, int key, int value) {
        node.key    = key;
        node.value  = value;
        node.left   =   null;
        node.right   =   null;
    }

    boolean nodeExists(Node node) {
        return node.key != null;
    }

    public static void main(String[] args) {
        Node root = new Node();
        root.createNode(root, 1, 2);
        System.out.println(root.value);
        System.out.println(root.nodeExists(root));
    }
}
