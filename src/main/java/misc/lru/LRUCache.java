package misc.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {
    private final int capacity;
    private LinkedHashMap<K, V> cache;
    public LRUCache(int capacity) {
        // SC: O(capacity)
        this.capacity = capacity;
        this.cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        };
    }
    public void put(K key, V value) {
        // TC: O(1)
        cache.put(key, value);
    }
    public V get(K key) {
        // TC: O(1)
        return cache.getOrDefault(key, null);
    }
    public void display() {
        System.out.println(cache.keySet());
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> lruCache = new LRUCache<>(3);
        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        lruCache.put(3, "Three");
        lruCache.display();
        lruCache.put(4, "Four");
        lruCache.display();
    }
}
