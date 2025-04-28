package lc.binarysearch.m;

public class MinimumSpeedToArriveOnTime {
    // Overall O(n log m) O(1)
    // O(n) O(1)
    static boolean isPossible(int[] dist, int speed, double hour) {
        double ans = 0;
        for (int i = 0; i < dist.length; i++) {
            double d = dist[i] * 1.0 / speed;
            if (i != dist.length - 1)
                ans = ans + Math.ceil(d);
            else
                ans += d;
            if (ans > hour)
                return false;
        }
        return ans <= hour;
    }
    // O(log n) O(1)
    static int minSpeedOnTime(int[] dist, double hour) {
        int left = 1;
        int right = (int) 1e7; // 10_000_000
        int minSpeed = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isPossible(dist, mid, hour)) {
                minSpeed = mid;
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return minSpeed;
    }

    public static void main(String[] args) {
        int[] dist = {1, 3, 2};
        double hour = 2.7;
        System.out.println(minSpeedOnTime(dist, hour));
    }
}
