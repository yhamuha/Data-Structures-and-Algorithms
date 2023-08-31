package lc.strings;

import java.sql.SQLOutput;
import java.util.HashMap;

public class MaxOccurenceOfCharacter {

    static char getMaxOccurringChar(String str) {

        HashMap<Character, Integer> mp = new HashMap<>();

        int n = str.length();
        char answer = 0;
        int counter = 0;

        for(int i = 0; i < n; i++) {
            char c = str.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
            if(counter < mp.get(c)) {
                answer = c;
                counter = mp.get(c);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String str = "sample";
        System.out.println("Max occurring character is: " + getMaxOccurringChar(str));
    }
}
