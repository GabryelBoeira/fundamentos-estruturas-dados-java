package com.gabryel.listaEstatica;

public class Main {

    public static void main(String[] args) {
        StaticList<Integer> staticList = new StaticList<>(10);
        staticList.add(1);
        staticList.add(2);
        staticList.add(3);
        System.out.println("Tamanho da lista: " + staticList.size());

        System.out.println("\nGet item no Index 1: " + staticList.get(1));

        System.out.println("\nIndex of item 3: " + staticList.indexOf(3));
        System.out.println("Index of item 6: " + staticList.indexOf(6));

        System.out.println("\nContains item 3: " + staticList.contains(3));

        System.out.println("\nRemove item 3: " + staticList.remove(3));
        staticList.add(3);
        staticList.add(4);
        System.out.println("Remove item 3: " + staticList.remove(3));
        staticList.print();

    }
}
