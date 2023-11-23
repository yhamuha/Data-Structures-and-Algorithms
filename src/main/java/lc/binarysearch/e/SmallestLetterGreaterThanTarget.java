package lc.binarysearch.e;

public class SmallestLetterGreaterThanTarget {
    // O(log n) O(1)
    public char nextGreatestLetter(char[] letters, char target) {
        /*int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ( target > letters[mid] ) {
                start = mid + 1;
            } else if ( target < letters[mid]) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];*/
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right-left)/2;
            if (target > letters[mid])
                left = mid + 1;
            else if (target < letters[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return letters[left % letters.length];
    }
    public static void main(String[] args) {
        SmallestLetterGreaterThanTarget sgl = new SmallestLetterGreaterThanTarget();
        char[] letters = {'x', 'x', 'y','y'};
        char target = 'z';
        System.out.println(sgl.nextGreatestLetter(letters, target));
    }
}
