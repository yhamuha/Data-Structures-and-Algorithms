package lc.twopointer.e;

public class ValidPalindrome {
    // O(n) O(1)
    static boolean isPalindrome(String s) {
        int leftIdx = 0; int rightIdx = s.length()-1;
        while(leftIdx < rightIdx){
            char leftChar = s.charAt(leftIdx), rightChar = s.charAt(rightIdx);
            if (!Character.isLetterOrDigit(leftChar))
                leftIdx++;
            else if (!Character.isLetterOrDigit(rightChar))
                rightIdx--;
            else {
                if(Character.isLetterOrDigit(leftChar) != Character.isLetterOrDigit(rightChar))
                    return false;
                leftIdx++; rightIdx--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "raceacar";
        System.out.println(isPalindrome(s));
    }
}
