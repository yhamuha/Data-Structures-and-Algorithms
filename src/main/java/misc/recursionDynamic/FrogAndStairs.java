package misc.recursionDynamic;

/**
 *
 */
public class FrogAndStairs {
    static int pathCount = 0;

    public static void main(String[] args) {
        getPathCount(1);
        System.out.println(pathCount);
        String str = "abc";

        System.out.println(removeIthChar(str, 0));
        System.out.println(removeIthChar(str, 1));
        System.out.println(removeIthChar(str, 2));
    }

    static void getPathCount(int n) {
        if (n < 0) return;
        if (n == 0) {
            pathCount++;
            return;
        }
        getPathCount(n-2);
        getPathCount(n-1);
    }

    // solution without using pathCount
    int getWaysCount (int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;

        return getWaysCount(n-2) +
                getWaysCount(n - 1);
    }


    // permutations
    static void permutations(String candidate, String letters) {
        if (letters.length() == 0) System.out.println(candidate);
        for (int i = 0; i < letters.length(); i++)
            permutations(candidate + letters.charAt(i), removeIthChar(letters, i));
    }

    //
    static String removeIthChar (String str, int i) {
        return str.substring(0, i) + str.substring(i + 1);
    }
}
