package misc.problem_solving;

/**
 *
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4};
        System.out.println(majorityElement(arr));
    }

    // O(n), O(1)
    // Boyer-Moore Voting

    static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
