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
        int indexToRemove = this.indexOf(element);
        if (indexToRemove == -1) return false;

        int lastIndex = this.size - 1;
        //remove o ultimo elemento da lista
        if (indexToRemove == lastIndex) {
            this.elements[indexToRemove] = null;
            this.size--;
            return true;
        }

        //remove um elemento da lista
        for (int i = indexToRemove; i < lastIndex; i++) {
            this.elements[i] = this.elements[i + 1];
            if (i + 1 == lastIndex) {
                this.elements[i + 1] = null;
                break;
            }
        }

        this.size--;
        return true;
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
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.elements[i]);
        }
    }
}
