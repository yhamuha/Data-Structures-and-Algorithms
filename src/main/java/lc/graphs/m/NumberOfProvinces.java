package lc.graphs.m;

public class NumberOfProvinces {
    // O(n^2) O(n)
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int countPro = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                countPro++;
                dfs(isConnected, visited, i);
            }
        }
        return countPro;
    }
    private void dfs(int[][] isConnected, boolean[] visited, int i) {
        visited[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !visited[j])
                dfs(isConnected, visited, j);
        }
    }

    public static void main(String[] args) {
        NumberOfProvinces solution = new NumberOfProvinces();
        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        System.out.println(solution.findCircleNum(isConnected));
    }
}
