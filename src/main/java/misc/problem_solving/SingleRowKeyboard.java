package misc.problem_solving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class SingleRowKeyboard {
    public static void main(String[] args) {
        String keyboard = "abcdefghijklmnopqrstuvwxyz";
        String word = "ki";
        System.out.println(calculateTime2(keyboard,word));
    }

    static int calculateTime(String keyboard, String word) {
        // String -> List<Character>
        List<Character> lst=new ArrayList<>();
        for(char c: keyboard.toCharArray()){
            lst.add(c);
        }

        int currentMove=0, time=0;

        for(int i=0; i<word.length(); i++) {
            //
            int nextMove=Math.abs(currentMove - lst.indexOf(word.charAt(i)));

            currentMove=lst.indexOf(word.charAt(i));

            time+=nextMove;
        }
        return time;
    }

    // using hash
    static int calculateTime2(String keyboard, String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keyboard.length(); i++) {
            map.put(keyboard.charAt(i), i);
        }

        int ans = 0;
        int cur = 0;
        for (char c : word.toCharArray()) {
            ans += Math.abs(cur - map.get(c));
            cur = map.get(c);
        }

        return ans;
    }
}
