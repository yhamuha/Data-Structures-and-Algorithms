package misc.a__xTraining.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0; i<10; i++) arr[i]=i;

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++) list.add(i);

        // map
//        arr = Arrays.stream(arr).map(a -> a*2).toArray();
//        list = list.stream().map(a -> a*2).collect(Collectors.toList());

        // filter
//        arr = Arrays.stream(arr).filter(a->a%2==0).toArray();
//        list = list.stream().filter(a->a%2==0).collect(Collectors.toList());
//        System.out.println(Arrays.toString(arr));
//        System.out.println(list);

        //reduce
        int sum1 = Arrays.stream(arr).reduce((acc,b)->acc+b).getAsInt();
        int sum2 = list.stream().reduce((acc,b)-> acc+b).get();
        System.out.println(sum1);
        System.out.println(sum2);


    }
}
