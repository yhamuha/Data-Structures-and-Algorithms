package lc.heap_priority_queue.m;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSums {
    static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        // O(m*n log k) O(k)
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0] + b[1]) - (a[0] + a[1]));
        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++){
                maxHeap.offer(new int[] {nums1[i], nums2[j]});
                if(maxHeap.size() > k){
                    maxHeap.poll();
                    int currentSum = nums1[i] + nums2[j];
                    int[] maxSumArr = maxHeap.peek();
                    if( currentSum >= (maxSumArr[0] + maxSumArr[1]) )
                        break;
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        int n = maxHeap.size();
        for(int i = 0; i < n; i++){
            int[] pairArr = maxHeap.poll();
            List<Integer> pair = new ArrayList<>();
            pair.add(pairArr[0]);
            pair.add(pairArr[1]);
            result.add(pair);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,7,11};
        int[] nums2 = {2,4,6};
        int k = 3;
        System.out.println(kSmallestPairs(nums1, nums2, k));
    }
}
