package onemoretime.graphs;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Node/Vertex presentation
 */
public class Node {
    public int value;
    public LinkedHashSet<Edge> edges = new LinkedHashSet<>();
    public LinkedHashMap<Node, Edge> parents = new LinkedHashMap<>();
    public Node(int value) { this.value = value; }
}
