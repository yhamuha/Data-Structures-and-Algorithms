package misc.problem_solving.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }


    // O(N) O(n)
    static int[] decompressRLElist(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i=0; i< nums.length; i+=2) {

            int value = nums[i+1];
            int freq = nums[i];
            for (int j = 0; j < freq; j++) {
                list.add(value);
            }
        }

        int[] result = list.stream().mapToInt(i->i).toArray();
        return result;
    }

    }

