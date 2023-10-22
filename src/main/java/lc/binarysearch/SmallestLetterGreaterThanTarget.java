package lc.binarysearch;

public class SmallestLetterGreaterThanTarget {
    // O(log n) O(1)
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = end + (start - end) / 2;

            if ( target > letters[mid] ) {
                start = mid + 1;
            } else if ( target < letters[mid]) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        SmallestLetterGreaterThanTarget sgl = new SmallestLetterGreaterThanTarget();
        char[] letters = {'a', 'c', 'x', 'b'};
        char target = 'v';
        System.out.println(sgl.nextGreatestLetter(letters, target));
    }
}
