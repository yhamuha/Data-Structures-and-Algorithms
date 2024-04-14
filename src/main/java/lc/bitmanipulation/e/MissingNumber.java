package lc.bitmanipulation.e;

public class MissingNumber {
    // O(n) O(1)
    public int missingNumber(int[] nums) {
        int allXOR = 0;

        for(int i=0;i<=nums.length; i++)
            allXOR=allXOR ^ i;
        for(int num : nums)
            allXOR = allXOR ^ num;

        return allXOR;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {0, 1, 3, 4, 5};
        int result = missingNumber.missingNumber(nums);
        System.out.println("Missing number: " + result);
    }
}
