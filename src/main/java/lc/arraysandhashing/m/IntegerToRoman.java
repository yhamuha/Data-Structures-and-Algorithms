package lc.arraysandhashing.m;

public class IntegerToRoman {
    // O(n) O(1)
    static String intToRoman(int num) {
        final String[] romans = new String[]
                {"M", "CM", "D", "CD", "C",
                        "XC", "L", "XL", "X",
                        "IX", "V", "IV", "I"};
        final int[] decimals = new int[]
                {1000, 900, 500, 400, 100,
                        90, 50, 40, 10,
                        9, 5, 4, 1};
        if (num > 3999 || num < 1) // abide constraints
            throw new IllegalArgumentException();
        StringBuilder roman = new StringBuilder();
        int i = 0;
        while (num > 0) {
            if (num >= decimals[i]) {
                roman.append(romans[i]);
                num -= decimals[i];
            } else
                i++;
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(8));
    }
}
