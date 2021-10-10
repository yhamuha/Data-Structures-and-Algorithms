package misc.problem_solving.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] nums = {55,11,70,26,62,64};
        System.out.println(Arrays.toString(decompressRLElist2(nums)));
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

    // upgraded version
    // avoided List and stream
    // time: O(N) with better performance;
    // space: O(1)
    static int[] decompressRLElist2(int[] nums) {
        int solutionLength = 0;
        for (int i = 0; i < nums.length; i += 2) {
            solutionLength += nums[i];
        }
        int[] solution = new int[solutionLength];
        int startIdx = 0;
        for (int i=startIdx; i< nums.length; i+=2) {
            int value = nums[i+1];
            int freq = nums[i];
            for (int j = startIdx; j < startIdx+freq; j++) {
                if (startIdx == 0) {
                    solution[j] = value;
                } else {
                    solution[j] = value;
                }
            }
            startIdx += freq;
        }
        return solution;
    }
}

