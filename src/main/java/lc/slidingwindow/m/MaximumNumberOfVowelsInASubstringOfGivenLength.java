package lc.slidingwindow.m;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    // O(n) O(1)
    static int maxVowels(String s, int k) {
        int maxVowel=0;
        int left=0;
        int vowel=0;
        for(int right=0;right<s.length();right++){
            if(isVowel(s.charAt(right)))vowel++;
            if((right-left+1) == k){
                maxVowel=Math.max(maxVowel,vowel);
                if(isVowel(s.charAt(left)))vowel--;
                left++;
            }
        }
        return maxVowel;
    }
    static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }
}
