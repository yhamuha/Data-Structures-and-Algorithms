package lc.arraysandhashing.e;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // O(n) O(n) #meta #amazon #ibm #walmart
    static public int[] findTwoSumImproved(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int difference = target - nums[i];
            if (map.containsKey(difference))
                return new int[]{map.get(difference), i};
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,4};
        /*
        System.out.println(Arrays.toString(findTwoSum(arr, 6)));
        */
        System.out.println(Arrays.toString(findTwoSumImproved(arr, 6)));
    }
}
