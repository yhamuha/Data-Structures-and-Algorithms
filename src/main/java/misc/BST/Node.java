package misc.BST;

/**
 * classic BST
 */
public class Node {

    Integer key;
    Integer value;
    Node left = null;
    Node right = null;

    void createNode(Node node, int key, int value) {
        node.key = key;
        node.value = value;
        node.left = new Node();
        node.right = new Node();
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
        if (!nodeExists(node)) return null;
        if (key == node.key) return node;
        return (key < node.key)
                ? search(node.left, key)
        : search(node.right, key);
        }

    void transplantNode(Node toNode, Node fromNode) {
        toNode.key = fromNode.key;
        toNode.value = fromNode.value;
        toNode.left = fromNode.left;
        toNode.right = fromNode.right;
    }

    int getChildrenCount(Node node) {
        int count = 0;
        if (nodeExists(node.left)) count += 1;
        if (nodeExists(node.right)) count += 1;
        return count;
    }

    Node getChildOrNil(Node node) {
        return nodeExists(node.left)
                ? node.left
                : node.right;
    }

    void removeNodeWithOneOrZeroChild(Node nodeToDelete) {
        Node childOrNil = getChildOrNil(nodeToDelete);
        transplantNode(nodeToDelete, childOrNil);
    }

    Node getMin(Node node) {
        if (!nodeExists(node)) return null;
        if (!nodeExists(node.left)) return node;
        return getMin(node.left);
        }

    Node getMax(Node node) {
        if (!nodeExists(node)) return null;
        if (!nodeExists(node.right)) return node;
        return getMax(node.right);
    }

    boolean remove(Node root, int key) {
        Node nodeToDelete = search(root, key);
        if (nodeToDelete == null) return false;
        int childrenCount = getChildrenCount(nodeToDelete);
        if (childrenCount < 2) {
            removeNodeWithOneOrZeroChild(nodeToDelete);
        } else {
            Node minNode = getMin(nodeToDelete.right);
            nodeToDelete.key = minNode.key;
            nodeToDelete.value = minNode.value;
            removeNodeWithOneOrZeroChild(minNode);
        }
        return true;
    }

    void showNodesInOrder(Node node) {
        if (!nodeExists(node)) return;
        System.out.print(node.left.value + " ");
        System.out.print(node.value + " ");
        System.out.print(node.right.value);
    }

    void postOrderTraversal(Node node) {
        if (!nodeExists(node)) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");
        }

    void preOrderTraversal(Node node) {
        if (!nodeExists(node)) return;
        System.out.print(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
        }

    // driver code
    public static void main(String[] args) {
        Node root = new Node();
        root.insert(root, 3, 12);
        root.insert(root, 1, 6);
        root.insert(root, 4, 32);

        System.out.println(   "\t12\n"
                            + "6\t\t32");
        System.out.println();
        System.out.print("in-order:\t"); root.showNodesInOrder(root);
        System.out.println();
        System.out.print("post-order:\t"); root.postOrderTraversal(root);
        System.out.println();
        System.out.print("pre-order:\t"); root.preOrderTraversal(root);
    }


    @Override
    public String toString() {
        return "value = " + value;
    }
}
