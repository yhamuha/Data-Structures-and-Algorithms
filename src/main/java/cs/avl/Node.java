package cs.avl;

public class Node {

    Node left = null;
    Node right = null;
    Integer key = null;
    Integer value = null;
    int height = -1;


    void createNode (Node node, int key, int value) {
        node.key = key;
        node.value = value;
        node.height = 0;
        node.left = new Node();
        node.right = new Node();
    }

    boolean nodeExist (Node node) {
        return node.key != null;
    }

    void updateHeight(Node node) {
        node.height = Math.max(node.left.height, node.right.height) + 1;
    }

    int getBalanceFactor(Node node) {
        return node.right.height - node.left.height;
    }

    void swapNodes(Node x, Node y) {
        int temp = x.key;
        x.key = y.key;
        y.key = temp;
        temp = x.value;
        x.value = y.value;
        y.value = temp;
    }

    int minNodesCount(int h) {
        if (h == -1) return 0;
        if (h == 0) return 1;
        return 1 + minNodesCount(h - 1)
                + minNodesCount(h - 2);
    }

    // RR
    void rightRotate(Node node) {
        swapNodes(node, node.left);
        Node nodeLinkBuffer = node.right;
        node.right = node.left;
        node.left = node.right.left;
        node.right.left = node.right.right;
        node.right.right = nodeLinkBuffer;
        updateHeight(node.right);
        updateHeight(node);
    }

    // LR
    void leftRotate(Node node) {
        swapNodes(node, node.right);
        Node nodeLinkBuffer = node.left;
        node.left = node.right;
        node.right = node.left.right;
        node.left.right = node.left.left;
        node.left.left = nodeLinkBuffer;
        updateHeight(node.left);
        updateHeight(node);
    }
}
