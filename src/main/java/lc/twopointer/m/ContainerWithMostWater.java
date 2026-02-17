package lc.twopointer.m;

public class ContainerWithMostWater {
    // O(n) O(1)
    static Integer maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int currentMaxArea = 0;

        while (left < right) {
            int length = right - left;
            int height = Math.min(heights[left], heights[right]);
            int currentArea = length * height;

            currentMaxArea = Math.max(currentMaxArea, currentArea);

            if (heights[left] < heights[right])
                left++;
            else
                right--;
        }
        return currentMaxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}
