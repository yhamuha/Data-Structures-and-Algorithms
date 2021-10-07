package misc.problem_solving;

/**
 *
 */
public class StringEqualNumberOfOccurences {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(areOccurrencesEqual(s));
    }

    static boolean areOccurrencesEqual(String s) {
        int[] res = new int[32];
        int max = 0;
        for (char c : s.toCharArray()) {
            res[c - 97]++;
            max = Math.max(res[c - 97], max);
        }

        for (int i : res) {
            if (i != 0 && max != i) {
                return false;
            }
        }

        return true;
    }
}
