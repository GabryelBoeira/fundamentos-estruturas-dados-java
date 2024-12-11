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

        System.out.println(tree.preOrder());
    }
}
