package misc.problem_solving;

/**
 *
 */
public class CountSubstrings {
    public static void main(String[] args) {
        String s = "aaaabbccc";
        System.out.println(countLetters2(s));

    }

    static int countLetters(String s) {
        //corner case;
        if(s == "" || s.length() == 0) return 0;

        int[] map = new int[26];
        char[] chars = s.toCharArray();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char c = chars[i];
            if(i != 0 &&  map[c - 'a'] == 0){
                map[s.charAt(i - 1) - 'a'] = 0;
            }
            map[c -'a'] ++;

            count += map[c -'a'] ;
        }
        return count;
    }

    // Arithmetic Sequence;
    static int countLetters2(String s) {

        int ans = 0, count = 0;

        for (int i = 0; i < s.length (); i++) {
            if (i == 0 || s.charAt (i) == s.charAt (i - 1)) {
                // Arithmetic Sequence;
                ans += ++count;
            }
            else {
                count = 1;
                ans += count;
            }
        }

        return ans;
    }

    //
    static int countLetters3(String s) {
        int res = 0;
        int temp = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                temp++;
                res += temp;
            } else {
                temp++;
                res += temp;
                temp = 0;
            }
        }

        // temp will be zero if next letter is not the same at s.length() - 1
        // I add 1 here because when we start count
        // the same letters we start from 1
        res += temp + 1;
        return res;
    }
}
