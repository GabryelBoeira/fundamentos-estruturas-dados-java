package com.gabryel.sets.open;

import com.gabryel.sets.Set;


/**
 * A hash set implementation using open addressing.
 *
 * @param <T> the type of elements maintained by this set
 */
public class HashSetOpen<T> implements Set<T> {

    private final static float LOAD_FACTOR = 0.75f;
    private final int INITIAL_CAPACITY;
    private int size;
    private Object[] table;

    public HashSetOpen(int initialCapacity) {
        if (initialCapacity <= 0)
            throw new IllegalArgumentException("Initial capacity should be greater than zero: " + initialCapacity);

        this.INITIAL_CAPACITY = initialCapacity;
        table = new Object[this.INITIAL_CAPACITY];
    }

    @Override
    public void add(T value) {

    }

    @Override
    public void clear() {
        table = new Object[this.INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public boolean remove(T value) {
        return false;
    }

    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
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
        return (double) size / table.length > LOAD_FACTOR;
    }

}
