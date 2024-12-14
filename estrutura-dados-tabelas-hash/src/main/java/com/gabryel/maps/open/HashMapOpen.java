package com.gabryel.maps.open;

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
        this.table = (Entry<K, V>[]) new Object[this.INITIAL_CAPACITY];
    }

    @Override
    public V put(K key, V value) {
        return null;
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

}
