package misc.problem_solving;

/**
 *
 */
public class PangramSentence {
    public static void main(String[] args) {
        String sentence = "thequickbronfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram2(sentence));
    }

    // straightforward solution
    static boolean checkIfPangram(String sentence) {
        for(Character i='a';i<='z';i++){
            if(!sentence.contains(Character.toString(i)))
                return false;
        }
        return true;
    }

    // O(n), O(1)
    static boolean checkIfPangram2(String sentence) {

        char ch[]= new char[26];

        // get char array with '1' related each existent symbol
        for (int i=0; i<sentence.length(); i++){
            ch[sentence.charAt(i)-'a']++;
        }

        // if at leat one symbol missing -> sentence is not panagram
        for(int i=0; i<26; i++){
            if(ch[i]==0)
                return false;
        }

        return true;
    }
}
