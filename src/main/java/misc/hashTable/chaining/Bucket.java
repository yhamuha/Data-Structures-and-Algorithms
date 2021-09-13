package misc.hashTable.chaining;


/**
 * Chaining implementation method
 */
public class Bucket {

    public String key;
    public int value;
    public Bucket next;

    int[] primes = {
            5, 11, 23, 47, 97, 193, 389, 769, 1543, 3079, 12289, 24593,
            49157, 98317, 196613, 393241, 786433, 1572869, 3145739,
            6291469, 12582917, 25165843, 50331653, 100663319, 201326611,
            402653189, 805306457, 1610612741, 2147483629
    };

    // quantity of elements in hash table
    int size = 0;

    // one element from primes array
    int capacityIndex = 0;

    Bucket[] buckets = new Bucket[primes[capacityIndex]];

    Bucket(String key, int value) {
        this.key = key;
        this.value = value;
    }

    // hw #1
    int quantityOfWordRepeat (String word) {

        int quantity = 0;

        int hashCode = hashCode(word);

        // get BucketIndex
        int bucketIndex = getBucketIndex(key);
        // go into bucket with particular index
        Bucket bucket = buckets[bucketIndex];

        return -1;
    }

    // hw #2
    /*String getAllPossibleWords(int phoneButtons, ) {


        return "";
    }*/


    /**
     * hashCode
     * @param str
     * @return
     */
    int hashCode(String str) {
        int hash = 0;
        for (int i=0; i<str.length(); i++) {
            int letterCode = str.charAt(i);
            hash = (hash << 5) - hash + letterCode;
        }
        return hash;
    }

    /**
     * getBucketIndex
     * @param key
     * @return
     */
    int getBucketIndex(String key) {
        int capacity = primes[capacityIndex];
        return Math.abs(hashCode(key)) % capacity;
    }

    /**
     * loadFactorisBad
     * @return
     */
    boolean loadFactorIsBad() {
        double loadFactor = 0.75;
        int capacity = primes[capacityIndex];
        return (double) size / capacity >= loadFactor;
    }


    /**
     * addOrUpdate
     * @param key
     * @param value
     */
    void addOrUpdate(String key, int value) {
        // get BucketIndex
        int bucketIndex = getBucketIndex(key);
        // go into bucket with particular index
        Bucket bucket = buckets[bucketIndex];
        // update
        while (bucket != null) {
            if (bucket.key.equals(key)) {
                bucket.value = value;
                return;
            }
            bucket = bucket.next;
        }
        // add node to bucket
        // create new node
        Bucket newNode = new Bucket(key, value);
        newNode.next = buckets[bucketIndex];
        buckets[bucketIndex] = newNode;
        size++;
    }

    /**
     * doubleBucketsSize
     */
    void doubleBucketsSize() {
        size = 0;
        Bucket[] oldBuckets = buckets;
        // new size
        int doubledCapacity = primes[++capacityIndex];
        // new bucket
        buckets = new Bucket[doubledCapacity];
        // copy from old to new
        for (Bucket bucket : oldBuckets) {
            while (bucket != null) {
                addOrUpdate(bucket.key, bucket.value);
                bucket = bucket.next;
            }
        }
    }

    /**
     * insert node to bucket
     * @param key
     * @param value
     */
    void insert(String key, int value) {
        if (loadFactorIsBad()) doubleBucketsSize();
        addOrUpdate(key, value);
    }

    /**
     * get value by key
     * @param key
     * @return
     */
    Integer get(String key) {
        // get bucket index
        int bucketIndex = getBucketIndex(key);
        // get current bucketNode
        Bucket bucketNode = buckets[bucketIndex];
        // go through buckets and check by keys
        while (bucketNode != null) {
            if (bucketNode.key.equals(key))
                // return value
                return bucketNode.value;
            // or go to next
            bucketNode = bucketNode.next;
        }
        // or return null
        return null;
    }

    /**
     * remove
     * @param key
     */
    void remove(String key) {
        // get index of bucket
        int bucketIndex = getBucketIndex(key);
        // get bucket node
        Bucket bucketNode = buckets[bucketIndex];

        Bucket prev = null;
        while (bucketNode != null) {
            if (bucketNode.key.equals(key)) break;
            prev = bucketNode;
            bucketNode = bucketNode.next;
        }
        Bucket toDelete = bucketNode;
        if (toDelete == null) return;
        if (prev == null)
            buckets[bucketIndex] = toDelete.next;
        else
            prev.next = toDelete.next;
        size--;
    }

}
