package misc.problem_solving;

/**
 *
 */
public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(())(()())";
        System.out.println(removeOuterParentheses(s));
    }

    // O(n)
    static String removeOuterParentheses(String s)
    {
        int startIndex = -1, openCount = 0, closeCount = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(')
            {
                if (startIndex < 0)
                    startIndex = i;
                openCount++;
            } else if (s.charAt(i) == ')')
                openCount--;

            if (openCount == 0)
            {
                sb.append(s.substring(startIndex + 1, i));
                startIndex = -1;
            }
        }

        return sb.toString();
    }
}
