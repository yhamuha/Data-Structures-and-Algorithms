package misc.graphs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 *
 */

public class Node {
    public int value;
    public LinkedHashSet<Edge> edges = new LinkedHashSet<>();
    public LinkedHashMap<Node, Edge> parents = new LinkedHashMap<>();

    public Node(int value) {
        this.value = value;
    }
    
    Node addOrGetNode (HashMap<Integer, Node> graph, int value) {
        if (value == -1) return null;
        if (graph.containsKey(value)) return graph.get(value);

        Node node = new Node(value);
        graph.put(value, node);
        return node;
    }
}

class Edge {
    public Node adjacentNode;
    public int weight;

    public Edge(Node adjacentNode, int weight) {
        this.adjacentNode = adjacentNode;
        this.weight = weight;
    }
}
