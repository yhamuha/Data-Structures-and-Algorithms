package misc.problem_solving;

/**
 *
 */
public class MaxDepthParentheses {
    public static void main(String[] args) {
        String s = "(1 + (2+3))";
        System.out.println(maxDepth(s));
    }

    static int maxDepth(String s) {
        int count = 0, max = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                count++;
                max = Math.max(max, count);
            } else if(c == ')')
                count--;
        }
        return max;
    }
}
