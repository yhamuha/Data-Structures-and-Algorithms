package lc.linkedlist.m;

import java.util.Arrays;
import java.util.LinkedList;

public class BuildingsWithAnOceanView {
    // O(n) O(n)
    public int[] findBuildings(int[] heights) {
        int mx = 0;
        LinkedList<Integer> ans = new LinkedList<>();
        for (int i = heights.length - 1; i >= 0; --i) {
            int v = heights[i];
            if (mx < v) {
                ans.addFirst(i);
                mx = v;
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        BuildingsWithAnOceanView solution = new BuildingsWithAnOceanView();
        int[] heights = {4, 2, 3, 1};
        int[] result = solution.findBuildings(heights);
        System.out.println(Arrays.toString(result));
    }
}
