package misc.charset;

/**
 *  The {@code ReplaceSpacesEffective} class represents
 *  insertion '%20' instead spaces
 */
public class ReplaceSpacesEffective {

    /**
     * Main method.
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args) {
        System.out.println(replaceSpaceWrapper("This is the      ", 11));
    }

    static void replaceSpaces(char[] strAsArr, int trueLength) {
        int tailLetterIndex = strAsArr.length;
        for (int i = trueLength - 1; i != 0; i--) {
            int phraseLetterIndex = i;
            if (strAsArr[phraseLetterIndex] != ' ') {
                strAsArr[tailLetterIndex - 1] = strAsArr[phraseLetterIndex];
                tailLetterIndex--;
            } else {
                strAsArr[tailLetterIndex - 1] = '0';
                strAsArr[tailLetterIndex - 2] = '2';
                strAsArr[tailLetterIndex - 3] = '%';
                tailLetterIndex -= 3;
            }
        }
    }

    /**
     * wrapper for replace spaces
     * @param str           inpt String
     * @param trueLength    quantity of chars including spaces
     * @return String
     */
    static String replaceSpaceWrapper (String str, int trueLength) {
        char[] strAsArr = str.toCharArray();
        replaceSpaces(strAsArr, trueLength);
        return new String(strAsArr);
    }


}

