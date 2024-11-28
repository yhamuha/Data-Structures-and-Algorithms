package lc.graphs.e;

import java.util.*;

public class FindIfPathExistsInGraph {
    // O(v+e) O(v+e)
    static boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++)
            graph.put(i, new ArrayList<>());
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        boolean[] visited = new boolean[n];
        visited[source] = true;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.offerFirst(source);
        while (!stack.isEmpty()) {
            int node = stack.pollFirst();
            visited[node] = true;
            for (int entry : graph.get(node)) {
                if (visited[entry])
                    continue;
                stack.offerFirst(entry);
                visited[entry] = true;
            }
        }
        return visited[destination];
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {2, 4}};
        int source = 0;
        int destination = 4;
        System.out.println(validPath(n, edges, source, destination));
    }
}
