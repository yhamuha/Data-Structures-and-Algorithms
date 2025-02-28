package lc.twopointer.e;

public class MoveZeroes {
    //O(n) O(1)
    static void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0;
        for(int j=0; j<n;j++) {
            if (nums[j]!=0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for(int k=i; k<n;k++)
            nums[k]=0;
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
