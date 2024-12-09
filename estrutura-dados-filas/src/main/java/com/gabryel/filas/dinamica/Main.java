package com.gabryel.filas.dinamica;

import com.gabryel.filas.Queue;

public class Main
{
    public static void main( String[] args ) {
        Queue<Integer> queue = new DinamicQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Tamanho da fila: " + queue.size());
        System.out.println();

        System.out.println("Remover elementos da fila: ");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("Tamanho da fila: " + queue.size());

        System.out.println("Pegar o primeiro elemento: " + queue.peek());

    }
}
