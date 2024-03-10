package lc.adv_graph.m;

import java.util.*;

public class NetworkDelayTime {
    // TC: O(E + N log N); Edges, Nodes
    // SC: O(E + N)
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for(int[] time : times){
            int src = time[0], tar = time[1], weight = time[2];
            if(!graph.containsKey(src)){
                graph.put(src, new LinkedList<int[]>());
            }
            graph.get(src).add(new int[]{tar, weight});
        }
        Queue<int[]> minHeap = new PriorityQueue<>((a,b)->a[1] - b[1]);
        Set<Integer> visited = new HashSet<>();
        minHeap.add(new int[]{k, 0});
        int res = 0;
        while(!minHeap.isEmpty()){              // BFS
            int[] top = minHeap.poll();
            int src = top[0], srcWeight = top[1];
            if(visited.contains(src)) continue;
            res = srcWeight;
            visited.add(src);
            if(!graph.containsKey(src)) continue;
            for(int[] edge : graph.get(src)){
                int tar = edge[0], tarWeight = edge[1];
                minHeap.add(new int[]{tar, srcWeight + tarWeight });
            }
        }
        return visited.size() == n ? res : -1;
    }

    public static void main(String[] args) {
        var ndt = new NetworkDelayTime();
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;
        System.out.println(ndt.networkDelayTime(times,n,k));
    }
}
