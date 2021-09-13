package misc.binaryTreeAndBST;

/**
 * Binary Tree Example
 */
public class BinaryTreeSandbox {

    public static void main(String[] args) {
        Node root = new Node();
        // root.createNode(root, 1, 2);
        root.insert(root,3,12);
        root.insert(root,1,6);
        root.insert(root,2,33);
        System.out.println(root.value);
        System.out.println(root.nodeExist(root));
        System.out.println(root.search(root, 1));
    }
}

class Node {
    Integer key = null;
    Integer value = null;
    Node left = null;
    Node right = null;

    void createNode(Node node, int key, int value) {
        node.key    = key;
        node.value  = value;
        node.left   = new Node();
        node.right   = new Node();
    }

    boolean nodeExist(Node node) {
        return node.key != null;
    }

    void insert(Node node, int key, int value) {
        if (!nodeExist(node)) createNode(node, key, value);
        else if (key < node.key)
            insert(node.left, key, value);
        else
            insert(node.right, key, value);
    }

    Node search(Node node, int key) {
        if (!nodeExist(node)) return null;
        if (key == node.key) return node;
        return (key < node.key)
                ? search(node.left, key)
                : search(node.right, key);
    }

    Node getMin(Node node) {
        if (!nodeExist(node)) return null;
        if (!nodeExist(node.left)) return node;
        return getMin(node.left);
    }

    Node getMax(Node node) {
        if (!nodeExist(node)) return null;
        if (!nodeExist(node.right)) return node;
        return getMin(node.right);
    }

    /**
     * in-order traversal
     * sorting
     * @return
     */
    void inOrderTraversal(Node node) {
        if (!nodeExist(node)) return;
        inOrderTraversal(node.left);
        System.out.println(node.value);
        inOrderTraversal(node.right);
    }

    /**
     * post-order traversal
     * copy, clone
     * @return
     */
    void postOrderTraversal(Node node) {
        if (!nodeExist(node)) return;
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
        System.out.println(node.value);
    }

    /**
     * pre-order traversal
     * delete, cascade
     * @return
     */
    void preOrderTraversal(Node node) {
        if (!nodeExist(node)) return;
        System.out.println(node.value);
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
    }


    /**
     * delete node from BinaryTree
     * @return
     */
    void transplantNode(Node toNode, Node fromNode) {
        toNode.key = fromNode.key;
        toNode.value = fromNode.value;
        toNode.left = fromNode.left;
        toNode.right = toNode.right;
    }

    int getChildrenCount(Node node) {
        int count = 0;
        if (nodeExist(node.left)) count += 1;
        if (nodeExist(node.right)) count += 1;
        return count;
    }

    Node getChildOrNil(Node node) {
        return nodeExist(node.left)
                ? node.left
                : node.right;
    }

    void removeNodeWithOneZeroChild(Node nodeToDelete) {
        Node childOrNil = getChildOrNil(nodeToDelete);
        transplantNode(nodeToDelete, childOrNil);
    }

    boolean remove (Node root, int key) {
        Node nodeToDelete = search(root, key);
        if (nodeToDelete == null) return false;
        int childrenCount = getChildrenCount(nodeToDelete);
        if (childrenCount < 2) {
            removeNodeWithOneZeroChild(nodeToDelete);
        } else {
            Node minNode = getMin(nodeToDelete.right);
            nodeToDelete.key = minNode.key;
            nodeToDelete.value = minNode.value;
            removeNodeWithOneZeroChild(minNode);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value=" + value +
                /*", left=" + left +
                ", right=" + right +*/
                '}';
    }
}
