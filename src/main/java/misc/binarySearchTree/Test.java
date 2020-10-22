package misc.binarySearchTree;

public class Test {
    /**
     * test node
     * @param args command line arguments (none)
     */
    public static void main(String[] args) {
        Node node = new Node();
        node.createNode(node, 1);
        node.insert(node, 2);
        node.insert(node, 3);
        node.inOrderTraversal(node);
    }
}
