package misc.problem_solving;

/**
 *
 */
public class LastWordLength {
    public static void main(String[] args) {
        String str = "yes it is it the world  ";
//        System.out.println(lengthOfLastWord(str));
//        System.out.println(lengthOfLastWord2(str));
        System.out.println(lengthOfLastWord3(str));
    }

    // compute last word from the end, trimmed the trailing spaces
    // O(n), O(1)
    static int lengthOfLastWord(String s) {
        int p = s.length() - 1;
        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }

        int length = 0;
        while (p >= 0 && s.charAt(p) != ' ') {
            p--;
            length++;
        }
        return length;
    }
    // One loop pass solution
    // O(n), O(1)
    static int lengthOfLastWord2(String s) {
        int p = s.length(), length = 0;
        while (p > 0) {
            p--;
            if (s.charAt(p) != ' ') {
                length++;
            }
            else if (length > 0) {
                return length;
            }
        }
        return length;
    }

    // using built-in java functions
    static int lengthOfLastWord3(String s) {
        s = s.trim();  // trim the trailing spaces in the string
        return s.length() - s.lastIndexOf(" ") - 1;
    }
}
