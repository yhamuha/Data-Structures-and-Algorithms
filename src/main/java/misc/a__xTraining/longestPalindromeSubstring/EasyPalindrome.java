package misc.a__xTraining.longestPalindromeSubstring;

/**
 *
 */
public class EasyPalindrome {


    public static void main(String[] args) {
    String str = "abba";
        System.out.println(isPalindrome(str));
    }

//    public static boolean checkPalindrome(String text){
//        StringBuilder sb = new StringBuilder();
//        char[] contents = text.toCharArray();
//        for(int i = text.length() -1; i>=0 ; i--) {
//            sb.append(contents[i]); }
//        String reversed = sb.toString();
//
//        return text.equals(reversed); }

    // isPalindrome
    /*static boolean isPalindrome(String str) {

        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i=str.length()-1; i>=0; i--) {
            sb.append(chars[i]);
        }

        String reversed = sb.toString();
        return str.equals(reversed);
    }*/


    static boolean isPalindrome(String str) {

        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = chars.length-1; i>=0 ; i--) {
            sb.append(chars[i]);
        }

        String reverse = sb.toString();
        return str.equals(reverse);


    }

}
