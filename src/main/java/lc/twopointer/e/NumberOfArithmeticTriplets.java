package lc.twopointer.e;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> hashset = new HashSet();
        for(int num: nums)
            hashset.add(num);

        int i=0,j=1;
        int cnt=0;
        while(i<=j && j<nums.length){

            if(nums[j]-nums[i] < diff)
                j++;
            else if(nums[j]-nums[i]>diff)
                i++;
            else{
                if(hashset.contains(nums[j]+diff))
                    cnt++;
                i++;
                j++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        NumberOfArithmeticTriplets nat = new NumberOfArithmeticTriplets();
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        System.out.println(nat.arithmeticTriplets(nums, diff));
    }
}
