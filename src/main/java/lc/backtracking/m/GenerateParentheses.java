package lc.backtracking.m;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    // TC: O(2^n)
    public List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>();
        backtrack(resultList, "", 0, 0, n);
        return resultList;
    }

    private void backtrack(List<String> resultList, String current_string, int open, int close,  int max){
        // SC: O(2n)
        if(current_string.length() == max * 2){ // base case: "((()))"
            resultList.add(current_string);
            return; // return from the particular stack call
        }
        if (open < max)
            backtrack(resultList, current_string + "(", open + 1, close, max);

        if (close < open)
            backtrack(resultList, current_string + ")", open, close + 1, max);
    }

    public static void main(String[] args) {
        var gp = new GenerateParentheses();
        int n = 3;
        System.out.println(gp.generateParenthesis(n));
    }
}
