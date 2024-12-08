package com.gabryel.exercicos.exercicio3;

public class Main {
    public static void main(String[] args) {
        FilaPrioridades fila = new FilaPrioridades();
        fila.adicionar(5);
        fila.adicionar(3);
        fila.adicionar(8);
        fila.adicionar(3);

        fila.mostrarPorPrioridade();
    }
}
