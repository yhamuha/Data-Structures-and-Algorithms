package misc.func_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArray(arr1);
        fillList(list1);

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        // using loops
        /*for(int i=0; i<10; i++) {
            arr[i] = arr[i] * 2;
            list.set(i, list.get(i) * 2);
        }*/

        // for array
        arr1 = Arrays.stream(arr1).map(a -> a*2).toArray();
        list1 = list1.stream().map(a -> a*2).collect(Collectors.toList());

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));
    }

    private static void fillList (List<Integer> list) {
        for (int i =0;i< 10; i++) list.add(i+1);
    }

    private static void fillArray (int[] arr) {
        for (int i =0;i< 10; i++) arr[i] = i+1;
    }

}
