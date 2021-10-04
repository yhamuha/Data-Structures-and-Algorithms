package misc.problem_solving;

/**
 *
 */
public class StringToBalancedString {
    public static void main(String[] args) {
        String s = "RLRL";
        System.out.println(balancedStringSplit(s));
    }

    // O(n), O(1)
    static int balancedStringSplit(String s) {
        int count=0;
        int res=0;

        for(int i = 0; i < s.length(); i++) {
            // check L otherwise will have count = 0 when received balanced LR
            if(s.charAt(i)=='L') {
                count++;
            } else {
                count--;
            }

            if(count==0){
                res++;
            }
        }
        return res;
    }
}
