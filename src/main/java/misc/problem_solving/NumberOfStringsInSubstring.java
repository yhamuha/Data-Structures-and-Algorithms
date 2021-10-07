package misc.problem_solving;

/**
 *
 */
public class NumberOfStringsInSubstring {
    public static void main(String[] args) {
    String[] patterns = {"a", "abc", "bc", "d"};
    String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }

    static int numOfStrings(String[] patterns, String word) {

        int k=0;
        for(int i=0;i<patterns.length;i++){

            if(word.contains(patterns[i]))
                k++;
        } return k;

    }
}
