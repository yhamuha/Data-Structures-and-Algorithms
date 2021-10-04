package misc.problem_solving;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class SingleRowKeyboard {
    public static void main(String[] args) {
        String keyboard = "abcdefghijklmnopqrstuvwxyz";
        String word = "ebho";
        System.out.println(calculateTime(keyboard,word));
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
}
