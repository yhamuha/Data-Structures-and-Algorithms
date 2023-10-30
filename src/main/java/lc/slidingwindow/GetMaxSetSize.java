package lc.slidingwindow;

public class GetMaxSetSize {
    int getMaxSetSize (int[] arr) {
        int maxSetSize = 0;
        int currSize = 0;

        for(int i=0; i<arr.length; i++) {
            if (arr[i] == 1) currSize++;
            else currSize = 0;

            maxSetSize = Math.max(currSize, maxSetSize);
        }
        return maxSetSize;
    }

    public static void main(String[] args) {
        var gmss = new GetMaxSetSize();
        System.out.println(gmss.getMaxSetSize(new int[] {1,1,0,1,1,1}));
    }
}
