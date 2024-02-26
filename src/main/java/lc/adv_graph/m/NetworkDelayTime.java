package lc.adv_graph.m;

import java.util.*;

public class NetworkDelayTime {
    // TC: O(E log N); Edges, Nodes
    // SC: O(N + E)
    public int networkDelayTime(int[][] times, int n, int k) {
        List[] adj = new List[n+1];
        for(int[] time:times){
            int u = time[0];
            int v = time[1];
            int t = time[2];
            if(adj[u]==null){
                adj[u] = new ArrayList<int[]>();
            }
            adj[u].add(new int[]{v,t});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->Integer.compare(a[1],b[1]));
        boolean[] vis = new boolean[n+1];

        int[] reachTime = new int[n+1];
        Arrays.fill(reachTime, Integer.MAX_VALUE);
        int count = 0;
        int max = 0;
        pq.add(new int[]{k,0});
        reachTime[k] = 0;

        while(!pq.isEmpty()){
            int[] node = pq.poll();
            int u = node[0];
            int reachTime_u = node[1];
            if(vis[u]){
                continue;
            }
            vis[u] = true;
            count++;
            max = Math.max(max, reachTime_u);
            if(adj[u]!=null){
                Iterator<int[]> it = adj[u].iterator();
                while(it.hasNext()){
                    int[] neighbor = it.next();
                    int v = neighbor[0];
                    int cost_uv = neighbor[1];
                    if(!vis[v] && (reachTime_u+cost_uv)<reachTime[v]){
                        reachTime[v] = reachTime_u+cost_uv;
                        pq.add(new int[]{v, reachTime[v]});
                    }
                }
            }
        }
        return count==n?max:-1;
    }

    public static void main(String[] args) {
        var ndt = new NetworkDelayTime();
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;
        System.out.println(ndt.networkDelayTime(times,n,k));
    }
}
