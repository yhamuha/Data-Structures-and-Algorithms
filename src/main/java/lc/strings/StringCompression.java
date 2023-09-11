package lc.strings;

public class StringCompression {
        public static String compress(String s){
            String out = "";
            int sum = 1;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i+1)) {
                    sum++;
                } else {
                    out = out + s.charAt(i) + sum;
                    sum = 1;
                }
            }
            out = out + s.charAt(s.length() - 1) + sum;
            return out.length() < s.length() ? out : s;
        }

        public static void main(String[] args) {
            System.out.println(compress("a"));
            System.out.println(compress("aaa"));
            System.out.println(compress("aaabbb"));
            System.out.println(compress("aaabccc"));
        }
    }
