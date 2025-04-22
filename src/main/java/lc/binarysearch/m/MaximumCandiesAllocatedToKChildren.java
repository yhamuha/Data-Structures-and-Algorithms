package lc.binarysearch.m;

public class MaximumCandiesAllocatedToKChildren {
    // O (n log m) O(1)
    static int maximumCandies(int[] candies, long k) {
        int left = 1, right = 10_000_000;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long childrenCount = 0;
            for (int candy : candies)
                childrenCount += candy / mid;
            if (childrenCount >= k) {
                result = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies = {5, 8, 6};
        long k = 3;
        System.out.println(maximumCandies(candies, k));
    }
}
