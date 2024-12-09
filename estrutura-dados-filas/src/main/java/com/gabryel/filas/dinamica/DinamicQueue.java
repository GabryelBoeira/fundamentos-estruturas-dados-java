package com.gabryel.filas.dinamica;

import com.gabryel.filas.Queue;

import java.util.NoSuchElementException;

public class DinamicQueue<T> implements Queue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public void enqueue(T element) {
        Node<T> auxNode = new Node<>(element);

        if (this.head == null)
            this.head = auxNode;
        else
            this.tail.setNext(auxNode);

        this.tail = auxNode;
        this.size++;
    }

    @Override
    public T dequeue() {
        if (this.head == null) return null;

        T info = this.head.getInfo();
        this.head = this.head.getNext();
        this.size--;

        if (this.size == 0) this.tail = null;

        return info;
    }

    @Override
    public T peek() {
        if (this.head == null) return null;

        return this.head.getInfo();
    }

    @Override
    public int size() {
        return size;
    }

}
