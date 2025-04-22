package lc.binarysearch.m;

public class MinimumTimeToCompleteTrips {
    // O(log n) O(1)
    static long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        long min = time[0];
        for(int t : time)
            min = Math.min(min, t);
        long right = totalTrips * min;
        while(left < right){
            long mid = left + (right - left) / 2;
            long total = totalTripInGivenTime(time, mid);
            if(total < totalTrips)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
    private static long totalTripInGivenTime(int[] time, long givenTime){
        long totalTrips = 0l;
        for(int tripTime : time)
            totalTrips += ((long)givenTime) / tripTime;
        return totalTrips;
    }

    public static void main(String[] args) {
        System.out.println(minimumTime(new int[]{1,2,3},5));
    }
}
