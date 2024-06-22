package lc.twopointer.m;

import java.util.ArrayList;
import java.util.List;

public class PancakeSorting {
        public List<Integer> pancakeSort(int[] arr) {
            boolean isSorted = true;
            for(int i=1;i<arr.length;i++){
                if(arr[i]<arr[i-1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted)
                return new ArrayList<>();
            // 3 2 4 1 -> reverse (k=3)
            // 4 2 3 1 -> reverse (k=4)
            // 1 3 2 4 -> reverse (k=2)
            // 3 1 2 4 -> reverse (k=3)
            // 2 1 3 4 -> reverse (k=2)
            // 1 2 3 4    sorted array

            List<Integer> list = new ArrayList<>();
            for(int i=arr.length;i>=1;i--){
                int k = search(arr,i);
                if(k==1){
                    if(i!=1){
                        list.add(i);
                        reverse(arr,i);
                    }
                }else{
                    list.add(k);
                    reverse(arr,k);
                    list.add(i);
                    reverse(arr,i);
                }
            }
            return list;
        }
        public int search(int[] arr, int target){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target)
                    return i + 1;
            }
            return 0;
        }
        public void reverse(int[] arr, int idx){
            int lo = 0;
            int hi = idx-1;
            while(lo<hi){
                int temp = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = temp;
                lo++;
                hi--;
            }
        }

    public static void main(String[] args) {
        PancakeSorting ps = new PancakeSorting();
        int[] arr = {3,2,4,1};
        System.out.println(ps.pancakeSort(arr));
    }
}
