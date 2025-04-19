package lc.binarysearch.m;

public class HIndexII {
    // O(log n) O(1)
    static int hIndex(int[] citations) {
        int n = citations.length;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if (citations[mid] < n-mid)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return n - low;
    }

    public static void main(String[] args) {
        System.out.println(hIndex(new int[] {0,1,3,5,6}));
    }
}
