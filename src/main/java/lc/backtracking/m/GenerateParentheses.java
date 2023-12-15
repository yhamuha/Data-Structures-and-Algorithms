package lc.backtracking.m;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> output_array = new ArrayList<>();
        backtrack(output_array, "", 0, 0, n);
        return output_array;
    }

    private void backtrack(List<String> output_arr, String current_string, int open, int close,  int max){
        if(current_string.length() == max * 2){ // base case: "((()))"
            output_arr.add(current_string);
            return; // return from the particular stack call
        }
        if (open < max)
            backtrack(output_arr, current_string + "(", open + 1, close, max);

        if (close < open)
            backtrack(output_arr, current_string + ")", open, close + 1, max);
    }

    public static void main(String[] args) {
        var gp = new GenerateParentheses();
        int n = 3;
        System.out.println(gp.generateParenthesis(n));
    }
}
