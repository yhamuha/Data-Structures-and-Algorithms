package lc.stack.m;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    // O(n) O(n)
    static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stackOfIndexes = new Stack<>();
        int n = temperatures.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stackOfIndexes.isEmpty() && temperatures[i] > temperatures[stackOfIndexes.peek()]) {
                int index = stackOfIndexes.pop();
                answer[index] = i - index;
            }
            stackOfIndexes.push(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] temperatures = {1,5,3,6,10,8};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}

