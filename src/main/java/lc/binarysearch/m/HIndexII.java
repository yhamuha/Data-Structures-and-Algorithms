package lc.binarysearch.m;
public class HIndexII {
    // O(log n) O(1)
    public int hIndex(int[] citations) {
        int n = citations.length;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(citations[mid] < n-mid)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return n - low;
    }

    public static void main(String[] args) {
        var hi = new HIndexII();
        System.out.println(hi.hIndex(new int[] {0,1,3,5,6}));
    }
}
