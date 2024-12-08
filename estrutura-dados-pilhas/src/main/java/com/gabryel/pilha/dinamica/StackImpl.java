package com.gabryel.pilha.dinamica;

import com.gabryel.pilha.Stack;

public class StackImpl<T> implements Stack<T> {

    Node<T> top;
    
    @Override
    public T push(T element) {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        if (this.isEmpty()) return null;

        return top.getInfo();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int search(T element) {
        return 0;
    }
}
