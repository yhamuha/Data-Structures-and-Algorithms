package lc.monotonicstack.m;

import javafx.util.Pair;
import java.util.Stack;

public class StepsToMakeArrayNonDecreasing {
    // O(n) O(n)
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
        int[] nums = {5,3,4,4,7,3};
        StepsToMakeArrayNonDecreasing stma = new StepsToMakeArrayNonDecreasing();
        System.out.println(stma.totalSteps(nums));
    }
}
