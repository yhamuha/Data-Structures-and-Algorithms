package lc.arrays;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {

    static public void shuffle(int[] values) {
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            int r = random.nextInt(i + 1);
            int temp = values[i];
            values[i] = values[r];
            values[r] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,3,4,5,6,7,8};
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
    }
}
