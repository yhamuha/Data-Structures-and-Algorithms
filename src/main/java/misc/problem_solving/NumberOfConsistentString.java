package misc.problem_solving;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class NumberOfConsistentString {
    public static void main(String[] args) {
        String allowed = "azs";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings3(allowed, words));
    }

    // with hash
    // O(n), O(n^2)
    static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> a=new HashSet<>();
        Set<Character> w=new HashSet<>();
        int count=0;
        for(int i=0;i<allowed.length();i++){
            a.add(allowed.charAt(i));
        }
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                w.add(words[i].charAt(j));
            }
            if(a.containsAll(w)){
                count++;
            }
            w.clear();
        }
        return count;
    }

    // using hashSet
    // O(n), O(n)
    static int countConsistentStrings2(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<Character>();
        for (char c : allowed.toCharArray())
            hs.add(c);
        int count = 0;
        for (String word : words)
            if (isConsistent(hs, word))
                count++;
        return count;
    }
    static boolean isConsistent(HashSet<Character> hs, String s) {
        for (char c : s.toCharArray())
            if (!hs.contains(c))
                return false;
        return true;
    }

    // using boolean array
    // O(n), O(1) due to boolean[]
    static int countConsistentStrings3(String allowed, String[] words) {
        boolean[] allowedAscii = new boolean[26];
        for (char c : allowed.toCharArray())
            allowedAscii[(int)c - 97] = true;
        int count = 0;
        for (String word : words) {
            if (isConsistent(allowedAscii, word))
                count++;
        }
        return count;
    }
    static boolean isConsistent(boolean[] allowedAscii, String word) {
        for (char c : word.toCharArray())
            if (!allowedAscii[(int)c - 97])
                return false;
        return true;
    }
}
