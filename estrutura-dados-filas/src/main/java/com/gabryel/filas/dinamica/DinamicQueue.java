package com.gabryel.filas.dinamica;

import com.gabryel.filas.Queue;

public class DinamicQueue<T> implements Queue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public void enqueue(T element) {
    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

}
