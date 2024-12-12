package com.gabryel.execicios.exercicio3;

public class Main {

    public static void main(String[] args) {
        TabelaHash tabela = new TabelaHash(7);
        int[] keys = {5, 19, 20, 21, 4, 1, 14, 20, 5}; // E, S, T, U, D, A, N, T, E

        for (int key : keys)
            tabela.add(key);

        tabela.print();
    }
}
