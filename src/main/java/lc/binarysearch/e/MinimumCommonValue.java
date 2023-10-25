package lc.binarysearch.e;

public class MinimumCommonValue {
    //Overall time complexity: O(n log n)
    public int getCommon(int[] arr, int[] nums2) {
        // O(n)
        for(int num:nums2){
            int start=0;
            int end=arr.length-1;
            // O(log n)
            while(start<=end){
                int mid=start + (end-start)/2;
                if(arr[mid]==num){
                    return arr[mid];
                }
                else if(arr[mid]>num){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        var mcv = new MinimumCommonValue();
        System.out.println(mcv.getCommon(new int[]{1,2,3,6}, new int[]{2,3,4,5}));
    }
}
