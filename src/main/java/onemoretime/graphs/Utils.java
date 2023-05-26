package onemoretime.graphs;

import java.util.HashMap;

/**
 * Utilities class with a functions to support BFS, DFS
 */

public class Utils {

    Node addOrGetNode(HashMap<Integer, Node> graph, int value) {
        if (value == -1) return null;
        if (graph.containsKey(value)) return graph.get(value);
        Node node = new Node(value);
        graph.put(value, node);
        return node;
    }

    HashMap<Integer, Node> createGraph(int[][] graphFromFile) {
        HashMap<Integer, Node> graph = new HashMap<>();
        for (int[] row : graphFromFile) {
            int nodeValue = row[0];
            int adjacentNodeValue = row[1];
            int edgeWeight = row[2];
            Node node = addOrGetNode(graph, nodeValue);
            Node adjacentNode = addOrGetNode(graph, adjacentNodeValue);
            if (adjacentNode == null) continue;
            Edge edge = new Edge(adjacentNode, edgeWeight);
            node.edges.add(edge);
            adjacentNode.parents.put(node, edge);
        }
        return graph;
    }
}
