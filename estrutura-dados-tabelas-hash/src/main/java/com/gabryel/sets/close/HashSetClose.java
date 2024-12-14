package com.gabryel.sets.close;

import com.gabryel.sets.Set;

import java.util.LinkedList;

public class HashSetClose<T> implements Set<T> {

    private final int DEFAULT_CAPACITY = 5;
    private final float LOAD_FACTOR = 0.75f;
    private LinkedList<T>[] table;
    private int size;

    public HashSetClose() {
        this.clear();
    }

    @Override
    public void add(T value) {
        if (this.contains(value))
            return;

        if (isLoadFactorExceeded())
            this.resizeTable();

        this.addToTable(value);
    }

    @Override
    public void clear() {
        this.table = new LinkedList[this.DEFAULT_CAPACITY];
        for (int i = 0; i < this.table.length; i++) {
            this.table[i] = new LinkedList<>();
        }
        this.size = 0;
    }

    @Override
    public boolean remove(T value) {
        int index = this.getHash(value);

        if (this.table[index] == null || !this.table[index].contains(value))
            return false;

        table[index].remove(value);
        this.size--;
        return true;
    }

    @Override
    public boolean contains(T value) {
        int index = this.getHash(value);
        LinkedList<T> element = this.table[index];

        if (element == null)
            return false;

        return element.contains(value);
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

    /**
     * Returns the hash value of the given element. This hash value is used to
     * calculate the index of the element in the backing array.
     *
     * @param element the element to hash
     * @return the hash value of the given element
     */
    private int getHash(T element) {
        return Math.abs(element.hashCode()) % table.length;
    }

    private void addToTable(T value) {
        int index = this.getHash(value);
        if (this.table[index] == null)
            this.table[index] = new LinkedList<>();

        this.table[index].add(value);
        this.size++;
    }

    /**
     * Resizes the backing array (table) by doubling its current length.
     * This method is called when the load factor exceeds a predefined threshold.
     * It creates a new array with double the size, rehashes all existing elements,
     * and redistributes them into the new array to maintain the properties of the hash set.
     */
    private void resizeTable() {
        Object[] oldTable = this.table;
        this.table = new LinkedList[this.table.length * 2];
        this.size = 0;

        for (Object entry : oldTable) {
            if (entry == null) continue;

            LinkedList<T> element = (LinkedList<T>) entry;
            for (T value : element) this.addToTable(value);
        }
    }
}
