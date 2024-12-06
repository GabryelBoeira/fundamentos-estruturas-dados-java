package com.gabryel;

import com.gabryel.recurso.LinkedList;
import com.gabryel.recurso.List;

public class Main {

    public static void main(String[] args) {
        //Lista encadeada personalizada
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Verficando lista inicial: ");
        System.out.println(list.size());
        list.print();

        System.out.println("\nVerificando se exite um elemento igual na lista: ");
        System.out.println("Verificando Elemento 30: existe? " + list.contains(30));
        System.out.println("Verificando Elemento 1000: existe? " + list.contains(1000));

        System.out.println("\nPegar o indice de um elemento na lista: ");
        System.out.println("Indice do elemento 30: " + list.indexOf(30));
        System.out.println("Indice do elemento 30: " + list.indexOf(255));

        try {
            System.out.println("\nBuscando um elemento na lista pelo indice: ");
            System.out.println("Elemento na posicao 0: " + list.get(0));
            System.out.println("Elemento na posicao 1: " + list.get(1));
            System.out.println("Elemento na posicao 2: " + list.get(2));
            System.out.println("Elemento na posicao 3: " + list.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " - Indice nao encontrado.");
        }

        System.out.println("\nRemovendo um elemento da lista: ");
        list.remove(30);
        System.out.println(list.size());
        list.print();

        System.out.println("\nRealizando a limpeza da lista: ");
        list.clear();
        System.out.println("Tamanho da lista apos limpeza: " + list.size());
    }
}
