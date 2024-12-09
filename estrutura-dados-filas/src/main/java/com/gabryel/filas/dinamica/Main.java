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

        System.out.println(queue.size());

    }
}
