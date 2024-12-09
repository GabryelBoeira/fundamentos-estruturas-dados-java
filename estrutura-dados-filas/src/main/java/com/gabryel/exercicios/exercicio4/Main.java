package com.gabryel.exercicios.exercicio4;

import java.util.LinkedList;
import java.util.Queue;

import static com.gabryel.exercicios.exercicio4.FilaUtils.removerElemento;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> minhaFila = new LinkedList<>();
        minhaFila.add(1);
        minhaFila.add(2);
        minhaFila.add(3);

        removerElemento(minhaFila, 2);

        System.out.println(minhaFila);
    }
}
