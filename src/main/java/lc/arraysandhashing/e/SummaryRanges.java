package lc.arraysandhashing.e;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList();
        int n = nums.length;
        for (int i = 0; i<n; i++) {
            int start = nums[i];
            while (i+1<n && nums[i+1] == (nums[i])+1) {
                i++;
            }
            if(start != nums[i]) {
                list.add("" + start + "->" + nums[i]);
            }
            else {
                list.add("" + start);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,7};
        System.out.println(summaryRanges(nums));
    }
}
