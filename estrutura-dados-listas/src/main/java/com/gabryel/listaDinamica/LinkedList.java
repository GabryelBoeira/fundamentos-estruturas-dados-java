package com.gabryel.listaDinamica;

public class LinkedList<T> implements List<T> {

    private Node<T> head;
    private int size;


    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(T element) {
        int indexOf = -1;
        if (head == null) return indexOf;

        Node<T> aux = head;
        while (aux != null) {
            indexOf++;
            if (aux.getInfo().equals(element)) return indexOf;

            aux = aux.getNext();
        }

        return -1;
    }

    @Override
    public boolean contains(T element) {
        if (head == null) return false;

        Node<T> aux = head;

        while (aux != null) {
            if (aux.getInfo().equals(element)) return true;
            aux = aux.getNext();
        }

        return false;
    }

    @Override
    public boolean remove(T element) {
        if (head == null) return false;

        //remove o primero elemento da lista
        if (head.getInfo().equals(element)) {
            head = head.getNext();
            size--;
            return true;
        } else {
            //remove um elemento da lista
            Node<T> aux = head;
            while (aux.getNext() != null) {
                Node<T> next = aux.getNext();

                if (next.getInfo().equals(element)) {
                    aux.setNext(aux.getNext().getNext());
                    size--;
                    return true;
                }

                aux = aux.getNext();
            }
        }

        return false;
    }

    @Override
    public T get(int index) {

        if (index >= 0 && index < size) {
            int indexCounter = 0;
            Node<T> aux = head;
            while (aux != null) {
                if (indexCounter == index) return aux.getInfo();
                aux = aux.getNext();
                indexCounter++;
            }
        }

        throw new IndexOutOfBoundsException("index is out of bounds of list size: " + this.size);
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
        head = null;
        size = 0;
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
