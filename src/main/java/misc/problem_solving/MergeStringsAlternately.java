package misc.problem_solving;

/**
 *
 */
public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abzz";
        String word2 = "xy";
        System.out.println(mergeAlternately2(word1, word2));
    }

    //
    static String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        if (word1.length() < word2.length()) {

            for (int i = 0; i < word1.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            if (word1.length() < word2.length()) {
                sb.append(word2.substring(word1.length(), word2.length()));
            } else {
                sb.append(word1.substring(word2.length(), word1.length()));
            }
        } else {
            for (int i = 0; i < word2.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }

            if (word1.length() < word2.length()) {
                sb.append(word2.substring(word1.length(), word2.length()));
            } else {
                sb.append(word1.substring(word2.length(), word1.length()));
            }
        }
        return sb.toString();
    }


    static String mergeAlternately2(String word1, String word2) {

        StringBuilder st= new StringBuilder();
        for(int i=0;i<word1.length();i++){

            for(int j=i;j<=i;j++){
                st.append(word1.charAt(i));
                if(j==word1.length()-1 && j<word2.length()){
                    st.append(word2.substring(j));
                }else if(j<word2.length()){
                    st.append(word2.charAt(j));
                }

            }
        }
        return st.toString();
    }
}
