package lc.twopointer.m;

public class ContainerWithMostWater {
    // O(n^2)
    public int maxArea_slow(int[] height) {
        int maxArea = 0;
        for (int i=0; i< height.length; i++) {
            for (int j = 0; j<height.length; j++) {
                int localArea = Math.abs(i-j)*Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, localArea);
            }
        }
        return maxArea;
    }

    // O(n)
    public int maxArea(int[] height) {
        int maxArea =0, left =0, right = height.length -1;
        while (left < right) {
            int localArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, localArea);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater cwmw = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(cwmw.maxArea(height));
    }
}
