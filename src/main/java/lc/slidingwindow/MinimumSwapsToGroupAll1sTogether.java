package lc.slidingwindow;

public class MinimumSwapsToGroupAll1sTogether {

    int getMinSwapsCount (int[] arr) {
        int onesCount = 0;
        for (int i=0; i< arr.length;i++) {
            if (arr[i] == 1) onesCount+=1;
        }
        int windowSize = onesCount;
        int windowOnesCount = 0;
        for (int i=0; i<windowSize;i++) {
            if (arr[i]==1) windowOnesCount+=1;
        }
        int maxOnesCount = windowOnesCount;
        int windowStart = 1;
        int windowEnd = windowSize;
        while (windowEnd < arr.length) {
            if (arr[windowStart -1] == 1) windowOnesCount -=1;
            if (arr[windowEnd] == 1) windowOnesCount +=1;
            maxOnesCount = Math.max(maxOnesCount, windowOnesCount);
            windowStart +=1;
            windowEnd +=1;
        }
        return windowSize - maxOnesCount;
    }

    public static void main(String[] args) {
        var ms = new MinimumSwapsToGroupAll1sTogether();
        System.out.println(ms.getMinSwapsCount(new int[]{0,1,0,1,0,1,1,1,1,0,1,0,0,1,1,1,0,1,1,1,0,0,0,1}));
    }
}
