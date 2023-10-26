package lc.binarysearch.m;

// expl: https://www.youtube.com/watch?v=6tUs8Ii3_Qs&ab_channel=ErraK

public class KokoEatingBananas {
    // O(n)
    public int maxEl(int[] piles) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            maxi = Math.max(maxi, piles[i]);
        }
        return maxi;
    }

    // O(n)
    public long totalHours(int[] piles, int hrs) {
        long total = 0;
        for (int i = 0; i < piles.length; i++) {
            total += (piles[i] + hrs - 1) / hrs; // Ceiling division
        }
        return total;
    }

    // O(n log m)
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = maxEl(piles);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total = totalHours(piles, mid);
            if (total <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        var keb = new KokoEatingBananas();
        System.out.println(keb.minEatingSpeed(new int[] {3,6,7,11}, 8));
    }
}
