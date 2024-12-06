package com.gabryel.exercicios.exercicio3;

public class ListaEncadeadaCircular<T> {

    private Node<T> head;
    private int size;

    /**
     * Adds a new element to the circular linked list.
     * <p>
     * This method inserts the specified element at the end of the list.
     * If the list is empty, the new element becomes the head and points to itself,
     * establishing the circular nature of the list.
     *
     * @param data the element to be added to the list
     */
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    /**
     * Removes the first occurrence of the specified element in the list.
     *
     * @param data the element to remove
     * @throws IllegalArgumentException if the element is not found in the list
     */
    public void remove(T data) {
        if (head == null) {
            return;
        }
        Node<T> temp = head;
        Node<T> prev = null;
        do {
            if (temp.data.equals(data)) {
                if (prev == null) {
                    head = temp.next;
                } else {
                    prev.next = temp.next;
                }
                size--;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        throw new IllegalArgumentException("Elemento não encontrado na lista.");
    }

    public int size() {
        return size;
    }

    /**
     * Prints all elements in the list.
     */
    public void print() {
        if (head == null) {
            return;
        }
        Node<T> temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Intercala duas listas em uma nova lista
//    public ListaEncadeadaCircular<T> intercalar(ListaEncadeadaCircular<T> outraLista) {
//        ListaEncadeadaCircular<T> novaLista = new ListaEncadeadaCircular<>();
//        Node<T> current1 = head;
//        Node<T> current2 = outraLista.head;
//        int count = 0;
//        int combinedSize = size + outraLista.size;
//
//        while (count < combinedSize && (current1 != null || current2 != null)) {
//            if (current1 != null) {
//                novaLista.add(current1.data);
//                current1 = current1.next;
//            }
//            if (current2 != null) {
//                novaLista.add(current2.data);
//                current2 = current2.next;
//            }
//            count++;
//        }
//        return novaLista;
//    }

    /**
     * Interpola as duas listas recebidas e retorna uma nova lista encadeada circular.
     * A ordem dos elementos na lista de sa\u00edda \u00e9 alternada.
     * A lista de sa\u00edda sempre come\u00e7a com o primeiro elemento da lista atual.
     *
     * @param outraLista a lista a ser interpolada
     * @return uma nova lista encadeada circular com os elementos das duas listas interpolados
     */
    public ListaEncadeadaCircular<T> intercalar(ListaEncadeadaCircular<T> outraLista) {
        ListaEncadeadaCircular<T> novaLista = new ListaEncadeadaCircular<>();
        Node<T> current1 = head;
        Node<T> current2 = outraLista.head;
        int combinedSize = size + outraLista.size;

        for (int i = 0; i < combinedSize; i++) {
            if (i % 2 == 0) {
                novaLista.add(current1.data);
                current1 = current1.next;
            } else {
                novaLista.add(current2.data);
                current2 = current2.next;
            }
        }

        return novaLista;
    }

}
