package lc.slidingwindow.m;

public class GetEqualSubstringsWithinBudget {
    // O(n) O(1)
    public int equalSubstring(String s, String t, int maxCost) {
        int leftPtr = 0, size = s.length(), rightPtr = 0;
        int currCost = 0, maxLen = 0;
        while (rightPtr < size) {
            currCost += Math.abs(s.charAt(rightPtr) - t.charAt(rightPtr));
            if (currCost > maxCost) {
                while (leftPtr <= rightPtr && currCost > maxCost) {
                    currCost -= Math.abs(s.charAt(leftPtr) - t.charAt(leftPtr));
                    leftPtr++;
                }
            }
            if (leftPtr <= rightPtr)
                maxLen = Math.max(maxLen, rightPtr - leftPtr + 1);
            rightPtr++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        GetEqualSubstringsWithinBudget solution = new GetEqualSubstringsWithinBudget();
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        int result = solution.equalSubstring(s, t, maxCost);
        System.out.println(result);
    }
}
