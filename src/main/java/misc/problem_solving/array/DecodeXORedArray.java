package misc.problem_solving.array;

import java.util.Arrays;

/**
 *
 */
public class DecodeXORedArray {
    public static void main(String[] args) {
        int[] encoded = {6,2,7,3};
        int first = 4;
        System.out.println(Arrays.toString(decode(encoded, first)));
    }

    static int[] decode(int[] encoded, int first) {
        int[] original = new int[encoded.length + 1];
        original[0] = first;

        for(int i = 0; i < encoded.length; i++) {
            original[i+1] = encoded[i] ^ original[i];
        }
        return original;
    }
}