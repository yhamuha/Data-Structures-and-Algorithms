package misc.problem_solving;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class MissingRanges {
    public static void main(String[] args) {
        int[] nums = {0,1,3,50,75};
        int lower = 0;
        int upper = 99;
        System.out.println(findMissingRanges3(nums, lower, upper));
    }
    // 1)
    static List<String> findMissingRanges(int[] nums, int lower, int upper) {
    List<String> ans = new ArrayList<>();

        if (nums.length == 0) {
        addStringToAns(ans, lower-1, upper+1);
        return ans;
    }

    addStringToAns(ans, lower-1, nums[0]);
        for (int i=0; i<nums.length-1; i++) {
        addStringToAns(ans, nums[i], nums[i+1]);
    }
    addStringToAns(ans, nums[nums.length-1], upper+1);
        return ans;
}

    static void addStringToAns(List<String> ans, int l, int u) {
        if (u - l == 2) {
            ans.add(String.valueOf((u+l)/2));
        }
        else if (u - l > 2) {
            ans.add(String.valueOf(l+1) + "->" + String.valueOf(u-1));
        }
    }

    // 2)
    static List<String> findMissingRanges2(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int prev = lower - 1;
        // traverse input array
        for (int i = 0; i <= nums.length; i++) {
            // calculate curr
            int curr = (i < nums.length) ? nums[i] : upper + 1;

            if (prev + 1 <= curr - 1) {
                result.add(formatRange(prev + 1, curr - 1));
            }

            prev = curr;
        }
        return result;
    }

    // formats range in the requested format
    static private String formatRange(int lower, int upper) {
        if (lower == upper) {
            return String.valueOf(lower);
        }
        return lower + "->" + upper;
    }

    // 3)
    static List<String> findMissingRanges3(int[] nums, int lower, int upper) {

        // create list of Strings cause we need to store concatenated "->"
        List<String> list = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            // check if no sequenced number
            if (nums[i] - lower == 1) list.add(lower + "");
            // check if have a gap between numbers
            else if (nums[i] - lower > 1) list.add(lower + "->" + (nums[i] - 1));
            lower = nums[i] + 1;
        }
        if (lower == upper) list.add(upper + "");
        else if (lower < upper) list.add(lower + "->" + upper);

        return list;
    }
}
