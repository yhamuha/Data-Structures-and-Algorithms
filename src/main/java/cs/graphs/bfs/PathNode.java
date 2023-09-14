package cs.graphs.bfs;

public class PathNode {
    public Node node;
    public PathNode parent;
    public PathNode(Node node, PathNode parent) {
        this.node = node;
        this.parent = parent;
    }
}
