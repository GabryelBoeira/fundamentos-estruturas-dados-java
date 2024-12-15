package com.gabryel.maps.close;

import com.gabryel.listaDinamica.LinkedList;
import com.gabryel.maps.Entry;
import com.gabryel.maps.Map;
import com.gabryel.sets.Set;
import com.gabryel.sets.open.HashSetOpen;

import java.util.Arrays;

public class HashMapClose<K, V> implements Map<K, V> {

    private final int DEFAULT_CAPACITY = 8;
    private final float LOAD_FACTOR = 0.75f;
    private LinkedList<Entry<K, V>>[] table;
    private int size;

    public HashMapClose() {
        this.initializeTable(DEFAULT_CAPACITY);
    }

    @Override
    public V put(K key, V value) {
        if (this.isLoadFactorExceeded())
            this.resizeTable();

        return this.addOrUpdateToTable(key, value);
    }

    @Override
    public V get(K key) {
        int index = this.getHash(key);

        return Arrays.stream(this.table[index].toArray(Entry.class))
                .filter(entry -> entry.getKey().equals(key))
                .findFirst()
                .map(Entry::getValue)
                .orElse(null);
    }

    @Override
    public V remove(K key) {
        int index = this.getHash(key);

        for (Entry<K, V> entry : this.table[index].toArray(Entry.class)) {
            if (entry != null && entry.getKey().equals(key)) {
                this.table[index].remove(entry);
                this.size--;
                return entry.getValue();
            }

        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        int index = this.getHash(key);

        return Arrays.stream(this.table[index].toArray(Entry.class))
                .anyMatch(entry -> entry.getKey().equals(key));
    }

    @Override
    public boolean containsValue(V value) {
        for (LinkedList<Entry<K, V>> element : this.table) {
            for (Entry<K, V> entry : element.toArray(Entry.class)) {
                if (entry != null && entry.getValue().equals(value))
                    return true;
            }
        }
        return false;
    }

    @Override
    public Set<K> keySet() {
        Set<K> keySet =  new HashSetOpen<>(this.size);

        for (LinkedList<Entry<K, V>> element : this.table) {
            for (Entry<K, V> entry : element.toArray(Entry.class)) {
                if (entry != null)
                    keySet.add(entry.getKey());
            }
        }
        return keySet;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entrySet =  new HashSetOpen<>(this.size);

        for (LinkedList<Entry<K, V>> element : this.table) {
            for (Entry<K, V> entry : element.toArray(Entry.class)) {
                if (entry != null)
                    entrySet.add(entry);
            }
        }
        return entrySet;
    }

    @Override
    public int size() {
        return this.size;
    }

    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return the number of key-value mappings in this map
     */
    private void initializeTable(int initialCapacity) {
        if (initialCapacity <= 0)
            throw new IllegalArgumentException("Initial capacity should be greater than zero: " + initialCapacity);

        this.table = new LinkedList[this.DEFAULT_CAPACITY];
        size = 0;

        for (int i = 0; i < this.table.length; i++) {
            this.table[i] = new LinkedList<>();
        }
    }

    /**
     * Computes the hash value for the given key.
     * This method is used to determine the index at which the key-value pair
     * will be stored in the table array.
     *
     * @param key the key whose hash value needs to be computed
     * @return the hash value of the key
     */
    private int getHash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    /**
     * Checks if the current load factor exceeds the predefined threshold.
     * This method calculates the load factor by dividing the number of elements
     * in the set (size) by the current length of the backing array (table).
     * It then compares this value to a predefined LOAD_FACTOR to determine if
     * the load factor has been exceeded.
     *
     * @return true if the load factor is exceeded, false otherwise
     */
    private boolean isLoadFactorExceeded() {
        return (double) this.size / this.table.length > this.LOAD_FACTOR;
    }

    /**
     * Resizes the backing array (table) by doubling its current length.
     * This method is called when the load factor exceeds a predefined threshold.
     * It creates a new array with double the size, rehashes all existing elements,
     * and redistributes them into the new array to maintain the properties of the hash set.
     */
    private void resizeTable() {
        LinkedList<Entry<K, V>>[] novoArray = new LinkedList[this.table.length * 2];
        System.arraycopy(this.table, 0, novoArray, 0, this.size);
        this.table = novoArray;
    }

    /**
     * Adds or updates an element in the hash table.
     *
     * @param key   the key of the element to add or update
     * @param value the value of the element to add or update
     * @return the value of the element that was added or updated
     */
    private V addOrUpdateToTable(K key, V value) {
        int index = this.getHash(key);

        Entry<K, V> newEntry = new Entry<>(key, value);
        LinkedList<Entry<K, V>> list = this.table[index];

        if (list.contains(newEntry))
            list.remove(newEntry);
        else
            this.size++;

        list.add(newEntry);

        return value;
    }

}
