package com.gabryel.exercicios.exercicio9;

public class ListaEncadeadaCircular {
    private Node head;

    /**
     * Retorna o n mero de elementos na lista encadeada circular.
     *
     * @return o n mero de elementos na lista
     */
    public int contarElementos() {
        if (head == null) {
            return 0;
        }

        Node current = head;
        int count = 1;
        while (current.getNext() != head) {
            current = current.getNext();
            count++;
        }
        return count;
    }

    /**
     * Insere um novo elemento na lista encadeada circular na posi o inicial.
     * <p>
     * Caso a lista esteja vazia, o novo elemento se tornar o nico elemento da lista.
     * <p>
     * @param data o valor a ser adicionado na lista
     */
    public void inserirInicio(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = newNode;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * Concatena outra lista encadeada circular a esta lista.
     * <p>
     * Este método adiciona todos os elementos da outra lista ao final desta lista.
     * Se a outra lista estiver vazia, não será feita nenhuma alteração.
     *
     * @param outraLista a lista encadeada circular a ser concatenada
     */
    public void concatenar(ListaEncadeadaCircular outraLista) {
        if (outraLista.head == null) return;

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = outraLista.head;
    }

    /**
     * Interpola as duas listas recebidas e as coloca em ordem crescente.
     * <p>
     * A ordem dos elementos na lista de sa da  alternada.
     * A lista de sa da sempre come a com o primeiro elemento da lista atual.
     *
     * @param outraLista a lista a ser interpolada
     */
    public void intercalar(ListaEncadeadaCircular outraLista) {
        if (outraLista.head == null) return;

        Node current1 = head;
        Node current2 = outraLista.head;
        Node temp = null;

        while (current1 != head || current2 != head) {
            if (current1.data <= current2.data) {
                temp = current1;
                current1 = current1.next;
            } else {
                Node next2 = current2.next;
                current2.next = temp.next;
                temp.next = current2;
                current2 = next2;
            }
        }
    }

    /**
     * Retorna uma c pia desta lista.
     * <p>
     * Se a lista estiver vazia, a lista retornada tamb m estar  vazia.
     *
     * @return uma c pia desta lista
     */
    public ListaEncadeadaCircular copiar() {
        ListaEncadeadaCircular novaLista = new ListaEncadeadaCircular();
        if (head == null) {
            return novaLista;
        }

        Node current = head;
        novaLista.head = new Node(current.data);
        Node novaCurrent = novaLista.head;

        current = current.next;
        while (current != head) {
            novaCurrent.next = new Node(current.data);
            novaCurrent = novaCurrent.next;
            current = current.next;
        }
        novaCurrent.next = novaLista.head;
        return novaLista;
    }

    /**
     * Imprime todos os elementos da lista em uma linha, separados por espa o,
     * e terminando com "null".
     * <p>
     * A impress o   feita na forma "elemento1 -> elemento2 -> ... -> null".
     * Se a lista estiver vazia, a impress o   "null".
     */
    public void imprimir() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
