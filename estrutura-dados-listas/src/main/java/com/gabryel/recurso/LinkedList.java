package com.gabryel.recurso;

public class LinkedList<T> implements List<T> {

    private Node<T> head;
    private int size;


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
        return null;
    }

    @Override
    public void add(T element) {
        if (head == null) {
            head = new Node<>(element);
            size++;
        }
    }

    @Override
    public void clear() {

    }
}
