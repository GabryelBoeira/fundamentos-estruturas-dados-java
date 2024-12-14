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
        return null;
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


    private int getHash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    private boolean checkLoadFactor() {
        return (double) this.size / this.table.length > this.LOAD_FACTOR;
    }


}
