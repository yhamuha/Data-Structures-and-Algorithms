package lc.monotonicstack.m;

import java.util.Stack;

public class SumOfSubarrayMinimums {
    // O(n) O(n)
    static int sumSubarrayMins(int[] arr) {
        int mod = 1000000007; int len = arr.length;
        int[] preSmaller = new int[len]; int[] nextSmaller = new int[len];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++){
            preSmaller[i] = -1;
            nextSmaller[i] = len;
        }
        for (int i = 0; i < len; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                int index= stack.pop();
                nextSmaller[index] = i;
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = len-1; i >= 0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                int index= stack.pop();
                preSmaller[index] = i;
            }
            stack.push(i);
        }
        stack.clear();
        long res = 0;
        for (int i = 0; i < len; i++){
            int left=i-preSmaller[i];
            int right=nextSmaller[i]-i;
            res=(res+((long)arr[i]*left*right)%mod);
        }
        return (int)res;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
}
