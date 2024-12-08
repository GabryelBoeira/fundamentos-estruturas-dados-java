package com.gabryel.exercicios.exercicio7;

public class ListaLigada {
    private Node head;

    /**
     * Mescla duas listas em ordem crescente.
     * <p>
     * A lista resultante tem os mesmos elementos das duas listas, mas em ordem crescente.
     * A lista resultante   uma lista circular.
     *
     * @param lista1 a primeira lista a ser mesclada
     * @param lista2 a segunda lista a ser mesclada
     * @return a lista resultante da mesclagem
     */
    public static ListaLigada mesclarEmOrdem(ListaLigada lista1, ListaLigada lista2) {
        ListaLigada novaLista = new ListaLigada();
        Node current1 = lista1.head;
        Node current2 = lista2.head;
        Node tail = null;

        while (current1 != null && current2 != null) {
            Node newNode;
            if (current1.data <= current2.data) {
                newNode = new Node(current1.data);
                current1 = current1.next;
            } else {
                newNode = new Node(current2.data);
                current2 = current2.next;
            }

            if (novaLista.head == null) {
                novaLista.head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }

        // Adicionar os elementos restantes de uma das listas
        while (current1 != null) {
            Node newNode = new Node(current1.data);
            tail.next = newNode;
            tail = newNode;
            current1 = current1.next;
        }

        while (current2 != null) {
            Node newNode = new Node(current2.data);
            tail.next = newNode;
            tail = newNode;
            current2 = current2.next;
        }

        // Fazer a lista circular (opcional)
        tail.next = novaLista.head;

        return novaLista;
    }

    /**
     * Compares two linked lists to determine if they are equal.
     * <p>
     * Two lists are considered equal if they contain the same elements
     * in the same order and have the same length.
     *
     * @param lista1 the first linked list to compare
     * @param lista2 the second linked list to compare
     * @return true if the lists are equal, false otherwise
     */
    public static boolean saoIguais(ListaLigada lista1, ListaLigada lista2) {
        Node current1 = lista1.head;
        Node current2 = lista2.head;

        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        // As listas só são iguais se terminarem ao mesmo tempo
        return current1 == null && current2 == null;
    }

    /**
     * Adiciona um novo elemento ao final da lista ligada.
     * <p>
     * Se a lista estiver vazia, o novo elemento se torna o cabeçalho da lista.
     * Caso contrário, o elemento é adicionado após o último elemento existente.
     *
     * @param data o valor do elemento a ser adicionado à lista
     */
    public void adicionar(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    /**
     * Imprime todos os elementos da lista em uma linha, separados por espa o,
     * e terminando com "null".
     * <p>
     * A impress o   feita na forma "elemento1 -> elemento2 -> ... -> null".
     * Se a lista estiver vazia, a impress o   "null".
     */
    public void imprimir() {
        if (head == null) {
            System.out.println("Lista vazia");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
    }

}
