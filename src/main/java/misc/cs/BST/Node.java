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
        node.left   = new Node();
        node.right  = new Node();
    }

    boolean nodeExists(Node node) {
        return node.key != null;
    }

    void insert(Node node, int key, int value) {
        if (!nodeExists(node)) createNode(node, key, value);
        else if (key < node.key)
            insert(node.left, key, value);
        else
            insert(node.right, key, value);
    }

    public static void main(String[] args) {

        Node root = new Node();

        root.insert(root, 3, 12);
        root.insert(root, 1, 6);
        root.insert(root, 12, 33);
        System.out.println(root.value);
        System.out.println(root.value);
        System.out.println(root.value);
    }
}
