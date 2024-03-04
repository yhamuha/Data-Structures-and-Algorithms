package lc.bitmanipulation;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int missingNum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missingNum = missingNum ^ i ^ nums[i];
        }
        return missingNum;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {0, 1, 3, 4, 5};
        int result = missingNumber.missingNumber(nums);
        System.out.println("Missing number: " + result);
    }
}
