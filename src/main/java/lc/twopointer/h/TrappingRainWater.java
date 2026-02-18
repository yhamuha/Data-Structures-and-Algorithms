package lc.twopointer.h;

public class TrappingRainWater {
    // O(n) O(1) #amazon #walmart
    public static int trappingWater(int[] heights) {
        if (heights.length == 0)
            return 0;
        int left = 0, right = heights.length - 1;
        int leftMax = heights[left], rightMax = heights[right];
        int count = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                if (heights[left] >= leftMax) {
                    leftMax = heights[left];
                } else {
                    count += leftMax - heights[left];
                }
            } else {
                right--;
                if (heights[right] >= rightMax) {
                    rightMax = heights[right];
                } else {
                    count += rightMax - heights[right];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {3,4,1,2,2,5,1,0,2};
        System.out.println(solution.trappingWater(height));
    }
}
