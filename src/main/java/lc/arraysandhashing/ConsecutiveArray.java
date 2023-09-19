package lc.arraysandhashing;

import java.util.HashSet;

public class ConsecutiveArray {
    public static int consecutive(int[] arr) {

        // arr to to HashSet
        HashSet<Integer> values = new HashSet();
        for (int i : arr) {
            values.add(i);
        }

        int maxLength = 0;
        for (int i : values) {
            if (values.contains(i - 1)) continue;
            int length = 0;

            while (values.contains(i++)) length++;
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,6,9};
        System.out.println(consecutive(arr));
    }
}