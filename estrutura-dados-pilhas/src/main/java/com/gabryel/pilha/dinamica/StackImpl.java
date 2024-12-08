package com.gabryel.pilha.dinamica;

import com.gabryel.pilha.Stack;

public class StackImpl<T> implements Stack<T> {

    private Node<T> top;

    @Override
    public T push(T element) {
        Node<T> auxNode = new Node<>(element);

        if (this.top == null)
            this.top = auxNode;
        else {
            auxNode.setNext(this.top);
            this.top = auxNode;
        }
        return this.peek();
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        if (this.isEmpty()) return null;

        return this.top.getInfo();
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
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
