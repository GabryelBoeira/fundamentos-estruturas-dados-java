package com.gabryel.pilha;

public interface Stack<T> {

    /**
     * Add an element to the top of the stack.
     *
     * @param element The element to add
     */
    T push(T element);

    /**
     * Removes the element from the top of the stack and returns it.
     *
     * @return The element at the top of the stack, or null if the stack is empty.
     */
    T pop();

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return The element at the top of the stack, or null if the stack is empty.
     */
    T peek();

    /**
     * Check if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Searches for the element in the stack and returns its position.
     * <p>
     * The position is zero-based, so the top element is at position 0.
     * If the element is not found, returns -1.
     *
     * @param element The element to search for
     * @return The position of the element, or -1 if the element is not found.
     */
    int search(T element);

}
