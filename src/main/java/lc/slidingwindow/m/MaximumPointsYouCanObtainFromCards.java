package lc.slidingwindow.m;

public class MaximumPointsYouCanObtainFromCards {
    // O(n) O(1)
    static int maxScore(int[] cardPoints, int k) {
        int leftSum = 0, rightSum = 0, maxSum;
        for (int i = 0; i < k; i++)
            leftSum += cardPoints[i];
        maxSum = leftSum;
        int end = cardPoints.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            leftSum -= cardPoints[i];
            rightSum += cardPoints[end--];
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        System.out.println(maxScore(cardPoints, k));
    }
}
