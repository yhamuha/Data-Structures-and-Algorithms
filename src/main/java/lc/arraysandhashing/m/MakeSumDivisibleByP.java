package lc.arraysandhashing.m;

import java.util.HashMap;
import java.util.Map;

public class MakeSumDivisibleByP {
    // O(n) O(n)
    static int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long sum = 0;
        for (int num : nums)
            sum += num;
        if (sum % p == 0)
            return 0;
        if (sum < p)
            return -1;
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);
        long remain = sum % p;
        sum = 0;
        int res = n;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            sum %= p;
            long rem = sum - remain;
            if (rem < 0)
                rem += p;
            Integer val = map.get(rem);
            if (val != null)
                res = Math.min(res, i - val);
            map.put(sum, i);
        }
        return res == n ? -1 : res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2};
        int p = 6;
        System.out.println(minSubarray(nums, p));
    }
}
