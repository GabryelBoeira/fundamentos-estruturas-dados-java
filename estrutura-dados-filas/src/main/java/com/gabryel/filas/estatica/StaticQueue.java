package com.gabryel.filas.estatica;

import com.gabryel.filas.Queue;

public class StaticQueue<T> implements Queue<T> {

    private T[] elements;
    private int size;
    private final int queueSize;

    public StaticQueue(int queueSize) {
        this.queueSize = queueSize;
        this.elements = (T[]) new Object[queueSize];
        this.size = 0;
    }

    @Override
    public void enqueue(T element) {

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T peek() {
        return this.elements[0];
    }

    @Override
    public int size() {
        return size;
    }
}
