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

    void insert(Node node, int key, int value) {
        if (!nodeExists(node)) createNode(node, key, value);
        else if (key < node.key)
            insert(node.left, key, value);
        else
            insert(node.right, key, value);
    }

    public static void main(String[] args) {

        System.out.println("===");
        Node root = new Node();
        root.createNode(root, 1, 2);
        System.out.println(root.value);
        System.out.println(root.nodeExists(root));

        System.out.println("===");
        Node node2 = new Node();
        node2.createNode(node2, 10,10);
        System.out.println(node2.value);
        System.out.println(node2.nodeExists(node2));

        System.out.println("===");
        Node node3 = new Node();
        root.insert(node3, 10, 10);
        System.out.println(node3.value);
        System.out.println(node3.nodeExists(node3));
    }
}
