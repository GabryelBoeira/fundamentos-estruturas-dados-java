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
        Node<T> newNode = new Node<>(element);
        if (head == null)
            head = newNode;
        else {
            Node<T> aux = head;
            while (aux.getNext() != null)
                aux = aux.getNext();
            aux.setNext(newNode);
        }
        size++;
    }

    @Override
    public void clear() {
    }

    @Override
    public void print() {
        Node<T> aux = head;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
    }
}
