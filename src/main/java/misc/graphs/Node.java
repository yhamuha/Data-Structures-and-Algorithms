package misc.graphs;

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
}

class Edge {
    public Node adjacentNode;
    public int weight;

    public Edge(Node adjacentNode, int weight) {
        this.adjacentNode = adjacentNode;
        this.weight = weight;
    }
}
