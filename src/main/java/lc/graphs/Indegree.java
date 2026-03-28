package lc.graphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Indegree {
    /*public static int[] indegree(int n, int[][] edges) {
        int[] indegree = new int[n];
        for (int[] edge : edges) {
            indegree[edge[1]] += 1;
        }
        return indegree;
    }*/
    // O(n) O(n)
    public static int[] indegree(Map<Integer, List<Integer>> adjList, int n) {
        int[] indegree = new int[n];
        for (int u : adjList.keySet()) {
            for (int v : adjList.get(u)) {
                indegree[v] += 1;
            }
        }
        return indegree;
    }

    public static void main(String[] args) {
        // given list of edges
        // int[][] edges = {{0, 1}, {1, 2}, {1, 3}, {3, 2}, {3, 4}};

        //  given adjacency list
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        adjList.put(0, Arrays.asList(1));
        adjList.put(1, Arrays.asList(2, 3));
        adjList.put(2, Arrays.asList());
        adjList.put(3, Arrays.asList(2, 4));
        adjList.put(4, Arrays.asList());
        int n =5;

        int[] res = indegree(adjList, n);
        for(int val : res) {
            System.out.println(val + " ");
        }

    }
}
