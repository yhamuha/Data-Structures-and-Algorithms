package cs.graphs.bfs;

import java.util.HashSet;
import java.util.LinkedList;

public class Utils {

    void BFS(Node node, HashSet<Node> visitingOrPassed) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(node);
        visitingOrPassed.add(node);
        while(!queue.isEmpty()) {
            node = queue.removeFirst();
            System.out.println(node.value);
            for (Edge edge : node.edges) {
                if (!visitingOrPassed.contains(edge.adjacentNode)) {
                    queue.addLast(edge.adjacentNode);
                    visitingOrPassed.add(node);
                }
            }
        }
    }

    PathNode findShortestPath(Node start, Node end) {
        HashSet<Node> visitingOrPassed = new HashSet<>();
        LinkedList<PathNode> queue = new LinkedList<>();
        queue.addLast(new PathNode(start, null));
        visitingOrPassed.add(start);
        while (!queue.isEmpty()) {
            PathNode pathNode = queue.removeFirst();
            if (pathNode.node == end) return pathNode;
            for (Edge edge : pathNode.node.edges) {
                if (visitingOrPassed.contains(edge.adjacentNode)) continue;
                if (edge.adjacentNode == end)
                    return new PathNode(edge.adjacentNode, pathNode);
                queue.addLast(new PathNode(edge.adjacentNode, pathNode));
                visitingOrPassed.add(pathNode.node);
            }
        }
        return null;
    }
}
