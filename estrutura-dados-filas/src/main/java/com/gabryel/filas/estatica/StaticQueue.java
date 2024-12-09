package com.gabryel.filas.estatica;

import com.gabryel.filas.Queue;

public class StaticQueue<T> implements Queue<T> {

    private T[] elements;
    private int size ;
    private final int queueSize;

    public StaticQueue(int queueSize) {
        this.queueSize = queueSize;
        this.elements = (T[]) new Object[queueSize];
        this.size = 0;
    }

    @Override
    public void enqueue(T element) {
        if (this.size >= this.queueSize)
            throw new IndexOutOfBoundsException("The Stack is already full: " + this.size);

        this.elements[this.size] = element;
        this.size++;
    }

    @Override
    public T dequeue() {
        T element = this.elements[0];
        int lastIndex = this.size - 1;

        for(int currentIndex = 0; currentIndex < this.size; currentIndex++){
            this.elements[currentIndex] = this.elements[currentIndex + 1];

            if(currentIndex + 1 == lastIndex){
                this.elements[currentIndex + 1] = null;
                break;
            }
        }
        this.size--;

        return element;
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
