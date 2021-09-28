package misc.problem_solving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 3, 2, 1};
//        System.out.println(Arrays.toString(twoSum(nums, 11)));

        // output number of elements which sum == target
        System.out.println(Arrays.toString(twoSum2(numbers, 11)));
    }

        // c:O(n); s:O(n);
        // based on "sum of two" substraction logic
        static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                }
                map.put(nums[i], i);
            }
            return null;
        }

        // O(n), O(n)
        // using HashMap
        static int[] twoSum2(int[] numbers, int target) {
            HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
            int diff = 0;
            int[] arr = new int[2];
            for(int i=0;i<numbers.length;i++){
                diff = target-numbers[i];
                if(hmap.containsKey(diff)){
                    int j = hmap.get(diff);
                    arr[0] = j+1;
                    arr[1] = i+1;
                    return arr;
                } else {
                    hmap.put(numbers[i], i);
                }
            }
            return arr;
        }
    }