package misc.problem_solving;

import java.util.Arrays;

/**
 *
 */
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle3(nums, n)));
    }

    // O(n), O(n)
    static int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[2 * n];
        for (int i = 0, j = 0; i < n; i++, j += 2) {
            shuffled[j] = nums[i];
            shuffled[j + 1] = nums[i + n];
        }
        return shuffled;
    }

    // 2 pointer solution
    // O(n), O(n)
    static int[] shuffle2(int[] nums, int n) {
        int[] numArray = new int[nums.length];
        int p1 = 0;
        int p2 = n;
        int i=0;

        while(i < nums.length){
            numArray[i++] = nums[p1++];
            numArray[i++] = nums[p2++];
        }

        return numArray;

    }

    // fastest
    static int[] shuffle3(int[] nums, int n) {
        int[] arr= new int[2*n];
        int a=0;
        int b=n;
        for(int i= 0; i<2*n; i++){
            if(i%2==0 && i!=1){
                arr[i]=nums[a];
                a++;
            }
            else{
                arr[i]=nums[b];
                b++;
            }
        }
        return arr;
    }
}
