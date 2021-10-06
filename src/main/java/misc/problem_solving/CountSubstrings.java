package misc.problem_solving;

/**
 *
 */
public class CountSubstrings {
    public static void main(String[] args) {
        String s = "aaaba";
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

    // !

    static int countLetters2(String s) {

        int ans = 0, count = 0;

        for (int i = 0; i < s.length (); i++) {
            if (i == 0 || s.charAt (i) == s.charAt (i - 1)) {
                ans += ++count;
            }
            else {
                count = 1;
                ans += count;
            }
        }

        return ans;
    }
}
