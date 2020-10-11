package misc.charset;

/**
 *  The {@code IsOneEditEffective} class determine was
 *  string edited in one element or not
 */
public class IsOneEditEffective {
    public static void main(String[] args) {
        System.out.println(strHasOneEdit("beer", "bear"));
    }

    /**
     * looking for a replaces
     * @param s1        input string1
     * @param s2        input string2
     * @return boolean
     */
    static boolean strHasOneReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) return false;
                foundDifference = true;
            }
        }
        return true;
    }
    /**
     * looking for a insertions
     * @param source        input string1
     * @param edited        input string2
     * @return boolean
     */
    static boolean strHasOneInsert(String source, String edited) {
        int sourceIndex = 0;
        int editedIndex = 0;
        while (editedIndex < edited.length()) {
            if (source.charAt(sourceIndex) == edited.charAt(editedIndex)) {
                sourceIndex++;
                editedIndex++;
            } else {
                if (sourceIndex == editedIndex) editedIndex++;
                else return false;
            }
        }
        return true;
    }

    /**
     * looking for at least one edit
     * @param source        input string1
     * @param edited        input string2
     * @return boolean
     */
    static boolean strHasOneEdit(String source, String edited) {
        if (source.length() == edited.length())
            return strHasOneReplace(source, edited);
        if (source.length() == edited.length() - 1)
            return strHasOneInsert(source, edited);
        if (source.length() == edited.length() + 1)
            return strHasOneInsert(edited, source);
        return false;
    }
}
