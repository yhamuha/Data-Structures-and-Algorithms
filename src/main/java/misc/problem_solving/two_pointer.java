package misc.problem_solving;

/**
 *
 */
public class two_pointer {
    public static void main(String[] args) {
        String haystack = new String("hello");
        String needle = new String("ll");
        System.out.println(strStr(haystack, needle));
    }

    static int strStr(String haystack, String needle) {
        int a = 0;
        if(haystack.contains(needle)){
            a = haystack.indexOf(needle);
        }
        else{
            a = -1;;
        }
        return a;
    }
}
