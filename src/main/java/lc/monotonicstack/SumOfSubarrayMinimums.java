package lc.monotonicstack;

import java.util.Stack;

public class SumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        int len = arr.length;

        int[] preSmaller = new int[len];
        int[] nextSmaller = new int[len];

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < len; i++){
            preSmaller[i] = -1;
            nextSmaller[i] = len;
        }
        for (int i = 0; i < len; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                int index= s.pop();
                nextSmaller[index] = i;
            }
            s.push(i);
        }
        s.clear();
        for (int i = len-1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] > arr[i]){
                int index= s.pop();
                preSmaller[index] = i;
            }
            s.push(i);
        }
        s.clear();

        long res = 0;
        for (int i = 0; i < len; i++){
            int left= i -preSmaller[i];
            int right=nextSmaller[i]-i;
            res=(res+ ((long)arr[i]*left*right)%mod);
        }
        return (int)res;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        SumOfSubarrayMinimums sosm = new SumOfSubarrayMinimums();
        System.out.println(sosm.sumSubarrayMins(arr));
    }
}
