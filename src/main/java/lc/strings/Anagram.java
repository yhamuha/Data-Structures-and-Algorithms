package lc.strings;

public class Anagram {

    // O(n)
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] letters = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i)]++;
            letters[s2.charAt(i)]--;
        }

        for (int count : letters) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "aB";
        String str2 = "bA";
        System.out.println(isAnagram(str1,str2));
    }
}
