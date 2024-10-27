package lc.bitmanipulation.e;

public class ContainsDuplicate {
    // O(n) O(1)
    static public boolean containsDuplicateBitmanipulation(int[] nums) {
        long checker = 0L;
        for (int num : nums) {
            long mask = 1L << num; // get unique bit mask for each num
            // 0001 left shift for each of 3,2,3 numbers
            if ((checker & mask) > 0) { // check if bit identifier match
                return true;
            }
            checker |= mask; // save particular bit from each bit mask for each num
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(containsDuplicateBitmanipulation(arr));
    }
}
