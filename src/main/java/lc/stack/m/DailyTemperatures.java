package lc.stack.m;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    // O(n) O(n)
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] answer = new int[n];
        for(int i = n-1; i >= 0; i--) {
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()])
                stack.pop();
            if(!stack.isEmpty())
                answer[i] = stack.peek() - i;
            stack.push(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        DailyTemperatures dt = new DailyTemperatures();
        System.out.println(Arrays.toString(dt.dailyTemperatures(temperatures)));
    }
}

