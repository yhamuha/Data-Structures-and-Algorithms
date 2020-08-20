package misc.bst;

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
        if (!nodeExists(node))) return null;
        if (!nodeExists(node.left)) return node;
        return getMin(node.left);
    }

    /**
     * searching max node
     * @param node Node  - root
     * @return  max Node
     */
    Node getMax (Node node) {
        if (!nodeExists(node))) return null;
        if (!nodeExists(node.right)) return node;
        return getMin(node.right);
    }


}
