package lc.arraysandhashing;

public class IntToRoman {

    public String intToRoman(int num) {
        final String[] numerals = new String[]
                {   "M",    "CM",   "D",    "CD",   "C",
                        "XC",   "L",    "XL",   "X",
                        "IX",   "V",    "IV",   "I"};
        final int[] values = new int[]
                {   1000, 900,  500,  400,  100,
                        90,   50,    40,   10,
                        9,    5,    4,   1};


        if (num > 3999 || num < 1) throw new IllegalArgumentException();

        StringBuilder numeral = new StringBuilder();
        int i =0;
        while (num > 0) {
            if (num >= values[i]) {
                numeral.append(numerals[i]);
                num -= values[i];
            } else {
                i++;
            }
        }
        return numeral.toString();

    }

    public static void main(String[] args) {
        IntToRoman itr = new IntToRoman();
        System.out.println(itr.intToRoman(8));
    }
}
