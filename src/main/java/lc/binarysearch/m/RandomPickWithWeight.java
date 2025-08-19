package lc.binarysearch.m;

import java.util.Random;

public class RandomPickWithWeight {
    private int[] prefixSum;
    private int totalWeight;
    private Random rand;

    // O(log n) O(n) #meta
    public RandomPickWithWeight(int[] w) {
        int n = w.length;
        prefixSum = new int[n];
        totalWeight = 0;
        for (int i = 0; i < n; i++) {
            totalWeight += w[i];
            prefixSum[i] = totalWeight;
        }
        rand = new Random();
    }

    public int pickIndex() {
        int target = rand.nextInt(totalWeight) + 1;
        int low = 0, high = prefixSum.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (prefixSum[mid] >= target) {
                high = mid;
            } else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights = {1, 3, 2, 4, 7, 9};
        RandomPickWithWeight rpwi = new RandomPickWithWeight(weights);
        System.out.println(rpwi.pickIndex());
        System.out.println(rpwi.pickIndex());
        System.out.println(rpwi.pickIndex());
    }
}
