package misc.problem_solving;

/**
 *   (1)1
 *   (2)1 = 11
 *   (3)11 = two 1's = 21
 *   (4)21 = one 2 + one 1 = 1211
 *   (5)1211 = one 1 one 2 two 1's = 111221
 */
public class CountAndSay {

    public String CountAndSay(int n) {
        String str = "1";

        for (int i=2; i<=n; i++) {
            StringBuilder temp = new StringBuilder();
            char prev = str.charAt(0);
            int counter = 1;
            for(int j=1; j<str.length(); j++) {
                char ch = str.charAt(j);
                if (ch != prev) {
                    temp.append(counter);
                    temp.append(prev);
                    counter = 1;
                    prev = ch;
                } else {
                    counter++;
                }
            }
            temp.append(counter);
            temp.append(prev);
            str = temp.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        CountAndSay cas = new CountAndSay();
        System.out.println(cas.CountAndSay(7));
    }
}
