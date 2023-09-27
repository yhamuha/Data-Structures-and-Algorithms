package lc.stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    // O(n) O(n)
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];

        /*
                        0 1 2 3 4  5
                temp[]  1,5,3,6,10,8

                index   5432
                ans[]   012345
                           1
                stack   4

         */

        for(int i = n - 1; i >= 0; i--) {
            // if emptyStack and currTemp >= nextTemp
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                // remove elem from the stack
                st.pop();
            }
            if(!st.isEmpty()) {
                // add difference in index to answer[]
                ans[i] = st.peek() - i;
            }
            //  put index to stack
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] temperatures = {1,5,3,6,10,8};
        DailyTemperatures dt = new DailyTemperatures();
        System.out.println(Arrays.toString(dt.dailyTemperatures(temperatures)));
    }

}

/*
    here we need to calculate each of values by indexes
        Input: temperatures = [30,40,50,60]
        Output: [1,1,1,0]
    how many steps is to increase the temperature
 */
