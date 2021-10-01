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

    Node search(Node node, int key) {
        if(!nodeExists(node)) return null;
        if (key == node.key) return node;
        return (key < node.key)
                ? search(node.left, key)
                : search(node.right, key);
    }

    Node getMin(Node node) {
        if(!nodeExists(node)) return null;
        if(!nodeExists(node.left)) return node;
        return getMin(node.left);
    }

    Node getMax(Node node) {
        if(!nodeExists(node)) return null;
        if(!nodeExists(node.right)) return node;
        return getMin(node.right);
    }

    void inOrderTraversal(Node node) {
        if (!nodeExists(node)) return;
        inOrderTraversal(node.left);
        System.out.println(node.value);
        inOrderTraversal(node.right);
    }

    void preOrderTraversal(Node node) {
        if (!nodeExists(node)) return;
        System.out.println(node.value);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    void postOrderTraversal(Node node) {
        if (!nodeExists(node)) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.value);
    }

    void showNodesInOrder(Node node) {
        if (!nodeExists(node)) return;
        System.out.print(node.left.value);
        System.out.print(node.value);
        System.out.print(node.right.value);
    }
    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public static void main(String[] args) {

        Node root = new Node();

        root.insert(root, 3, 12);
        root.insert(root, 1, 6);
        root.insert(root, 12, 33);
        System.out.println(root.value);
        System.out.println(root.value);
        System.out.println(root.value);
        System.out.println(root.search(root, 12));
        System.out.println(root.getMin(root));
        System.out.println(root.getMax(root));
        System.out.println("= in-Order traversal: sort =");
        root.inOrderTraversal(root);
        System.out.println("= pre-Order traversal: clone =");
        root.preOrderTraversal(root);
        System.out.println("= post-Order traversal: delete =");
        root.postOrderTraversal(root);
    }
}
