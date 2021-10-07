package misc.problem_solving;

/**
 *
 */
public class TypeWordUsingSpecialTypewriter {
    public static void main(String[] args) {
        String word = "abc";
        System.out.println(minTimeToType(word));
    }

    static int minTimeToType(String word) {
        char currChar = 'a';
        char[] arr = word.toCharArray();
        int count = 0;
        for(char c : arr){
            int temp = Math.abs(currChar - c);
            count += Math.min(temp,26 - temp) + 1;
            currChar = c;
        }
        return count;
    }
}
