package misc.problem_solving;

/**
 *
 */
public class FinalValueAfterPerformingOperations {
    public static void main(String[] args) {
    String[] operations = {"++X","++X"};
    System.out.println(finalValueAfterOperations(operations));
    }

    // O(n), O(1)
    static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s:operations){
            if (s.equals("X++") || s.equals("++X")) x++;
            if (s.equals("X--") || s.equals("--X")) x--;
        }
        return x;
    }
}
