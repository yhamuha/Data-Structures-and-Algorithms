package misc.a__xTraining.LongestValidParentheses;

import java.util.Stack;

/**
 *
 */
class Solution {

    // +/- solution
//    public static int longestValidParentheses(String S) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(-1);
//        int ans = 0;
//        for (int i = 0; i < S.length(); i++)
//            if (S.charAt(i) == '(' || S.charAt(i) == '{' ) stack.push(i);
//            else {
//                stack.pop();
//                if (stack.isEmpty()) stack.push(i);
//                else ans = Math.max(ans, i - stack.peek());
//            }
//        return ans;
//    }


//    public static void valid_paren(String input_str) {
//        // Declaring a stack
//        Stack<Character> s = new Stack<Character>();
//        // Iterating over the entire string.
//        for (char st : input_str.toCharArray()) {
//            //  If the input string contains an opening parenthesis,
//            //  push in on to the stack.
//            if (st == '(' || st == '{' || st == '[') {
//                s.push(st);
//            } else {
//                // In the case of valid parentheses, the stack cannot be
//                // be empty if a closing parenthesis is encountered.
//                if(s.empty()) {
//                    System.out.println(input_str +
//                            " contains invalid parentheses.");
//                    return;
//                }
//                else{
//                    // If the input string contains a closing bracket,
//                    // then pop the corresponding opening parenthesis if
//                    // present.
//                    char top = (Character) s.peek();
//                    if(st == ')' && top == '(' ||
//                            st == '}' && top == '{' ||
//                            st == ']' && top == '['){
//                        s.pop();
//                    }
//                    else{
//                        System.out.println(input_str +
//                                " contains invalid parentheses.");
//                        return;
//                    }
//                }
//            }
//        }
//        //  Checking the status of the stack to determine the
//        //  validity of the string.
//        if(s.empty()) {
//            System.out.println(input_str +
//                    " contains valid parentheses.");
//        }
//        else{
//            System.out.println(input_str +
//                    " contains invalid parentheses.");
//        }
//    }


    // driver method
    public static void main(String[] args) {
//        System.out.println(longestValidParentheses("()()()(){}{}"));
//        System.out.println(longestValidParentheses("({{}[{}{}())"));

        System.out.println(isValidParentheses("{()}"));


    }

//    static boolean isValidParentheses (String str) {
//
//        Stack<Character> stack = new Stack<>();
//
//        for (char ch: str.toCharArray()) {
//            if (ch == '(' || ch=='{' || ch=='[') {
//                stack.push(ch);
//            } else {
//                if (stack.empty()) return false;
//                 else {
//                     char top = (Character) stack.peek();
//                        if( ch == ')' && top == '(' ||
//                            ch == '}' && top == '{' ||
//                            ch == ']' && top == '[') {
//                        stack.pop();
//                        } else {
//                            return false;
//                        }
//                }
//            }
//        }
//
//        if (stack.isEmpty()) {
//            return true;
//        } else { return false;}
//
//    }

    static boolean isValidParentheses(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.empty()) return false;

                else {
                    char top = (Character) stack.peek();
                    if (ch == ')' && top == '(' ||
                            ch == '}' && top == '{' ||
                            ch == ']' && top == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }

    }
}