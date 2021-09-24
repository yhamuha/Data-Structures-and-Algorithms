package misc.problem_solving;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 */
class ParenthesesSolution {

    // Hash table that takes care of the mappings.
    private HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public ParenthesesSolution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {

        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // is closing bracket ?
            if (this.mappings.containsKey(c)) {

                // check stack ang pop the top element
                char topElement = stack.empty() ? '#' : stack.pop();

                // check for matching opening and closing brackets in HashMap
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                // is opening bracket -> push to stack
                stack.push(c);
            }
        }

        // stack isEmpty (ended bracket elements) -> then return true
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ParenthesesSolution ps = new ParenthesesSolution();
        String str = "(())";
        System.out.println(ps.isValid(str));
    }
}