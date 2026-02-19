package lc.slidingwindow.m;

public class MaximumPointsYouCanObtainFromCards {
    /*static int maxScore(int[] cardPoints, int k) {
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
    }*/
    // O(n) O(1)
    static int maxScore(int[] cards, int k) {
        int total = 0;
        for (int card : cards)
            total += card;

        int state = 0, maxPoints = 0, start = 0;
        for (int end = 0; end < cards.length; end++) {
            state += cards[end];
            if (end - start + 1 == cards.length - k) {
                maxPoints = Math.max(total - state, maxPoints);
                state -= cards[start];
                start++;
            }
        }
        return maxPoints;
    }

    public static void main(String[] args) {
        int[] cardPoints = {2,11,4,5,3,9,2};
        int k = 3;
        System.out.println(maxScore(cardPoints, k));
    }
}
