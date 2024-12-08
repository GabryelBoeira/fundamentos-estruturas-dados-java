package com.gabryel.exercicos.exercicio1;

public class Main {

    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();
        fila.retirarSenha('P');
        fila.retirarSenha('N');
        fila.retirarSenha('P');
        fila.imprimirFila();
        fila.realizarAtendimento();
        fila.imprimirFila();
    }
}
