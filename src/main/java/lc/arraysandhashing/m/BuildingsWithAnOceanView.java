package lc.arraysandhashing.m;

import java.util.Arrays;

public class BuildingsWithAnOceanView {
    // O(n) O(n)
    public int[] findBuildings(int[] heights) {
        int length = heights.length;
        boolean[] oceanView = new boolean[length];
        int count = 0;
        int maxHeight = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (heights[i] > maxHeight) {
                oceanView[i] = true;
                count++;
            }
            maxHeight = Math.max(maxHeight, heights[i]);
        }
        int[] buildings = new int[count];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (oceanView[i])
                buildings[index++] = i;
        }
        return buildings;
    }

    public static void main(String[] args) {
        BuildingsWithAnOceanView solution = new BuildingsWithAnOceanView();
        int[] heights = {4, 2, 3, 1};
        int[] result = solution.findBuildings(heights);
        System.out.println(Arrays.toString(result));
    }
}
