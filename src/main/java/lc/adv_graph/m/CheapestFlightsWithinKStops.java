package lc.adv_graph.m;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightsWithinKStops {
    class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    class Pair implements Comparable<Pair>{
        int node;
        int cost;
        int stops;
        public Pair(int node,int cost,int stops){
            this.node=node;
            this.cost=cost;
            this.stops=stops;
        }
        @Override
        public int compareTo(Pair p2){
            return this.stops-p2.stops;
        }
    }
    // O(V + E) O(V + E)
    // Vertex Edge
    public int findCheapestPrice(int V, int[][] edges, int src, int dst, int k) {
        ArrayList<Edge> graph[]=new ArrayList[V];
        for(int i=0;i<V;i++) graph[i]=new ArrayList<>();
        for(int i=0;i<edges.length;i++){
            graph[edges[i][0]].add(new Edge(edges[i][0],edges[i][1],edges[i][2]));
        }
        int dist[]=new int[V];
        for(int i=0;i<V;i++){
            if(i!=src) dist[i]=Integer.MAX_VALUE;
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src,0,0));
        while(!q.isEmpty()){
            Pair curr=q.remove();
            if(curr.stops>k) break;
            for(int i=0;i<graph[curr.node].size();i++){
                Edge e=graph[curr.node].get(i);
                int u=e.src;
                int v=e.dest;
                int w=e.wt;
                if(curr.cost+w<dist[v]&&curr.stops<=k){
                    dist[v]=curr.cost+w;
                    q.add(new Pair(v,dist[v],curr.stops+1));
                }
            }
        }
        if(dist[dst]==Integer.MAX_VALUE){
            return -1;
        }
        return dist[dst];
    }

    public static void main(String[] args) {
        var cfwks = new CheapestFlightsWithinKStops();
        int n = 4;
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0;
        int dst = 3;
        int k = 1;
        System.out.println(cfwks.findCheapestPrice(n,flights,src,dst,k));
    }
}
