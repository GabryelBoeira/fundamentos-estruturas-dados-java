package com.gabryel.exercicios.exercicio2;

public class Main {

    public static void main(String[] args) {
        ListaEstatica<Integer> lista = new ListaEstatica<>(2);

        // Adicionando elementos na lista
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        // Imprimindo todos os elementos da lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento " + i + ": " + lista.get(i));
        }
    }
}