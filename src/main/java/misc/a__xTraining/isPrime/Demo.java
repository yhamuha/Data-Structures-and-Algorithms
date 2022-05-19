package misc.a__xTraining.isPrime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        int number = 7;
        // System.out.println(isPrime(number));
        // System.out.println(isPrimeDeclarative(number));
        // System.out.println(isPrimeMoreReadability(number));

         List<Integer> numbers = new ArrayList<>();
         numbers.add(2);
         numbers.add(4);
         numbers.add(6);
         numbers.add(8);
         numbers.add(10);
         // Predicate<Integer> moreThanFive = i -> i > 5;
         // System.out.println(sumWithCondition(numbers, i -> i > 5));

        System.out.println(findSquareOfMaxOdd(numbers));
    }

    // Prime numbers are divisible only by the number 1 or itself
    /*static boolean isPrime (int number) {
        if (number < 2) return false;
        for (int i=2; i<number; i++) {
            if (number % i ==0) return false;
        }
        return true;
    }*/

    //Declarative approach
    /*private static boolean isPrimeDeclarative(int number) {
        return number > 1
                && IntStream.range(2, number).noneMatch(
                index -> number % index == 0);
    }*/

    // More readability
    /*private static boolean isPrimeMoreReadability(int number) {
        IntPredicate isDivisible = index -> number % index == 0;

        return number > 1
                && IntStream.range(2, number).noneMatch(
                isDivisible);
    }*/

    /*private static boolean isPrimeMoreReadability (int number) {
        IntPredicate isDivisible = index -> number % index == 0;

        return number > 1 && IntStream.range(2, number).noneMatch(isDivisible);
    }*/

    // Passing Behaviors into methods
    /*public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.parallelStream()
                .filter(predicate)
                .mapToInt(i -> i)
                .sum();
    }*/


    public static int findSquareOfMaxOdd(List<Integer> numbers) {
        return numbers.stream()
                .filter(Demo::isOdd) 		//Predicate is functional interface and
                .filter(Demo::isGreaterThan3)	// we are using lambdas to initialize it
                .filter(Demo::isLessThan11)	// rather than anonymous inner classes
                .max(Comparator.naturalOrder())
                .map(i -> i * i)
                .get();
    }

    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static boolean isGreaterThan3(int i){
        return i > 3;
    }

    public static boolean isLessThan11(int i){
        return i < 11;
    }
}
