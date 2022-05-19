package misc;

import java.util.concurrent.ThreadLocalRandom;

public class BubbleSortNext {

    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            // printNumbers(array);
        }
    }

    private static void swapNumbers(int i, int j, int[] array) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        int min = 0;
        int max = 10000;
        int[] input = new int[5_000];
        int j=0;
        for (int i = input.length-1; i>=0; i--) {
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            input[j]=randomNum;
            j++;
        }


        long start = System.currentTimeMillis();
        bubble_srt(input);
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}