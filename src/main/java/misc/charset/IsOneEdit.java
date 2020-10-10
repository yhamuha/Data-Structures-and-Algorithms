package misc.charset;

public class IsOneEdit {
    public static void main(String[] args) {
        System.out.println(isOnlyOneEdit("beer","beer"));
    }

    static boolean isOnlyOneEdit (String s1, String s2) {

        char[] s1Array= new char[s1.length()];
        s1Array = s1.toCharArray();

        char[] s2Array= new char[s2.length()];
        s2Array = s2.toCharArray();

        if ((s1.length() - s2.length() != 0)
                && (s1.length() - s2.length()) >= 2)  return false;
        if ((s1.length() - s2.length()) == 1)  return true;

        int difference = 0;
        if ((s1.length() == s2.length())) {
            for (int i = 0; i < s1Array.length; i++) {
                for (int j=0; j < s2Array.length; j++) {
                    if (s1Array[i] != s2Array[j])
                        difference++;
                }
            }
        }
        if (difference > 1) return false;
        else return true;
    }
}
