package com.gabryel.exercicios.exercicio2;

public class Main {

    public static void main(String[] args) {
        BinaryTreeInteger arvore1 = new BinaryTreeInteger();
        arvore1.add(5);
        arvore1.add(3);
        arvore1.add(7);
        arvore1.add(2);
        arvore1.add(4);

        BinaryTreeInteger subArvore = new BinaryTreeInteger();
        subArvore.add(3);
        subArvore.add(2);

        boolean contains = arvore1.containsSubTree(subArvore);
        System.out.println("A árvore 1 contém a subárvore? " + contains);
    }
}
