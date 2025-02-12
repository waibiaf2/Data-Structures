
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
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }

        getOrCreateBucket(key).addLast(new Entry(key, value));

        /*int index = hash(key);

        if (entries[index] == null)
            entries[index] = new LinkedList<>();

        //var bucket = entries[index];
        var bucket = getBucket(key);
        for (var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }*/
    }

    public String get(int key) {
        var entry = getEntry(key);

        /*if(entry != null && entry.key == key)
            return entry.value;
        return null;
        */
        return (entry != null) ? entry.value : null;
    }

    //remove
    public void remove(int key) {
        var entry = getEntry(key);
        if (entry == null)
            throw new IllegalStateException("Entry does not exist...");

        getBucket(key).remove(entry);
        var bucket = getBucket(key);
    }

    //hash function
    private int hash(int key) {
        return key % entries.length;
    }

    private Entry getEntry(int key) {
        var bucket = getBucket(key);
        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key) {
                    return entry;
                }
            }
        }
        return null;
    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        var index = hash(key);

        if (entries[index] == null)
            entries[index] = new LinkedList<>();

        return entries[index];
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
