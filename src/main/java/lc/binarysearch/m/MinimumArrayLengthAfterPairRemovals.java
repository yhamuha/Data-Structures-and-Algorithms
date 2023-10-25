package lc.binarysearch.m;

import java.util.Arrays;
import java.util.List;

public class MinimumArrayLengthAfterPairRemovals {
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

    public static void main(String[] args) {
        var mar = new MinimumArrayLengthAfterPairRemovals();
        List<Integer> nums = Arrays.asList(1,1,2);
        System.out.println(mar.minLengthAfterRemovals(nums));
    }
}
