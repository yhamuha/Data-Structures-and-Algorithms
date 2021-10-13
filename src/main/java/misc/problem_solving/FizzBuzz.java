package misc.problem_solving;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class FizzBuzz {

    public static void main(String[] args) {
//        {
//            assert fizzBuzz(1) == "1" :
//                    "1 produces 1.";
//            assert fizzBuzz(2) == "2" :
//                    "2 produces 2.";
//            assert fizzBuzz(3) == "Fizz" :
//                    "3 produces Fizz.";
//            assert fizzBuzz(5) == "Buzz" :
//                    "5 produces Buzz";
//            assert fizzBuzz(9) == "Fizz" :
//                    "9 produces Fizz";
//            assert fizzBuzz(15) == "FizzBuzz" :
//                    "15 produces FizzBuzz";
//            System.out.println("Passed all test cases");
//        }
        int i = 15;
        System.out.println(fizzBuzz3(i));

    }

    // O(N), O(1)
    static List<String> fizzBuzz(int i) {

        List<String> list = new ArrayList<>();

        if (i % 3 == 0 && i % 5 == 0) {
            list.add("FizzBuzz");
        } else if (i % 3 == 0) {
            list.add("Fizz");
        } else if (i % 5 == 0) {
            list.add("Buzz");
        } else {
            list.add(new String(String.valueOf(i)));
        }

        return list;
    }

    public static String fizzBuzz2(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(i);
        }
    }

    // O(N) O(1)
    static List<String> fizzBuzz3(int n) {

        // ans list
        List<String> ans = new ArrayList<String>();

        for (int num = 1; num <= n; num++) {

            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            if (divisibleBy3 && divisibleBy5) {
                // Divides by both 3 and 5, add FizzBuzz
                ans.add("FizzBuzz");
            } else if (divisibleBy3) {
                // Divides by 3, add Fizz
                ans.add("Fizz");
            } else if (divisibleBy5) {
                // Divides by 5, add Buzz
                ans.add("Buzz");
            } else {
                // Not divisible by 3 or 5, add the number
                ans.add(Integer.toString(num));
            }
        }

        return ans;
    }

}
