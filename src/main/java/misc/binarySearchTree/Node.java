package misc.binarySearchTree;

/**
 *  The {@code Node} class
 *  implements essentials methods for BTS
 */
public class Node {
    public Node left;
    public Node right;
    // Integer for possibility set value in null
    public Integer value;


    /**
     * check if node exists
     * @param node Node  - input node
     * @return  true boolean - node exists
     *          false boolean - node do not exists
     */
    boolean nodeExists(Node node) {
        return node  != null && node.value != null;
    }

    /**
     * fill in the node
     * @param node Node  - input node
     * @param value int - node value
     * @return  void
     */
    void createNode(Node node, int value) {
        node.left = new Node();
        node.right = new Node();
        node.value = value;
    }

    /**
     * insert value into node
     * @param node Node  - input node
     * @param value int - value
     * @return  void
     */
    void insert(Node node, int value) {
        if (!nodeExists(node)) createNode(node, value);
        else if (value < node.value) insert (node.left, value);
        else if (value >= node.value) insert (node.right, value);
    }

    /**
     * search node
     * @param node Node  - root
     * @param value int - searching value
     * @return  Node
     */
    Node search (Node node, int value) {
        if (!nodeExists(node)) return null;
        if (node.value ==value) return node;
        if (value < node.value) return search(node.left, value);
        return search(node.right, value);
    }

    /**
     * searching min node
     * @param node Node  - root
     * @return  min Node
     */
    Node getMin (Node node) {
        if (!nodeExists(node)) return null;
        if (!nodeExists(node.left)) return node;
        return getMin(node.left);
    }

    /**
     * searching max node
     * @param node Node  - root
     * @return  max Node
     */
    Node getMax (Node node) {
        if (!nodeExists(node)) return null;
        if (!nodeExists(node.right)) return node;
        return getMin(node.right);
    }

    /**
     * BST In-Order Traversal:
     * ( left -> root -> right )
     * @param node Node  - root
     * @return  void
     */
    void inOrderTraversal(Node node) {
        if (!nodeExists(node)) return;
        inOrderTraversal(node.left);
        System.out.println(node.value);
        inOrderTraversal(node.right);
    }

    /**
     * BST Post-Order Traversal:
     * ( left -> right -> root )
     * @param node Node  - root
     * @return  void
     */
    void postOrderTraversal(Node node) {
        if (!nodeExists(node)) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.value);
    }

    /**
     * BST Pre-Order Traversal:
     * ( left -> right -> root )
     * @param node Node  - root
     * @return  void
     */
    void preOrderTraversal(Node node) {
        if (!nodeExists(node)) return;
        System.out.println(node.value);
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
    }

    void transplantNode (Node toNode, Node fromNode) {
        toNode.value = fromNode.value;
        toNode.left = fromNode.left;
        toNode.right = fromNode.right;
    }

    int getChildrenCount(Node node) {
        int count = 0;
        if (nodeExists(node.left)) count +=1;
        if (nodeExists(node.right)) count +=1;
        return count;
    }

    Node getChildOrNill(Node node) {
        return nodeExists(node.left)
                ? node.left
                : node.right;
    }

    /**
     * Delete node with 0 or 1 child
     * @param nodeToDelete Node  - destination node which must be deleted
     * @return  void
     */
    void removeNodeWithOneOrZeroChild (Node nodeToDelete) {
        Node childOrNill = getChildOrNill(nodeToDelete);
        transplantNode(nodeToDelete, childOrNill);
    }

    /**
     * Delete node with 0 or 1 child
     * @param root Node  - root node
     * @param value int  - value
     * @return  void
     */
    boolean remove(Node root, int value) {
        // search node for delete
        Node nodeToDelete = search(root, value);
        // if not - return false
        if (!nodeExists(nodeToDelete)) return false;
        // get amount of children
        int childrenCount = getChildrenCount(nodeToDelete);

        if (childrenCount < 2) {
            // if < 2 move child or null
            removeNodeWithOneOrZeroChild(nodeToDelete);
        } else {
            // get min node in the right subtree
            Node minNode = getMin(nodeToDelete.right);
            // copying
            nodeToDelete.value = minNode.value;
            // delete old node
            removeNodeWithOneOrZeroChild(minNode);
        }
        return true;
    }

}
