package com.gabryel.listaEstatica;

import java.util.stream.IntStream;

public class StaticList<T> implements List<T> {

    private T[] elements;
    private int size;
    private int listSize;

    public StaticList(int listSize) {
        this.listSize = listSize;
        this.clear();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(T element) {
        return IntStream
                .range(0, this.size)
                .filter(index -> this.elements[index].equals(element))
                .findFirst()
                .orElse(-1);
    }

    @Override
    public boolean contains(T element) {
        return this.indexOf(element) != -1;
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < this.size)
            return this.elements[index];

        throw new IndexOutOfBoundsException("index is out of bounds of list size: " + this.size);
    }

    @Override
    public void add(T element) {
        if (this.size >= this.listSize)
            throw new IndexOutOfBoundsException("The list is already full: " + this.size);

        this.elements[this.size] = element;
        this.size++;
    }

    @Override
    public void clear() {
        this.elements = (T[]) new Object[this.listSize];
        this.size = 0;
    }

    @Override
    public void print() {

    }
}
