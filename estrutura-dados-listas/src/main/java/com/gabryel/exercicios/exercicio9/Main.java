package com.gabryel.exercicios.exercicio9;

public class Main {

    public static void main(String[] args) {
        ListaEncadeadaCircular lista1 = new ListaEncadeadaCircular();
        lista1.inserirInicio(3);
        lista1.inserirInicio(2);
        lista1.inserirInicio(1);

        ListaEncadeadaCircular lista2 = new ListaEncadeadaCircular();
        lista2.inserirInicio(4);
        lista2.inserirInicio(6);

        System.out.println("Concatenando a lista 1: ");
        lista1.concatenar(lista2);
        lista1.imprimir();

        ListaEncadeadaCircular lista3 = new ListaEncadeadaCircular();
        lista1.inserirInicio(3);
        lista1.inserirInicio(2);
        lista1.inserirInicio(1);

        ListaEncadeadaCircular lista4 = new ListaEncadeadaCircular();
        lista2.inserirInicio(4);
        lista2.inserirInicio(6);

        System.out.println("Intercalando as listas: ");
        lista3.intercalar(lista4);
        lista3.imprimir();

    }
}
