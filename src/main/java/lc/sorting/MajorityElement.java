package lc.sorting;

public class MajorityElement {
    // O(n) O(1)
    public int majorityElement(int[] nums) {
        int res = 0, count = 0;
        for(int n: nums) {
            if(count == 0)
                res = n;
            count += (n == res? 1: -1);
        }
        return res;
    }

    public static void main(String[] args) {
        var me = new MajorityElement();
        int[] nums= {2,2,1,1,1,2,2};
        System.out.println(me.majorityElement(nums));
    }
}
