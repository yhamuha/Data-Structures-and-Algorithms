package misc.a__xTraining.concurrentHashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */

// the same operation on HashMap will have ConcurrentModificationException
public class Demo {
    public static void main(String[] args) {

        Map<String, String> myMap = new ConcurrentHashMap<>();
        for(int i=0; i<5; i++) myMap.put("" + i, "" + i);
        System.out.println("myMap before iterator: " + myMap);

        Iterator<String> it = myMap.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            if (key.equals("3")) myMap.put(key + "newKey", "newValue");
        }
        System.out.println("myMap after iteration " + myMap);
    }
}
