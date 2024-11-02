package lc.twopointer.m;

public class ContainerWithMostWater {
    // O(n) O(1)
    public int maxArea(int[] height) {
        int maxArea = 0, left = 0, right = height.length-1;
        while (left < right){
            int localArea = (right-left) * Math.min(height[left],height[right]);
            maxArea=Math.max(maxArea,localArea);
            if (height[left]<height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater cwmw = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(cwmw.maxArea(height));
    }
}
