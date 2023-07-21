package cs.bst;

public class Node {
    Integer key = null;
    Integer value = null;
    Node left = null;
    Node right = null;

    static void createNode(Node node, int key, int value) {
        node.key = key;
        node.value = value;
        node.left = new Node();
        node.right = new Node();
    }

    static boolean nodeExist(Node node) {
        return node.key != null;
    }

    static void insert(Node node, int key, int value) {
        if (!nodeExist(node)) createNode(node, key, value);
        else if (key < node.key)
            insert(node.left, key, value);
        else
            insert(node.right, key, value);
    }

    // node : root
    static Node search(Node node, int key) {
        if (!nodeExist(node)) return null;
        if (node.key == key) return node;
        return (key < node.key)
                ? search(node.left, key)
                : search(node.right, key);
    }

    static Node getMin(Node node) {
        if (!nodeExist(node)) return null;
        if (!nodeExist(node.left)) return node;
        return getMin(node.left);
    }

    static Node getMax(Node node) {
        if (!nodeExist(node)) return null;
        if (!nodeExist(node.right)) return node;
        return getMax(node.right);
    }

    // symmetric l-t-r
    static void inOrderTraversal(Node node) {
        if (!nodeExist(node)) return;
        inOrderTraversal(node.left);
        System.out.println(node.value);
        inOrderTraversal(node.right);
    }

    // backward l-r-t
    static void postOrderTraversal(Node node) {
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
        System.out.println(node.value);
    }

    // straight t-l-r
    static void preOrderTraversal(Node node) {
        System.out.println(node.value);
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
    }

    void transplantNode(Node toNode, Node fromNode) {
        toNode.key = fromNode.key;
        toNode.value = fromNode.value;
        toNode.left = fromNode.left;
        toNode.right = fromNode.right;
    }

    Node getChildOrNil(Node node) {
        return nodeExist(node.left)
                ? node.left
                : node.right;
    }

    int getChildrenCount(Node node) {
        int count = 0;
        if (nodeExist(node.left)) count += 1;
        if (nodeExist(node.right)) count += 1;
        return count;
    }

    void removeNodeWithOneOrZeroChild(Node nodeToDelete) {
        Node childOrNil = getChildOrNil(nodeToDelete);
        transplantNode(nodeToDelete, childOrNil);
    }

    boolean remove (Node root, int key) {

        // search node
        Node nodeToDelete = search(root, key);
        if (nodeToDelete == null) return false;

        int childrenCount = getChildrenCount(nodeToDelete);

        if (childrenCount < 2) {
            // replace child to the deleted node place
            removeNodeWithOneOrZeroChild(nodeToDelete);
        } else {
            // getMin node in the right subTree
            Node minNode = getMin(nodeToDelete.right);

            // copy min key and value
            nodeToDelete.key = minNode.key;
            nodeToDelete.value = minNode.value;
            // remove min node
            removeNodeWithOneOrZeroChild(minNode);
        }
        return true;
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
        System.out.print(root.left.key);
        System.out.println(" " + root.right.key);

        System.out.println(search(root, 3));

        System.out.println(getMin(root));
        System.out.println(getMax(root));

        inOrderTraversal(root);

    }
}


