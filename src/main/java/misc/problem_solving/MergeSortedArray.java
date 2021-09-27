package misc.problem_solving;

import java.util.Arrays;

/**
 *
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6};
        int m =3;
        int n =3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }

    static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums = new int[m+n];

        for (int i = 0; i < n; i++) {
            nums[i] = nums1[i];
        }
        for (int i=3; i<6; i++) {
            nums[i] = nums2[i-3];
        }
        return nums;
    }
}
