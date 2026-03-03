package lc.stack.m;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    // O(n) O(n)
    /*static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stackOfIndexes = new Stack<>();
        int n = temperatures.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stackOfIndexes.isEmpty() &&
                    temperatures[i] > temperatures[stackOfIndexes.peek()]) {
                int index = stackOfIndexes.pop();
                answer[index] = i - index;
            }
            stackOfIndexes.push(i);
        }
        return answer;
    }*/

    // O(n) O(n)
    public static int[] dailyTemperatures(int[] temps) {
        int n = temps.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}

