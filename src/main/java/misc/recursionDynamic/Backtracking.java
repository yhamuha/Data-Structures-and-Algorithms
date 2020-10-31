package misc.recursionDynamic;

/**
 *
 */
public class Backtracking {
    public static void main(String[] args) {

    }

    boolean find(Node node, int value) {
        // base cases
        if (node == null) return false;
        if (node.value == value) return true;

        // recursion
        if (find(node.left, value)) return true;
        if (find(node.right, value)) return true;

        return false;
    }
}

class Node {
    Node left;
    Node right;
    int value;
}
