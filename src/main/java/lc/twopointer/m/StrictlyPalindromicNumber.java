package lc.twopointer.m;

public class StrictlyPalindromicNumber {
    // O(log n) O(1)
    boolean isPalindrom(String str){
        int left = 0, right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // O(n) O(n)
    String convert(int n, int i){
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            int reminder = n%i;
            n/=i;
            sb.insert(0,reminder);
        }
        return sb.toString();
    }
    // O(n) O(n) total
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2; i<=(n-2); i++){
            String str = convert(n, i);
            if(isPalindrom(str)){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StrictlyPalindromicNumber spn = new StrictlyPalindromicNumber();
        System.out.println(spn.isStrictlyPalindromic(9));
    }
}
