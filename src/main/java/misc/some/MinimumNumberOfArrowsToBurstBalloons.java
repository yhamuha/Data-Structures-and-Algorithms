package misc.some;

import java.util.Arrays;

public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));

        int result = 1;
        int previous = 0;

        for(int current = 1; current < points.length; current++){
            // take a first coordinates
            // take a next coordinates pair. If next.last index > first.first then
            if(points[current][0] > points[previous][1]){
                // take a new arrow
                result++;
                // update the index of the previously burst balloon
                previous = current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        var mnoatbb = new MinimumNumberOfArrowsToBurstBalloons();
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(mnoatbb.findMinArrowShots(points));

    }
}
