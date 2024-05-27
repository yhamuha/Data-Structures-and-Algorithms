package lc.bitmanipulation.m;

import java.util.Arrays;

public class SingleNumberIII {
    // O(n) O(1)
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int n: nums) xor ^=n;
        int mask = (xor & (xor-1)) ^ xor;
        int num1=0;
        for (int n: nums)
            if ((mask & n) == 0)
                num1 ^= n;
        return new int[]{num1, xor ^ num1};
    }

    public static void main(String[] args) {
        SingleNumberIII sn = new SingleNumberIII();
        int[] nums = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(sn.singleNumber(nums)));
    }
}
