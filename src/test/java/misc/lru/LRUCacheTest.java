package misc.lru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {
    @Test
    public void testLRUCache() {
        LRUCache<Integer, String> lruCache = new LRUCache<>(2);
        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        assertEquals("One", lruCache.get(1));
        assertEquals("Two", lruCache.get(2));
        lruCache.put(3, "Three");
        assertEquals(null, lruCache.get(1));
        assertEquals("Two", lruCache.get(2));
        assertEquals("Three", lruCache.get(3));
    }
}