package com.gabryel.filas.estatica;

import com.gabryel.filas.Queue;

public class Main {

    public static void main( String[] args ) {
        Queue<Integer> queue = new StaticQueue<>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Tamanho da fila: " + queue.size());
        System.out.println();

        System.out.println("Remover elementos da fila: ");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("Tamanho da fila: " + queue.size());

        System.out.println("Pegar o primeiro elemento: " + queue.peek());
    }
}
