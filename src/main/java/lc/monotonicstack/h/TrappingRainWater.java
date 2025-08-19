package lc.monotonicstack.h;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TrappingRainWater {
    // O(n) O(n) #amazon
    public int trap(List<Integer> height) {
        int n = height.size();
        int water = 0;
        Stack<Integer> stack = new Stack<>();
        for (int right = 0; right < n; right++) {
            while (!stack.isEmpty() && height.get(stack.peek()) < height.get(right)) {
                int mid = stack.pop();
                if (stack.isEmpty())
                    break;
                int left = stack.peek();
                int minHeight = Math.min(height.get(right) - height.get(mid),
                                            height.get(left) - height.get(mid));
                int width = right - left - 1;
                water += minHeight * width;
            }
            stack.push(right);
        }
        return water;
    }

    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();
        List<Integer> height = Arrays.asList(0,1,0,2,1,0,1,3,2,1,2,1);
        int trappedWater = solution.trap(height);
        System.out.println(trappedWater);
    }
}
