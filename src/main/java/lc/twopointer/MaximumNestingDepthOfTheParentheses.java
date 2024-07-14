package lc.twopointer;

public class MaximumNestingDepthOfTheParentheses {
    // O(n) O(1)
    public int maxDepth(String s) {
        int depth =0, open =0;
        for(char c : s.toCharArray()) {
            if (c == '(') open++;
            if (c==')') open--;
            depth = Math.max(depth, open);
        }
        return depth;
    }

    public static void main(String[] args) {
        MaximumNestingDepthOfTheParentheses maxDepthParentheses = new MaximumNestingDepthOfTheParentheses();
        String input = "(a(b(d(e)))c)";
        int maxDepth = maxDepthParentheses.maxDepth(input);
        System.out.println(maxDepth);
    }
}
