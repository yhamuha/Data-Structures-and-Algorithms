package lc.arraysandhashing.e;

public class MergeSortedArray {
    // O(m+n) O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=nums1.length-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        MergeSortedArray merger = new MergeSortedArray();
        int[] nums1 = new int[6];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merger.merge(nums1, m, nums2, n);
        System.out.println("Merged array: ");
        for (int num : nums1)
            System.out.print(num + " ");
        System.out.println();
    }
}