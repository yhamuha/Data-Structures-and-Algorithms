package cs.graphs.bfs;
import cs.graphs.bfs.Node;

class Edge {
    public Node adjacentNode;
    public int weight;
    public Edge(Node adjacentNode, int weight) {
        // where edge point to
        this.adjacentNode = adjacentNode;
        // weight of the edge
        this.weight = weight;
    }
}
