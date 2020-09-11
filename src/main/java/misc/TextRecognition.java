package misc;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;

public class TextRecognition {

    int findWords (int wordStart, int badWordStartIndex, String str,
                   HashSet<String> dictionary, ArrayList<String> result){
         for(int wordEnd = wordStart; wordEnd < str.length(); wordEnd++) {
             String wordCandidate = str.substring(wordStart, wordEnd+1);

             if(dictionary.contains(wordCandidate)) {
                 if (badWordStartIndex < wordStart) {
                     String badWord = str.substring(badWordStartIndex, wordStart);
                     result.add(badWord);
                 }
                 result.add(wordCandidate);

                 wordStart = wordEnd + 1;
                 badWordStartIndex = wordEnd + 1;
             }
         }
        return wordStart;
    }

    ArrayList<String> parseHelper (String str, HashSet<String> dictionary) {
        // start of string pointer
        int strStart = 0;
        // pointer on start of unexistant word
        int badWordStratIndex = 0;
        // list for store of words
        ArrayList<String> result = new ArrayList<>();

        while(strStart < str.length()) {
            int strNewStart = findWords(strStart, badWordStratIndex, str, dictionary, result);
            // if strNewStart > strStart that means function have found a word
            if (strNewStart > strStart) {
                strStart = strNewStart;
                badWordStratIndex = strNewStart;
            } else {
                strStart++;
            }
        }
        if (badWordStratIndex < str.length() - 1)
            result.add(str.substring(badWordStratIndex, str.length()));
        return result;
    }

    // time - O(N^2 + N) = O(N^2)
    String parse (String sentence, HashSet<String> dictionary) {
        if (sentence == null || sentence.equals("")) return null;

        ArrayList<String> r = parseHelper(sentence, dictionary);
        return StringUtils.join(r, " ");
    }

}
