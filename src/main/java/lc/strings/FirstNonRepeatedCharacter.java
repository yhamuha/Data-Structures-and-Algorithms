package lc.strings;

/*
    single traversal approach
 */
public class FirstNonRepeatedCharacter {

    // 8 bit ASCII
    private static final int EXTENDED_ASCII_CODES = 256;

    static public char firstNonRepeatedCharacter(String str) {
        int[] flags = new int[EXTENDED_ASCII_CODES];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }
        int position = Integer.MAX_VALUE;
        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }
        return position == Integer.MAX_VALUE ?
                Character.MIN_VALUE : str.charAt(position);
    }

    public static void main(String[] args) {
        String str = "athxiathx";
        System.out.println(firstNonRepeatedCharacter(str));
        System.out.println(Character.MIN_VALUE);
    }
}
