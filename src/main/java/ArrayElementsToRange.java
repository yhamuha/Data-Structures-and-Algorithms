import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayElementsToRange {
    // O(n) O(n)
    public static int[] transformArray(int[] nums) {
        List<Integer> outputList = new ArrayList<>();
        for (int num : nums) {
            for (int i = 1; i <= num; i++)
                outputList.add(i);
        }
        int[] transformedArray = new int[outputList.size()];
        for (int i = 0; i < outputList.size(); i++)
            transformedArray[i] = outputList.get(i);
        return transformedArray;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 1};
        int[] transformedArray = transformArray(nums);
        System.out.println(Arrays.toString(transformedArray) + " \n" + transformedArray.length);
    }
}
