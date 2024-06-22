package lc.twopointer.e;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {

    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count=0, left=0, right=nums.size()-1;

        while(left < right){
            if(nums.get(left) + nums.get(right) < target){
                count += right - left;
                left++;
            }
            else
                right--;
        }

        return count;
    }

    public static void main(String[] args) {
        CountPairsWhoseSumIsLessThanTarget countPairs = new CountPairsWhoseSumIsLessThanTarget();
        List<Integer> nums = Arrays.asList(-6, 2, 5, -2, -7, -1, 3);
        int target = -2;
        System.out.println(countPairs.countPairs(nums, target));
    }

}
