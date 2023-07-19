package cs.bst;

public class Node {
    Integer key = null;
    Integer value = null;
    Node left = null;
    Node right = null;

    static void createNode (Node node, int key, int value) {
        node.key = key;
        node.value = value;
        node.left = new Node();
        node.right = new Node();
    }

    static boolean nodeExist (Node node) {
        return node.key != null;
    }

    static void insert (Node node, int key, int value) {
        if (!nodeExist(node)) createNode(node, key, value);
        else if (key < node.key)
            insert (node.left, key, value);
        else
            insert (node.right, key, value);
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

        insert(root, 3, 12);
        insert(root, 1, 6);
        insert(root, 4, 33);

        System.out.println(" " + root.key);
        System.out.print(root.left.key); System.out.println(" " + root.right.key);

    }
}
