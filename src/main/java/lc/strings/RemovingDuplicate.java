package lc.strings;

public class RemovingDuplicate {

    public static String removeDuplicates(String str) {
        char[] chArray = str.toCharArray(); // or, use charAt(i)
        StringBuilder sb = new StringBuilder();
        for (char ch : chArray) {
            if (sb.indexOf(String.valueOf(ch)) == -1) { // negative means that StringBuilder
                                                        // doesn't contain the current character
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = new String("abba");
        System.out.println(removeDuplicates(str));
    }
}
