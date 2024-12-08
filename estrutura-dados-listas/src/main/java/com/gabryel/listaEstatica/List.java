package com.gabryel.listaEstatica;

public interface List<T>{

    /**
     * Returns the number of elements in the list.
     *
     * @return the size of the list
     */
    int size();

    /**
     * Returns the index of the first occurrence of the specified element in the list,
     * or -1 if the list does not contain the element.
     *
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in the list,
     *         or -1 if the list does not contain the element
     */
    int indexOf(T element);

    /**
     * Checks if the list contains the specified element.
     *
     * @param element element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    boolean contains(T element);

    /**
     * Removes the first occurrence of the specified element in the list.
     *
     * @param element the element to remove
     */
    boolean remove(T element);

    /**
     * Retrieves the element at the specified position in the list.
     *
     * @param index the position of the element to return
     * @return the element at the specified position in the list
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    T get(int index);

    /**
     * Inserts the specified element at the end of the list.
     *
     * @param element the element to add
     */
    void add(T element);

    /**
     * Removes all elements from the list, leaving it empty.
     */
    void clear();

    /**
     * Prints all elements in the list.
     */
    void print();
}
