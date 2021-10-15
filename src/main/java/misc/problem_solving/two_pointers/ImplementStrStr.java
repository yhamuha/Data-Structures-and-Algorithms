package misc.problem_solving.two_pointers;

/**
 *
 */
public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack = new String("hello");
        String needle = new String("ll");
        System.out.println(strStr2(haystack, needle));
    }

    // bad performance
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

    // O(n) O(n)
    static int strStr2(String haystack, String needle)
    {
        int len = needle.length();

        if(haystack.length() < needle.length())
            return -1;

        if(needle.length() == 0)
            return 0;

        for(int i = 0; i + len <= haystack.length(); i++)
        {

            if(haystack.substring(i, i + len).equals(needle))
                return i;
        }

        return -1;
    }
}
