package lc.binarysearch.e;

public class MinimumCommonValue {
    //Overall time complexity: O(n log n)
    public int getCommon(int[] nums1, int[] nums2) {
    for (int num : nums2) {
        int left = 0;
        int right = nums1.length-1;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if (nums1[mid]==num)
                return num;
            else if (nums1[mid] < num)
                left = mid + 1;
            else right = mid - 1;
        }
    }
        return -1;
    }

    public static void main(String[] args) {
        var mcv = new MinimumCommonValue();
        System.out.println(mcv.getCommon(new int[]{1,2,3,6}, new int[]{2,3,4,5}));
    }
}
