package misc.hashTable.linearProbing;

/**
 * linear probing
 */
public class Bucket {
    // global variables
    public String key;
    public int value;

    int[] primes = {
            5, 11, 23, 47, 97, 193, 389, 769, 1543, 3079, 12289, 24593,
            49157, 98317, 196613, 393241, 786433, 1572869, 3145739,
            6291469, 12582917, 25165843, 50331653, 100663319, 201326611,
            402653189, 805306457, 1610612741, 2147483629
    };

    int size = 0;
    int capacityIndex = 0;
    Bucket[] buckets = new Bucket[primes[capacityIndex]];

    // constructor
    public Bucket(String key, int value) {
        this.key = key;
        this.value = value;
    }

    int hashCode(String str) {
        int hash = 0;
        for (int i = 0; i < str.length(); i++) {
            int letterCode = str.charAt(i);
            hash = (hash << 5) - hash + letterCode;
        }
        return hash;
    }

    int getBucketIndex(String key) {
        int capacity = primes[capacityIndex];
        return Math.abs(hashCode(key)) % capacity;
    }

    boolean loadFactorIsBad() {
        double loadFactor = 0.75;
        int capacity = primes[capacityIndex];
        return (double) size / capacity >= loadFactor;
    }

    void addOrUpdate(String key, int value) {
        int i = getBucketIndex(key);
        while (buckets[i] != null &&
                buckets[i].key != null) {
            if (buckets[i].key.equals(key)) {
                buckets[i].value = value;
                return;
            }
            i = (i + 1) % primes[capacityIndex];
        }
        buckets[i] = new Bucket(key, value);
        size++;
    }

    void doubleBucketsSize() {
        size = 0;
        Bucket[] oldBuckets = buckets;
        int doubledCapacity = primes[++capacityIndex];
        buckets = new Bucket[doubledCapacity];
        for (Bucket oldBucket : oldBuckets)
            if (oldBucket != null && oldBucket.key != null)
                addOrUpdate(oldBucket.key, oldBucket.value);
    }

    void insert(String key, int value) {
        if (loadFactorIsBad()) doubleBucketsSize();
        addOrUpdate(key, value);
    }

    int get(String key) {
        int i = getBucketIndex(key);
        while (buckets[i] != null) {
            if (buckets[i].key != null && buckets[i].key.equals(key))
                return buckets[i].value;
            i = (i + 1) % primes[capacityIndex];
        }
        // ?
        return -1 /*null*/;
    }

    

}
