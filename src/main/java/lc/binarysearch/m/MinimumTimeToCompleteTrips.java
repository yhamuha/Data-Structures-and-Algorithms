package lc.binarysearch.m;

public class MinimumTimeToCompleteTrips {

    // expl https://www.youtube.com/watch?v=2KwJ0zHBGI8&t=100s&ab_channel=CodingDecoded
        public long minimumTime(int[] time, int totalTrips) {

            long left = 1;
            long min = time[0];
            for(int t : time){
                min = Math.min(min, t);
            }
            long right = totalTrips * min;

            while(left < right){
                long mid = left + (right - left) / 2;
                //How many trip we can do
                long total = totalTripInGivenTime(time, mid);
                //We cannot reach totalTrips, means mid is too small
                if(total < totalTrips){
                    left = mid + 1;
                }else{
                    //We can reach totalTrips, but we want right to be as small as possible
                    //Therefore, we don't need to + 1
                    right = mid;
                }
            }
            return left;
        }

        private long totalTripInGivenTime(int[] time, long givenTime){
            long totalTrips = 0l;
            // calculate totalTrips
            for(int tripTime : time){
                totalTrips += ((long)givenTime) / tripTime;
            }
            return totalTrips;
        }

    public static void main(String[] args) {
        var mttt = new MinimumTimeToCompleteTrips();
        System.out.println(mttt.minimumTime(new int[]{1,2,3},15));
    }
}
