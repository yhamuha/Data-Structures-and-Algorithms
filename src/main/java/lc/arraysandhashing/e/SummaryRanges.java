package lc.arraysandhashing.e;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    // O(n) O(n)
    public static List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int start = nums[i];
            while (i+1<n && nums[i+1]==(nums[i])+1)
                i++;
            if (start != nums[i])
                ranges.add(start + "->" + nums[i]);
            else
                ranges.add("" + start);
        }
        return ranges;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,7,9};
        System.out.println(summaryRanges(nums));
    }
}
