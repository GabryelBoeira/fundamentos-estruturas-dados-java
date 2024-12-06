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

        System.out.println(list.size());
        list.print();




        System.out.println("Realizando a limpeza da lista: ");
        list.clear();
        System.out.println("Tamanho da lista apos limpeza: " + list.size());
    }
}
