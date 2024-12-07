package com.gabryel.exercicios.exercicio7;


public class Main {

    public static void main(String[] args) {
        ListaLigada lista1 = new ListaLigada();
        lista1.adicionar(1);
        lista1.adicionar(3);
        lista1.adicionar(5);

        ListaLigada lista2 = new ListaLigada();
        lista2.adicionar(2);
        lista2.adicionar(4);
        lista2.adicionar(6);

        ListaLigada listaMesclada = ListaLigada.mesclarEmOrdem(lista1, lista2);
        System.out.println("Lista mesclada: ");
        listaMesclada.imprimir();
        System.out.println("Lista mesclada: ");

        boolean saoIguais1 = ListaLigada.saoIguais(lista1, lista2);
        System.out.println("\nSão iguais: " + saoIguais1);

        boolean saoIguais2 = ListaLigada.saoIguais(lista1, lista1);
        System.out.println("São iguais: " + saoIguais2);
    }

}
