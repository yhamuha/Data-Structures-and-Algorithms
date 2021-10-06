package misc.problem_solving;

/**
 *
 */
public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word = "abcdef";
        char ch = 'd';
        System.out.println(reversePrefix3(word,ch));
    }

    static String reversePrefix(String word, char ch) {

        char[] words = word.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < words.length; i++) {
            if ( words[i] == ch ) {

            }
        }

        return word;
    }

    // func to reverse input String
    static String reverse(String str) {

        char[] chars = str.toCharArray();

        int k = str.length();
        for (int i = 0; i <= str.length()/2;i++) {

            char temp = chars[i];
            chars[i] = chars[k-1];
            chars[k-1] = temp;
            k--;
        }

        return String.copyValueOf(chars);
    }

    static String reversePrefix2(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1)
            return word;

        return new StringBuilder(word.substring(0,index+1)).reverse().toString() + word.substring(index+1, word.length());
    }

    // solution
    static String reversePrefix3(String word, char ch) {

        if(word.indexOf(ch)==-1){
            return word;
        }
        int k=0;
        for(int i=0;i<word.length();i++){
            k++;
            if(word.charAt(i)==ch){
                break;
            }
        }
        char c[]=word.toCharArray();
        int i=0;
        while(i<k){
            char temp=c[i];
            c[i]=c[k-1];
            c[k-1]=temp;
            i++;
            k--;
        }

        return String.valueOf(c);

    }
}
