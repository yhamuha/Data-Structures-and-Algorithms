package lc.binarysearch.m;

import java.util.*;

public class MinimumArrayLengthAfterPairRemovals {

    // O(n)
    public int minLengthAfterRemovals(List<Integer> nums) {

        int N = nums.size(), max = 1, temp = 1;

        for(int i = 1; i < N; i++){
            if(nums.get(i) - nums.get(i - 1) == 0){
                temp++;
                if(max < temp)
                    max = temp;
            }else
                temp = 1;
        }

        if(max > N / 2)
            return (max * 2 - N);
        if(N % 2 == 1)
            return 1;
        return 0;
    }

    // O(n log n)
    public int minLengthAfterRemovals_(List<Integer> nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : nums) {
            cnt.merge(x, 1, Integer::sum);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int x : cnt.values()) {
            pq.offer(x);
        }
        int ans = nums.size();
        while (pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();
            x--;
            y--;
            if (x > 0) {
                pq.offer(x);
            }
            if (y > 0) {
                pq.offer(y);
            }
            ans -= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        var mar = new MinimumArrayLengthAfterPairRemovals();
        List<Integer> nums = Arrays.asList(1,1,2);
        System.out.println(mar.minLengthAfterRemovals(nums));
    }
}
