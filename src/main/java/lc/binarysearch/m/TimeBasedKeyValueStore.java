package lc.binarysearch.m;

import java.util.ArrayList;
import java.util.HashMap;

class Pair {
    int timestamp;
    String val;
    Pair(int timestamp, String val) {
        this.timestamp = timestamp;
        this.val = val;
    }
}
public class TimeBasedKeyValueStore {
    // set/get: O(1) O(log n); O(n)
    private HashMap<String, ArrayList<Pair>> hashMap;
    public TimeBasedKeyValueStore() {
        hashMap = new HashMap<>();
    }
    public void set(String key, String value, int timestamp) {
        if (hashMap.containsKey(key))
            hashMap.get(key).add(new Pair(timestamp, value));
        else {
            ArrayList<Pair> arr = new ArrayList<>();
            arr.add(new Pair(timestamp, value));
            hashMap.put(key, arr);
        }
    }
    public String get(String key, int timestamp) {
        String cand = "";
        if (hashMap.containsKey(key)) {
            ArrayList<Pair> arr = hashMap.get(key);
            int low = 0, high = arr.size() - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                int timeVal = arr.get(mid).timestamp;
                if (timeVal == timestamp)
                    return arr.get(mid).val;
                else if (timeVal < timestamp) {
                    cand = arr.get(low).val;
                    low = mid + 1;
                } else
                    high = mid - 1;
            }
        }
        return cand;
    }

    public static void main(String[] args) {
        TimeBasedKeyValueStore timeMap = new TimeBasedKeyValueStore();
        timeMap.set("foo", "bar", 1);
        System.out.println(timeMap.get("foo", 1));
        System.out.println(timeMap.get("foo", 3));
        timeMap.set("foo", "bar2", 4);
        System.out.println(timeMap.get("foo", 4));
        System.out.println(timeMap.get("foo", 5));
    }
}
