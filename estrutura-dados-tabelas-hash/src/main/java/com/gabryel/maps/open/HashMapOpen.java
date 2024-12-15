package com.gabryel.maps.open;

import com.gabryel.listaDinamica.LinkedList;
import com.gabryel.maps.Entry;
import com.gabryel.maps.Map;
import com.gabryel.sets.Set;
import com.gabryel.sets.open.HashSetOpen;

public class HashMapOpen<K, V> implements Map<K, V> {

    private Entry<K, V>[] table;
    private final float LOAD_FACTOR = 0.75f;
    private final int INITIAL_CAPACITY;
    private int size;

    public HashMapOpen(int initialCapacity) {
        if (initialCapacity <= 0)
            throw new IllegalArgumentException("Initial capacity should be greater than zero: " + initialCapacity);

        this.INITIAL_CAPACITY = initialCapacity;
        this.table = new Entry[this.INITIAL_CAPACITY];
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
        int checkIndex = 0;

        while (checkIndex < this.table.length) {
            if (this.table[index] != null && this.table[index].getKey().equals(key))
                return this.table[index].getValue();

            index = (index + 1) % this.table.length;
            checkIndex++;
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int index = this.getHash(key);
        int checkIndex = 0;

        while (checkIndex < this.table.length) {
            if (this.table[index] != null && this.table[index].getKey().equals(key)) {
                Entry<K, V> entry = this.table[index];
                this.table[index] = null;
                this.size--;
                return entry.getValue();
            }

            index = (index + 1) % this.table.length;
            checkIndex++;
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        int index = this.getHash(key);
        int checkIndex = 0;

        while (checkIndex < this.table.length) {
            if (this.table[index] != null && this.table[index].getKey().equals(key))
                return true;

            index = (index + 1) % this.table.length;
            checkIndex++;
        }
        return false;
    }

    @Override
    public boolean containsValue(V value) {

        for (Entry<K, V> entry : this.table) {
            if (entry != null && entry.getValue().equals(value))
                return true;
        }
        return false;
    }

    @Override
    public Set<K> keySet() {
        Set<K> keySet =  new HashSetOpen<>(this.size);
        for (Entry<K, V> entry : this.table) {
            if (entry != null)
                keySet.add(entry.getKey());
        }
        return keySet;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {

        Set<Entry<K, V>> keySet = new HashSetOpen<>(this.size);
        for (Entry<K, V> entry : this.table) {
            if (entry != null)
                keySet.add(entry);
        }
        return keySet;
    }

    @Override
    public int size() {
        return this.size;
    }

    /**
     * Returns the hash value of the given element. This hash value is used to
     * calculate the index of the element in the backing array.
     *
     * @param key the element to hash
     * @return the hash value of the given element
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
        return (float) this.size / this.table.length > this.LOAD_FACTOR;
    }

    /**
     * Resizes the backing array (table) by doubling its current length.
     * This method is called when the load factor exceeds a predefined threshold.
     * It creates a new array with double the size, rehashes all existing elements,
     * and redistributes them into the new array to maintain the properties of the hash set.
     */
    private void resizeTable() {
        Entry<K, V>[] novoArray = new Entry[this.table.length * 2];
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
        Entry<K, V> entry = new Entry<>(key, value);

        while (this.table[index] != null) {
            if (this.table[index].getKey().equals(key)) {
                this.table[index] = entry;
                this.size++;
                return this.table[index].getValue();
            }
            index = (index + 1) % this.table.length;
        }

        this.table[index] = entry;
        this.size++;

        LinkedList<K> list = new LinkedList<>();
        return this.table[index].getValue();
    }
}
