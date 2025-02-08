package linear.hasmap_hashset;

import java.util.LinkedList;

public class HashTable {
    /****************** INSTRUCTIONS **************************************************
     * =================================================================================
     * Implement a has Hashtable from scratch, handle collisions with chaining strategy
     * - put(k,v)
     * - get(k): v
     * - remove(k)
     * k: int
     * v: string
     * collisions -> chaining strategy.
     ====================================================================================
     * **********************************************************************************/

    LinkedList<Entry>[] entries = new LinkedList[5];

    /**
     * PUT METHOD
     * - Handle collisions with chaining strategy
     * - If the key already exists, update the value
     * - If the key does not exist, add the key-value pair
     */


    public void put(int key, String value) {
        int index = hash(key);

        if (entries[index] == null)
            entries[index] = new LinkedList<>();

        var bucket = entries[index];
        for (var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        bucket.addLast(new Entry(key, value));
    }

    public String get(int key) {
        var index = hash(key);
        var bucket = entries[index];

        if (bucket != null) {
            for (var entry : bucket)
                if (entry.key == key)
                    return entry.value;
        }

        return null;
    }

    //remove
    public void remove(int key) {
        var index = hash(key);
        var bucket = entries[index];

        if(bucket == null)
            throw new IllegalStateException("Bucket is does not exist");

        for (var entry : bucket) {
            if (entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }

        throw new IllegalStateException("Entry does not exist in the bucket");
    }

    //hash function
    public int hash(int key) {
        return key % entries.length;
    }

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
