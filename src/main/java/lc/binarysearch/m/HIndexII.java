package lc.binarysearch.m;
// expl: https://www.youtube.com/watch?v=CjKJDloMnwE&ab_channel=Techdose
// int[] citations in ASC order
public class HIndexII {
    // O(log n)
    public int hIndex(int[] citations) {
        int n = citations.length;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            // h index value is the number where arr[hindex] == arr.size() - hindex
            if(citations[mid] < n-mid){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return n - low;
    }

    public static void main(String[] args) {
        var hi = new HIndexII();
        System.out.println(hi.hIndex(new int[] {0,1,3,5,6}));
    }
}
