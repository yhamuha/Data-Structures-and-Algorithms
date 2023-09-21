package lc.arraysandhashing;

import misc.problem_solving.array.SingleNumberGoogle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII {

    // TC: O(n), SC: O(n)
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int k=map.get(nums[i]);
                map.put(nums[i],k+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int value=entry.getValue();
            if(value==1){
                l.add(entry.getKey());
            }
        }
        int[] res=new int[l.size()];
        for(int i=0;i<l.size();i++){
            res[i]=l.get(i);
        }
        return res;
    }

    public int[] singleNumber_bitwise(int[] nums) {
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
        int[] nums = {1,2,3,1,2,5};
        System.out.println(Arrays.toString(sn.singleNumber(nums)));
    }
}
