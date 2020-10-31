package misc.recursionDynamic.backtrackingWithVariableNodes;

/**
 * backtracking by variable quantity of wides of nodes
 */
public class Backtracking {
    public static void main(String[] args) {
        Node node = new Node();

    }

    boolean find(Node node, int value) {
        if (node == null) return false;
        if (node.value == value) return true;

        for (int i = 0; i < node.children.length; i++)
            if (find(node.children[i], value)) return true;
        return false;
    }

}


class Node {
    Node[] children;
    int value;


}
