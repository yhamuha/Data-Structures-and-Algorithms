package misc.m.binarysearch;

import java.util.Random;

public class Shuffle {
    // O(n) O(n)
    public void shuffle(int[] values) {
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            int r = random.nextInt(i + 1);
            int temp = values[i];
            values[i] = values[r];
            values[r] = temp;
        }
    }

    public static void main(String[] args) {
        Shuffle s = new Shuffle();
        int[] arr = {1, 2, 3, 4, 5};
        s.shuffle(arr);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
