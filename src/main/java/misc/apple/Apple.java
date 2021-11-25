package misc.apple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Apple {

    // find single number using XOR
    /*public static int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }*/

    // isDuplicate in ordered array
    // Arrays.sort using quick sort with O(log n) time complexity
    /*public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }*/

    // missing number through XOR
    /*public static int missingNumber(int[] nums) {
        int missingNum = nums.length;
        for(int i =0; i< nums.length; i++) {
            missingNum = missingNum ^ i ^ nums[i];
        }
        return missingNum;
    }*/

    // find majority element
    /*public static int majorityElement(int[] nums) {
        // initial checking
        int size = 0;
        if(nums == null || nums.length == 0) {
            return size;
        }
        //init max; times
        int max = nums[0];
        int times = 1;
        // using map with number as key and value at quantity of times
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for each num in array
        for(int num : nums) {
            // increase the internal _times
            int _times = map.getOrDefault(num, 0) + 1;
            // update times value for each number in map
            map.put(num, _times);

            // update global max and times
            if(_times > times) {
                max = num;
                times = _times;
            }
        }

        return max;
    }*/

    public static void main(String[] args) {
        int[] nums = {0,1,3,7,2,15,43,2,5,6,6,0,0,1,1,0,13,13,13,6,6,6};
        System.out.println();
    }
}
