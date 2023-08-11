package lc.strings;

public class JoinWords {
    String joinWords(String[] words) {
        String sentence = "";
        for (String w: words)
            sentence = sentence + w;
        return sentence;
    }
}
