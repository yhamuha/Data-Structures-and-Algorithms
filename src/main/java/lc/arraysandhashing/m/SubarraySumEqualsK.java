package lc.arraysandhashing.m;

import java.util.HashMap;

public class SubarraySumEqualsK {
    // O(n) O(n)
    public int subarraySum(int[] nums, int k) {
        int count = 0, cumulativeSum = 0;
        HashMap< Integer, Integer > sumMap = new HashMap < > ();
        sumMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            cumulativeSum += nums[i];
            if (sumMap.containsKey(cumulativeSum - k))
                count += sumMap.get(cumulativeSum - k);
            sumMap.put(cumulativeSum, sumMap.getOrDefault(cumulativeSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK obj = new SubarraySumEqualsK();
        int[] nums = {1,2,3,1,2,3,3};
        int k =3;
        System.out.println(obj.subarraySum(nums, k));
    }
}
