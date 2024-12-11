package com.gabryel.sets;

public interface Set<T> {

    /**
     * Add a value to this set.
     *
     * @param value the value to add
     */
    void add(T value);

    /**
     * Clear all elements from this set.
     */
    void clear();

    /**
     * Remove a value from this set.
     *
     * @param value the value to remove
     */
    boolean remove(T value);

    /**
     * Checks if the set contains the specified value.
     *
     * @param value the value to check for presence in the set
     * @return true if the set contains the specified value, false otherwise
     */
    boolean contains(T value);

    /**
     * Returns true if the set contains no elements, false otherwise.
     *
     * @return true if the set is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the set.
     *
     * @return the number of elements in the set
     */
    int size();

}
