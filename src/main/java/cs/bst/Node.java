package cs.bst;

public class Node {
    Integer key;
    Integer value;
    Node left;
    Node right;

    static void createNode (Node node, int key, int value) {
        node.key = key;
        node.value = value;
        node.left = new Node();
        node.right = new Node();
    }

    public static void main(String[] args) {
        Node root = new Node();
        createNode(root, 1, 2);

        Node left = new Node();
        createNode(left, 2, 3);

        Node right = new Node();
        createNode(right, 2, 3);

        System.out.println(root.key + ":" + root.value);
        System.out.print(left.key + ":" + left.value);
        System.out.print(" " + right.key + ":" + right.value);
    }
}
