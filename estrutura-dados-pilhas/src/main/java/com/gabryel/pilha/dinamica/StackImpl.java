package com.gabryel.pilha.dinamica;

import com.gabryel.pilha.Stack;

public class StackImpl<T> implements Stack<T> {

    private Node<T> top;

    @Override
    public T push(T element) {
        Node<T> auxNode = new Node<>(element);

        if (this.top != null)
            auxNode.setNext(this.top);

        this.top = auxNode;
        return this.peek();
    }

    @Override
    public T pop() {
        this.isEmpty();

        T info = this.top.getInfo();
        this.top = this.top.getNext();
        return info;
    }

    @Override
    public T peek() {
        return this.isEmpty() ? null : this.top.getInfo();
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

    @Override
    public int search(T element) {
        int indexOf = -1;
        Node<T> auxNode = this.top;

        while (auxNode != null) {
            indexOf++;
            if (auxNode.getInfo().equals(element))
                return indexOf;
            auxNode = auxNode.getNext();
        }

        return indexOf;
    }
}
