package lc.slidingwindow.m;

public class GetEqualSubstringsWithinBudget {
    // O(n) O(1)
    static int equalSubstring(String s, String t, int maxCost) {
        int left = 0, size = s.length(), right = 0;
        int currCost = 0, maxLen = 0;
        while (right < size) {
            currCost += Math.abs(s.charAt(right) - t.charAt(right));
            if (currCost > maxCost) {
                while (left <= right && currCost > maxCost) {
                    currCost -= Math.abs(s.charAt(left) - t.charAt(left));
                    left++;
                }
            }
            if (left <= right)
                maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        System.out.println(equalSubstring(s, t, maxCost));
    }
}
