package com.gabryel.listaEstatica;

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
        return 0;
    }

    @Override
    public boolean contains(T element) {
        return false;
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
