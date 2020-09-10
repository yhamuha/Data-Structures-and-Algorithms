package misc;

import java.util.ArrayList;
import java.util.LinkedList;

public class ShuffleArrayWithKeepTheOrder {

    void weaveLists(LinkedList<Integer> first, LinkedList<Integer> second,
                    LinkedList<Integer> merged, ArrayList<LinkedList<Integer>> result) {

        if (first.isEmpty() || second.isEmpty()) {
            LinkedList<Integer> mergedCopy = (LinkedList<Integer>) merged.clone();
            mergedCopy.addAll(first);
            mergedCopy.addAll(second);
            result.add(mergedCopy);
            return;
        }

        // for first list
        int num = first.removeFirst();                  // dell node from first
        merged.addLast(num);                            // merge with answer
        weaveLists(first, second, merged, result);      // build next recursively
        first.addFirst(num);                            // return deleted node
        merged.removeLast();                            // remove from answer

        // for second list
        num = second.removeFirst();
        merged.addLast(num);
        weaveLists(first, second, merged, result);
        merged.removeLast();
        second.addFirst(num);
    }
}
