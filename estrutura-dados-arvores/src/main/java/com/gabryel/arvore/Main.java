package com.gabryel.arvore;

public class Main {

    public static void main(String[] args) {
        Tree<Integer> tree = new BinaryTree<>();
        tree.add(14);
        tree.add(10);
        tree.add(4);
        tree.add(2);
        tree.add(-41);
        tree.add(6);
        tree.add(3);
        tree.add(20);
        tree.add(30);

        System.out.println("Quantidade de elementos da arvore: " + tree.size());
        System.out.println("Removendo o elemento -41: " + tree.remove(tree.search(14), -41).getInfo());
        System.out.println("Quantidade de elementos da arvore:" + tree.size());

        System.out.println("\nExibindo elemento da arvore: " + tree.search(14).getInfo());

        System.out.println("\nExibindo a arvore em Pre Order : " + tree.preOrder());
        System.out.println("Exibindo a arvore em In Order : " + tree.inOrder());
        System.out.println("Exibindo a arvore em Post Order : " + tree.postOrder());

        System.out.println("\nExibindo a profundidade do elemento 14: " + tree.nodeDepth(14));
        System.out.println("Exibindo a profundidade do elemento 30: " + tree.nodeDepth(30));

    }
}
