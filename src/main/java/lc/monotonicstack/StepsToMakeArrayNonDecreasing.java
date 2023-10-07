package lc.monotonicstack;

import javafx.util.Pair;
import java.util.Stack;

/*
*   Input: nums = [5,3,4,4,7,3,6,11,8,5,11]
    Output: 3
    Explanation: The following are the steps performed:
    - Step 1: [5,3,4,4,7,3,6,11,8,5,11] becomes [5,4,4,7,6,11,11]
    - Step 2: [5,4,4,7,6,11,11] becomes [5,4,7,11,11]
    - Step 3: [5,4,7,11,11] becomes [5,7,11,11]
    [5,7,11,11] is a non-decreasing array. Therefore, we return 3.
*
*   In other words, how many steps we need to have non-decreasing array?
*   Answer: 3
* */

public class StepsToMakeArrayNonDecreasing {
    public int totalSteps(int[] nums) {
        int size = nums.length;
        Stack<Pair<Integer,Integer>> stack = new Stack();
        stack.push(new Pair<>(nums[size-1],0));
        int ans = 0;
        for(int i = size-2;i>=0;i--){
            int count = 0;
            while(!stack.isEmpty() && nums[i]>stack.peek().getKey()){
                count = Math.max(count+1,stack.peek().getValue());
                stack.pop();
            }
            ans  = Math.max(ans,count);
            stack.push(new Pair(nums[i],count));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,3,4,4,7,3,6,11,8,5,11};
        StepsToMakeArrayNonDecreasing stma = new StepsToMakeArrayNonDecreasing();
        System.out.println(stma.totalSteps(nums));
    }
}
