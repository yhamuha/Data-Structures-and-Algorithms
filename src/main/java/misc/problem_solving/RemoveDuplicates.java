package misc.problem_solving;

/**
 *
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4};
//        System.out.println(removeDuplicates(nums));

        int val = 3;
//        System.out.println(removeElement(nums, val));
//        System.out.println(removeElement2(nums, val));
        System.out.println(removeElement3(nums, val));
    }

    // O(n)
    // O(1)
    static int removeDuplicates(int[] nums) {
        // special case
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    // O(n)
    // O(1)
    static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    //remove Element
    static int removeElement2(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    // right removeElement solution
    static int removeElement3(int[] nums, int val) {
        int i = 0;
        for (int elem: nums){
            if (elem != val){
                nums[i] = elem;
                i++;
            }
        }
        return i;
    }

}
