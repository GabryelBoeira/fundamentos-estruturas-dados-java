package com.gabryel.maps.close;

import com.gabryel.listaDinamica.LinkedList;
import com.gabryel.maps.Entry;
import com.gabryel.maps.Map;
import com.gabryel.sets.Set;

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
        return null;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
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

    

}
