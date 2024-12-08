package com.gabryel.pilha.estatica;

import com.gabryel.pilha.Stack;

public class StaticStack<T> implements Stack<T> {

    private T[] elements;
    private int size = 0;
    private final int stackSize;

    public StaticStack(int size) {
        this.stackSize = size;
        this.elements = (T[]) new Object[size];
    }

    @Override
    public T push(T element) {
        if (this.size >= this.stackSize)
            throw new IndexOutOfBoundsException("The Stack is already full: " + this.size);

        this.elements[this.size] = element;
        this.size++;

        return this.peek();
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return isEmpty() ? null : this.elements[this.size - 1];
    }

    @Override
    public boolean isEmpty() {
        return this.elements.length == 0;
    }

    @Override
    public int search(T element) {
         for (int i = 0; i < this.size; i++) {
             if (this.elements[i].equals(element))
                 return i;
         }

         return -1;
    }

}
