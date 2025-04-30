package lc.slidingwindow;

public class CheckAverageInArray {
    // O(n) O(n)
     static double[] calculateMovingAverages(int[] nums, int windowSize) {
        int resultSize = nums.length - windowSize + 1;
        double[] result = new double[resultSize];
        for(int i=0; i<resultSize; i++){
            double sum = 0.0;
            for(int j=0; j<windowSize; j++)
                sum+=nums[i+j];
            result[i] = sum/windowSize;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int windowSize = 2;
        double [] averages = calculateMovingAverages(array, windowSize);
        for (double avg : averages) {
            System.out.print(avg);
        }
    }
}



