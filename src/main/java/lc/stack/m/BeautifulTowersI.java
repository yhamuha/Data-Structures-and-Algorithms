package lc.stack.m;

import java.util.Stack;

public class BeautifulTowersI {
    // O(n) O(n)
    public long maximumSumOfHeights(int[] heights) {
        int[] nsl = nextSmallerLeft(heights);
        long[] maxLeftSum = new long[heights.length];
        maxLeftSum[0] = heights[0];
        for (int i = 1; i < maxLeftSum.length; i++) {
            if (heights[i] >= heights[i - 1]) {
                maxLeftSum[i] = maxLeftSum[i - 1] + heights[i];
            } else {
                int bigger = i - nsl[i];
                long biggerContribution = (long) heights[i] * bigger;
                int rest = i - bigger;
                long restContribution = 0;
                if (rest >= 0)
                    restContribution = maxLeftSum[i - bigger];
                maxLeftSum[i] = biggerContribution + restContribution;
            }
        }
        int[] nsr = nextSmallerRight(heights);
        long[] maxRightSum = new long[heights.length];
        maxRightSum[maxRightSum.length - 1] = heights[heights.length - 1];
        for (int i = maxLeftSum.length - 2; i >= 0; i--) {
            if (heights[i] >= heights[i + 1]) {
                maxRightSum[i] = maxRightSum[i + 1] + heights[i];
            } else {
                int bigger = nsr[i] - i;
                long biggerContribution = (long) heights[i] * bigger;
                int rest = i + bigger;
                long restContribution = 0;
                if (rest < maxRightSum.length)
                    restContribution = maxRightSum[i + bigger];
                maxRightSum[i] = biggerContribution + restContribution;
            }
        }
        long res = Long.MIN_VALUE;
        for (int i = 0; i < heights.length; i++)
            res = Math.max(res, (maxLeftSum[i] + maxRightSum[i] - heights[i]));
        return res;
    }
    public int[] nextSmallerRight(int arr[]){
        int nsr[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        nsr[nsr.length-1] = nsr.length;
        st.push(arr.length-1);
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] > arr[st.peek()])
                nsr[i] = st.peek();
            else {
                while(!st.isEmpty() && arr[i] <= arr[st.peek()])
                    st.pop();
                if(st.isEmpty())
                    nsr[i] = nsr.length;
                else
                    nsr[i] = st.peek();
            }
            st.push(i);
        }
        return nsr;
    }
    public int[] nextSmallerLeft(int arr[]){
        int nsl[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        nsl[0] = -1;
        st.push(0);
        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[st.peek()])
                nsl[i] = st.peek();
            else {
                while(!st.isEmpty() && arr[i] <= arr[st.peek()])
                    st.pop();
                if(st.isEmpty())
                    nsl[i] = -1;
                else
                    nsl[i] = st.peek();
            }
            st.push(i);
        }
        return nsl;
    }

    public static void main(String[] args) {
        BeautifulTowersI towers = new BeautifulTowersI();
        int[] heights = {5,3,4,1,1};
        System.out.println(towers.maximumSumOfHeights(heights));
    }
}
