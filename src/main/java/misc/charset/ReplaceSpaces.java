package misc.charset;

/**
 *  The {@code ReplaceSpaces} class 
 */
public class ReplaceSpaces {
    public static void main(String[] args) {
        String stringIncludedReplacedSymbols = "dog is a good boy            ";
        int nativeStringSize = 17;
        System.out.println(replaceSpaces(stringIncludedReplacedSymbols, nativeStringSize));
    }

    static String replaceSpaces(String stringIncludedReplacedSymbols, int nativeStringSize) {
        String resultString = "";
        for (int i = 0; i < nativeStringSize; i++) {
            if (stringIncludedReplacedSymbols.charAt(i) == 32)
                resultString += "%20";
            else
                resultString += stringIncludedReplacedSymbols.charAt(i);
        }
        return resultString;
    }
}
