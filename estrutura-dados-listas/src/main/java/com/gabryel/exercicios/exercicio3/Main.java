package com.gabryel.exercicios.exercicio3;

public class Main {

    public static void main(String[] args) {
        ListaEncadeadaCircular<Integer> list = new ListaEncadeadaCircular<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(3);
        list.print();
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println();

        ListaEncadeadaCircular<Integer> lista1 = new ListaEncadeadaCircular<>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);
        lista1.add(458);

        ListaEncadeadaCircular<Integer> lista2 = new ListaEncadeadaCircular<>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        lista2.add(60);

        ListaEncadeadaCircular<Integer> lista3 = lista1.intercalar(lista2);
        lista3.print();
    }

}
