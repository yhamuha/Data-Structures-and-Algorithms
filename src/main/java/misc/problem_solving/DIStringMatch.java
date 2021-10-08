package misc.problem_solving;

import java.util.Arrays;

/**
 *
 */
public class DIStringMatch {
    public static void main(String[] args) {
     String S = "IDID";
        System.out.print(Arrays.toString(diStringMatch(S)));
    }
    // !
    static int[] diStringMatch(String S) {
        int N = S.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[N] = lo;
        return ans;
    }
}
