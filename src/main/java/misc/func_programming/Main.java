package misc.func_programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("hello");
        ActionListener actionListener = (event) -> System.out.println(event.getWhen());

        // save lambda func to predicate interface
        // Predicate is @FunctionalInterface
        // with test() method and additional default methods
        // return boolean
        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(3));

        // Consumer
        // void as output parameter
        Consumer<Integer> consumer = x-> System.out.println(x);

        // Integer - input, String output parameter
        Function<Integer, String> func = x -> x.toString();

        // MyPredicate
        MyPredicate<Integer> myPredicate = x-> System.out.println(x);
        myPredicate.apply(5);

    }
}

interface MyPredicate<T> {
    void apply(T t);
}
