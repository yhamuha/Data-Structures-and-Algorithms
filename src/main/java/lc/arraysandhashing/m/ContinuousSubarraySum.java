package lc.arraysandhashing.m;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    // O(n), O(n)
    public boolean checkSubarraySum(int[] nums, int k) {
        int [] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i=1; i<nums.length; i++)
            ans[i] = ans[i-1]+nums[i];
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for (int i=0; i<ans.length; i++){
            if (map.containsKey(ans[i] % k))
                if (i-map.get(ans[i] % k) >= 2) return true;
                else map.put(ans[i] % k, i);
        }
        return false;
    }

    public static void main(String[] args) {
        ContinuousSubarraySum css = new ContinuousSubarraySum();
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println(css.checkSubarraySum(nums, k));
    }
}
