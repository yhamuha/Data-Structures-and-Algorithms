package lc.backtracking.m;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    // O(n!) O(n)
    public List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>();
        backtrack(resultList, "", 0, 0, n);
        return resultList;
    }

    private void backtrack(List<String> resultList, String tempStr, int open, int close, int max) {
        if (tempStr.length() == max * 2) {
            resultList.add(tempStr);
            return;
        }
        if (open < max)
            backtrack(resultList, tempStr + "(", open + 1, close, max);
        if (close < open)
            backtrack(resultList, tempStr + ")", open, close + 1, max);
    }

    public static void main(String[] args) {
        var gp = new GenerateParentheses();
        int n = 4;
        System.out.println(gp.generateParenthesis(n));
    }
}
