package lc.binarysearch.e;

public class BinarySearch {
    // O(log n) O(1)
    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (nums[mid] < target)
                start = mid+1;
            else if(nums[mid] > target)
                end = mid -1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,8,10,12};
        System.out.println(search(nums, 9));
    }
}


