package misc.problem_solving;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class NumJewelsInStones {
    public static void main(String[] args) {
        String J = "AA";
        String S = "AAAAbbbb";
        System.out.println(numJewelsInStones(J,S));
    }

    static int numJewelsInStones(String J, String S) {
        Set<Character> Jset = new HashSet();
        for (char j: J.toCharArray())
            Jset.add(j);

        int ans = 0;
        for (char s: S.toCharArray())
            if (Jset.contains(s))
                ans++;
        return ans;
    }
}
