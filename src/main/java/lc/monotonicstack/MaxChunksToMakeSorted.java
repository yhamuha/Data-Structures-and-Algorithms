package lc.monotonicstack;

import java.util.Stack;

public class MaxChunksToMakeSorted {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int x : arr) {
            if(st.isEmpty() || st.peek() < x) {
                st.push(x);
            }
            else {
                int max = x;
                while(!st.isEmpty() && st.peek() > x) {
                    max = Math.max(max, st.pop());
                }
                st.push(max);
            }
        }
        return st.size();
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0};
        MaxChunksToMakeSorted mcs = new MaxChunksToMakeSorted();
        System.out.println(mcs.maxChunksToSorted(arr));
    }
}
