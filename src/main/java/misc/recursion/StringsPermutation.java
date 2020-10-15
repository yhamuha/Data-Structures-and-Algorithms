package misc.recursion;

public class StringsPermutation {

    // ? where is output

    // driver method
    public static void main(String[] args) {
        permutations("ABCD");

    }

    static void permutations(char[] str, int startPos) {
        // base case
        if (startPos == str.length - 1) {
            System.out.println(str);
            return;
        }

        for (int i = startPos; i < str.length; i++) {
            char[] strCopy = str.clone();
            // current task
            swapChars(strCopy, startPos, i);
            // recursive task - 1 toward base case
            permutations(strCopy, startPos + 1);
        }
    }

    // swap chars function
    static void swapChars(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // wrap function
    static void permutations(String str) {
        permutations(str.toCharArray(), 0);
    }


}
