package com.gabryel.exercicios.exercicio2;

public class ListaEstatica<T> {

    private T[] elementos;
    private int tamanho;
    private static final double FATOR_EXPANSAO = 1.2;

    @SuppressWarnings("unchecked")
    public ListaEstatica(int capacidadeInicial) {
        elementos = (T[]) new Object[capacidadeInicial];
        tamanho = 0;
    }

    // Adiciona um elemento à lista
    public void add(T elemento) {
        if (tamanho == elementos.length)
            expandir();

        elementos[tamanho] = elemento;
        tamanho++;
    }

    // Remove o elemento no índice especificado
    public void remove(int indice) {
        if (indice < 0 || indice >= tamanho)
            throw new IndexOutOfBoundsException();

        for (int i = indice; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    // Remove todas as ocorrências de um elemento
    public void removeAll(T elemento) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento))
                remove(i);
        }
    }

    // Troca dois elementos de posição
    public void swap(int indice1, int indice2) {
        if (indice1 < 0 || indice1 >= tamanho || indice2 < 0 || indice2 >= tamanho)
            throw new IndexOutOfBoundsException();

        T temp = elementos[indice1];
        elementos[indice1] = elementos[indice2];
        elementos[indice2] = temp;
    }

    // Retorna o tamanho da lista
    public int size() {
        return tamanho;
    }

    // Imprime os elementos da lista
    public void print() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    // Concatena duas listas
    public ListaEstatica<T> concat(ListaEstatica<T> outraLista) {
        ListaEstatica<T> novaLista = new ListaEstatica<>(tamanho + outraLista.tamanho);
        System.arraycopy(elementos, 0, novaLista.elementos, 0, tamanho);
        System.arraycopy(outraLista.elementos, 0, novaLista.elementos, tamanho, outraLista.tamanho);
        novaLista.tamanho = tamanho + outraLista.tamanho;
        return novaLista;
    }
    
    // Expande a capacidade do array
    private void expandir() {
        T[] novoArray;
        if (isDoubleInt(elementos.length * FATOR_EXPANSAO))
           novoArray = (T[]) new Object[(int) (elementos.length * FATOR_EXPANSAO)];
        else
            novoArray = (T[]) new Object[(int) Math.round((elementos.length * FATOR_EXPANSAO) + 0.5)];
        System.arraycopy(elementos, 0, novoArray, 0, tamanho);
        elementos = novoArray;
    }

    public T get(int i) {
        return elementos[i];
    }

    /**
     * Returns whether the given double is an integer, within a certain tolerance
     * range.
     *
     * @param d the double to check
     * @return whether the double is an integer
     */
    private boolean isDoubleInt(double d) {
        //select a "tolerance range" for being an integer
        double TOLERANCE = 1E-5;
        //do not use (int)d, due to weird floating point conversions!
        return Math.abs(Math.floor(d) - d) < TOLERANCE;
    }
}
