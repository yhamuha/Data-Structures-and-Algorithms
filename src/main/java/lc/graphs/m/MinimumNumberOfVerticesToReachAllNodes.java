package lc.graphs.m;

import java.util.*;

public class MinimumNumberOfVerticesToReachAllNodes {
    // O(e) O(n)
    static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Map<Integer,Integer> map = new HashMap();
        List<Integer> ans=new ArrayList<>();
        for(List<Integer> edge: edges) {
            int a=edge.get(1);
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int i=0;i<n;i++) {
            if(!map.containsKey(i))
                ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> edges = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(0, 2),
                Arrays.asList(2, 5),
                Arrays.asList(3, 4),
                Arrays.asList(4, 2)
        );
        System.out.println(findSmallestSetOfVertices(n, edges));
    }
}
