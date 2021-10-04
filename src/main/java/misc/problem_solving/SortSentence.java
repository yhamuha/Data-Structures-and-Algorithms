package misc.problem_solving;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 */
public class SortSentence {
    public static void main(String[] args) {
        String s = "This1 is2 world4 the3";
        System.out.println(sortSentence3(s));
    }

    // O(n), O(n)
    static String sortSentence(String s) {
        String[] words = s.split(" ");
        //Use tree map to order the indexes
        Map<Integer, String> hash = new TreeMap<Integer, String>();
        for(String word : words) {
            Integer index = Integer.valueOf(word.substring(word.length()-1));
            hash.put(index, word.substring(0, word.length()-1));
        }
        //Join the values which are ordered
        return String.join(" ", hash.values());
    }

    // using StringBuilder
    static String sortSentence2(String s) {

        String[] ques = s.split(" ");
        String[] ans = new String[ques.length];

        for(int i=0;i<ques.length;i++)
        {
            StringBuilder sb = new StringBuilder(ques[i]);
            char last = ques[i].charAt(ques[i].length()-1);
            int a = Character.getNumericValue(last);
            sb.deleteCharAt(ques[i].length()-1);
            ans[a-1] = sb.toString();
        }

        StringBuilder st = new StringBuilder();
        for(int z=0;z<ans.length-1;z++)
        {
            st.append(ans[z] + " ");
        }
        st.append(ans[ans.length-1]);

        return st.toString();
    }

    // pure java solution
    static String sortSentence3(String s) {

        String[] str = s.split(" ");
        String[] temp = new String[str.length];
        String res = "";
        for(int i=0;i<str.length;i++){
            int index = str[i].charAt(str[i].length()-1 )- '0';
            temp[index-1] = str[i].substring(0,str[i].length()-1);
        }
        for(int i=0;i<str.length;i++){
            res=res + temp[i] + " ";
        }
        return res.trim();
    }
}
