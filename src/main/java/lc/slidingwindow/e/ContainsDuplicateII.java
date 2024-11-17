package lc.slidingwindow.e;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    // O(n) O(n)
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int currIdx=0; currIdx<nums.length; currIdx++){
            if(map.containsKey(nums[currIdx])){
                int pastIdx = map.get(nums[currIdx]);
                if(Math.abs(pastIdx - currIdx) <= k)
                    return true;
            }
            map.put(nums[currIdx],currIdx);
        }
        return false;
      /*  int l =0, r=1;
        while (r<nums.length){
            if (nums[l] == nums[r] && (r-l) <=k )
                return true;
            else
                r++;
        }
        return false;*/
    }

    public static void main(String[] args) {
        ContainsDuplicateII obj = new ContainsDuplicateII();
        int[] nums = {1,3,8,9,2,10,2,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
