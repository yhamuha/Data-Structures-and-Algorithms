package lc.strings;

public class LongestCommonPrefix2 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            // indexOf will return start position of existing element
            // go through array of words and check coincidence
            // substring one letter on each iteration
            while (strs[i].indexOf(prefix) != 0) {
                // substring(start, end+1)
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flood", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
