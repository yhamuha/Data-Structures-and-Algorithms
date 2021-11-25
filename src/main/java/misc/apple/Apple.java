package misc.apple;

/**
 *
 */
public class Apple {
    // find single number using XOR
    /*public static int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }*/

    public static void main(String[] args) {
        int[] nums = {1,2,2,1,4};
        System.out.println(singleNumber(nums));
    }
}
