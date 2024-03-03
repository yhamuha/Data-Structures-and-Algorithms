package lc.bitmanipulation;

public class SingleNumber {
    // O(n) O(1)
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};

        var sn = new SingleNumber();
        System.out.println(sn.singleNumber(nums1));
        System.out.println(sn.singleNumber(nums2));
    }
}
