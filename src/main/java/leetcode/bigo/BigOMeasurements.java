package leetcode.bigo;

public class BigOMeasurements {

    // O(N^2)
    void printUnorderedPairs(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                for (int k = 0; k < 100_000; k++) {
                    System.out.println(arrayA[i] + "," + arrayB[j]);
                            }
                }
            }
    }
}
