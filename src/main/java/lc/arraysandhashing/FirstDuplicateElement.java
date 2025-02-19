package lc.arraysandhashing;

public class FirstDuplicateElement {
    static int firstDuplicate (int[] nums){
        // O(n) O(1)
        for (int num : nums) {
            int index = Math.abs(num);
            if (nums[index] < 0)
                return num;
            nums[index] *= -1;
        }
        return -1;
    }

    public static void main (String[] str){
        System.out.println(firstDuplicate(new int[]{2,1,5,2,3,3,4}));
    }
}
