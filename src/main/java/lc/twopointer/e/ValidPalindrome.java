package lc.twopointer.e;

public class ValidPalindrome {
    // O(n) O(1)
    public boolean isPalindrome(String s) {
        int low = 0; int high = s.length()-1;
        while(low<high){
            char l = s.charAt(low); char h = s.charAt(high);
            if (!Character.isLetterOrDigit(l)) low++;
                else if (!Character.isLetterOrDigit(h)) high--;
                else {
                    if(Character.isLetterOrDigit(l) != Character.isLetterOrDigit(h))
                        return false;
                    low++; high--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abba";
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome(s));
    }
}
