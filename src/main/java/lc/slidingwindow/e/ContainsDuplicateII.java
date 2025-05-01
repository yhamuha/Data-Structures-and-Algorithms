package lc.slidingwindow.e;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    // O(n) O(n)
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int currentIdx=0; currentIdx<nums.length; currentIdx++){
            if(map.containsKey(nums[currentIdx])){
                int pastIdx = map.get(nums[currentIdx]);
                if(Math.abs(pastIdx - currentIdx) <= k)
                    return true;
            }
            map.put(nums[currentIdx],currentIdx);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,8,9,2,10,2,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
