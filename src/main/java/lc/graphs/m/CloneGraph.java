package lc.graphs.m;

import java.util.*;
import lc.graphs.Node;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        HashMap<Node, Node> visited = new HashMap<>();
        Node newNode = new Node(node.val);
        visited.put(node, newNode);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            List<Node> newNeighbors = visited.get(cur).neighbors;
            for (Node n : cur.neighbors) {
                if (!visited.containsKey(n)) {
                    visited.put(n, new Node(n.val));
                    queue.offer(n);
                }
                newNeighbors.add(visited.get(n));
            }
        }
        return newNode;
    }

    public static void main(String[] args) {
        List<Node> adjList = new ArrayList<>();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);
        adjList.add(node1);
        adjList.add(node2);
        adjList.add(node3);
        adjList.add(node4);

        CloneGraph cloneGraph = new CloneGraph();
        Node clonedNode = cloneGraph.cloneGraph(node1);

        System.out.println("Original Node: " + node1.val);
        System.out.print("Original Node Neighbors: ");
        for (Node n : node1.neighbors) {
            System.out.print(n.val + " ");
        }
        System.out.println("\nCloned Node: " + clonedNode.val);
        System.out.print("Cloned Node Neighbors: ");
        for (Node n : clonedNode.neighbors) {
            System.out.print(n.val + " ");
        }
    }
}
