package lc.twopointer;

public class MoveZeroes {
    //O(n) O(1)
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j=0; j<n; j++) {
            if(nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for(int k = i ; k<n ;k++)
            nums[k] = 0;
    }
    public static void main(String[] args) {
        MoveZeroes moveZeroesObj = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroesObj.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
