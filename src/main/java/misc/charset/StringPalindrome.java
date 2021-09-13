package misc.charset;
import misc.bitwise.*;
/**
 *  The {@code StringPalindrome} class
 *  determine a palindrome from given String
 *
 *  palindrome is:
 *  quantity of each letter is even
 *  quantity of each letter is even except one
 *
 *  lower case only, spaces ignored
 */
public class StringPalindrome {

    /**
     * drive method
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("abab"));
    }

    /**
     * transform ASCII lower case letters to numbers
     * @return int number from 0 to 25
     */
    static int getLetterCode(char letter) {
        int aCode = (int) 'a';
        int zCode = (int) 'z';
        int letterCode = (int) letter;
        if (letterCode < aCode || letterCode > zCode)
            throw new IndexOutOfBoundsException();
        return letterCode - aCode;
    }

    /**
     * calculate if given String is Palindrome
     * using array of boolean[26]
     * @return boolean
     */
    static boolean isPermutationOfPalindrome(String str) {
        boolean[] lettersTable = new boolean[26];
        int oddLettersCount = 0;
        for (char letter : str.toCharArray()) {
            if (letter == ' ') continue;
            int letterCode = getLetterCode(letter);
            lettersTable[letterCode] = !lettersTable[letterCode];
            if (lettersTable[letterCode]) oddLettersCount++;
            else oddLettersCount--;
        }
        return oddLettersCount <= 1;
    }

}
