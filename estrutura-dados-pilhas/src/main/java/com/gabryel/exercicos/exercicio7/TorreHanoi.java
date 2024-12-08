package com.gabryel.exercicos.exercicio7;


import java.util.Stack;

public class TorreHanoi {

    public static void main(String[] args) {
        int n = 3; // Número de discos
        Stack<Integer> origem = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();
        Stack<Integer> destino = new Stack<>();

        // Inicializando a pilha de origem
        for (int i = n; i > 0; i--) {
            origem.push(i);
        }

        hanoi(n, origem, auxiliar, destino);
    }

    /**
     * Implementa o problema da torre de Hanoi.
     *
     * O problema da torre de Hanoi  e um classico problema de
     * programacao, que consiste em mover n discos de uma pilha
     * para outra, seguindo regras especiais.
     *
     * @param n numero de discos
     * @param origem pilha de origem
     * @param auxiliar pilha auxiliar
     * @param destino pilha de destino
     */
    public static void hanoi(int n, Stack<Integer> origem, Stack<Integer> auxiliar, Stack<Integer> destino) {
        if (n == 1) {
            destino.push(origem.pop());
            System.out.println("Movendo disco 1 de " + origem + " para " + destino);
        } else {
            hanoi(n - 1, origem, destino, auxiliar);
            destino.push(origem.pop());
            System.out.println("Movendo disco " + n + " de " + origem + " para " + destino);
            hanoi(n - 1, auxiliar, origem, destino);
        }
    }

}
