package lc.arraysandhashing.m;

public class MajorityElement {
    // O(n) O(1) Boyer-Moore Voting
    public int majorityElement(int[] nums) {
        int res=0, count=0;
        for(int num : nums) {
            if (count == 0)
                res = num;
            count += (res == num?1:-1);
        }
        return res;
    }

    public static void main(String[] args) {
        var me = new MajorityElement();
        int[] nums= {3,2,3};
        System.out.println(me.majorityElement(nums));
    }
}
