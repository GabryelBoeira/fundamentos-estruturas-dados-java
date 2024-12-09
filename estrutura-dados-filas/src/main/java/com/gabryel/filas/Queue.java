package com.gabryel.filas;

public interface Queue<T> {

    /**
     * Adds an element to the end of the queue.
     *
     * @param element The element to be added to the queue.
     */
    void enqueue(T element);

    /**
     * Removes the element at the front of the queue and returns it.
     *
     * @return The element at the front of the queue, or null if the queue is empty.
     */
    T dequeue();

    int size();

}
