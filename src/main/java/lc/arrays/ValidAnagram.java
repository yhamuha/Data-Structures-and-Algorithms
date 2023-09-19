package lc.arrays;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagramBySorting (String str1, String str2) {

        if (str1.length() != str2.length()) return false;

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static boolean isAnagram (String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] characters = new int[26];

        for (int i=0; i < str1.length(); i++) {
            characters[str1.charAt(i)-'a']++;
            characters[str2.charAt(i)-'a']--;
        }

        for (int j =0; j< characters.length; j++) {
            if (characters[j] !=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "str";
        String str2 = "rst";
        System.out.println(isAnagram(str1, str2));
    }
}
