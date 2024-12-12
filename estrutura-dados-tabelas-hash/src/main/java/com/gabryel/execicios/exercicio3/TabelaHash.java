package com.gabryel.execicios.exercicio3;

public class TabelaHash {

    private int[] table;
    private int size;
    private int element;
    private final float LOAD_FACTOR = 0.75f;

    public TabelaHash(int size) {
        this.table = new int[size];
        this.size = size;
        this.element = 0;
    }

    /**
     * Adiciona um elemento `chave` na tabela hash.
     *
     * <p>Esse metodo adiciona um elemento `chave` na tabela hash. Caso o elemento
     * j  esteja na tabela, o elemento n o   adicionado. Caso o elemento n o esteja
     * na tabela, o elemento   adicionado na primeira posicao dispon vel.</p>
     *
     * @param chave o elemento a ser adicionado na tabela hash.
     * @see #print()
     */
    public void add(int chave) {
        if (element / (double) size >= LOAD_FACTOR)
            redimensionar();

        int indice = chave % size;
        while (table[indice] != 0) {
            indice = (indice + 1) % size;
        }

        table[indice] = chave;
        element++;
    }

    /**
     * Imprime todos os elementos da tabela hash na saida padrao.
     * Essa metodo imprime todos os elementos da tabela hash na saida padrao, mostrando
     * a posicao e o valor armazenado naquela posicao.
     *
     * @see #add(int)
     */
    public void print() {
        for (int i = 0; i < size; i++)
            System.out.println("Posição " + i + ": " + table[i]);
    }

    private void redimensionar() {
        int novoTamanho = size * 2;
        int[] novaTabela = new int[novoTamanho];

        for (int i = 0; i < size; i++) {
            if (table[i] != 0) {
                int novaPosicao = table[i] % novoTamanho;
                while (novaTabela[novaPosicao] != 0) {
                    novaPosicao = (novaPosicao + 1) % novoTamanho;
                }
                novaTabela[novaPosicao] = table[i];
            }
        }

        table = novaTabela;
        size = novoTamanho;
    }

}
