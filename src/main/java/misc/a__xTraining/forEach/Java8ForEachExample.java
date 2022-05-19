package misc.a__xTraining.forEach;

/**
 *
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;

public class Java8ForEachExample {

    public static void main(String[] args) {

//        //creating sample Collection
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) myList.add(i);

//        List<String> stringList = new ArrayList<>();
//        for(int i=0; i<10; i++) stringList.add(" string " + i);
//
//        Iterator<String> it2 = stringList.iterator();
//        while (it2.hasNext()) {
//            String s = it2.next();
//            System.out.println(s);
//        }
//
//        Iterator<Integer> it = myList.iterator();
//        while(it.hasNext()) {
//            Integer i = it.next();
//            System.out.println(i);
//        }



//        List<Integer> myList = new ArrayList<>();
//        for(int i=0; i<10; i++) myList.add(i);
//
//        Iterator<Integer> it = myList.iterator();
//        while (it.hasNext()) {
//            Integer i = it.next();
//            System.out.println("Iterator value " + i);
//        }

//        List<Integer> myList = new ArrayList<>();
//        for(int i=0; i<10; i++) myList.add(1);
//
//        Iterator<Integer> it = myList.iterator();
//        while (it.hasNext()) {
//            Integer i = it.next();
//            System.out.println("Iterator value: " + i);
//        }


//        List<Integer> myList = new ArrayList<>();
//        for(int i=0; i<10; i++) myList.add(i);

//        for(Integer elem : myList) {
//            System.out.println("simply forEach " + elem);
//        }

//        List<Integer> myList = new ArrayList<>();
//        for(int i=0; i<10; i++) myList.add(i);
//
//        Iterator<Integer> it = myList.iterator();
//        while(it.hasNext()) {
//            Integer i = it.next();
//            System.out.println(i);
//        }
//
//        for(Integer elem : myList) {
//            System.out.println("elem: " + elem);
//        }







        //traversing through forEach method of Iterable with anonymous class
        /*myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("for each anonymous class " + integer);
            }
        });*/

        //traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);

    }

}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }
}