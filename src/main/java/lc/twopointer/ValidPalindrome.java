package lc.twopointer;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int low = 0 , high = s.length()-1;
        while(low<high){
            char l = s.charAt(low) , h = s.charAt(high);
            if(!Character.isLetterOrDigit(l)) low++;
            else if(!Character.isLetterOrDigit(h)) high--;
            else {
                if(Character.toLowerCase(l)!=Character.toLowerCase(h)) return false;
                low++; high--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome(s));
    }
}
