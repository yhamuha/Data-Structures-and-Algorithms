package cs.dynamic;

public class Permutations {

    static void permutations(String candidate, String letters) {
        if (letters.length() == 0) System.out.println(candidate);
        
        for (int i=0; i< letters.length(); i++)
            permutations(candidate + letters.charAt(i), removeIthChar(letters, i));
    }

    static String removeIthChar(String letters, int i) {
        return letters.substring(0,i) + letters.substring(i+1);
    }

    public static void main(String[] args) {
        String letters = "abc";
        String candidate = "";
        permutations(candidate, letters);
        System.out.println(candidate);
    }

}
