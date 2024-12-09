package com.gabryel.exercicios.exercicio4;


import java.util.LinkedList;
import java.util.Queue;

public class FilaUtils {

    /**
     * Removes the first occurrence of the specified element from the queue.
     *
     * This method iterates through the given queue, transferring all elements
     * except the specified element to a temporary auxiliary queue. Afterward,
     * it copies the elements back to the original queue. If the specified element
     * is not found, the queue remains unchanged.
     *
     * @param fila the queue from which the element will be removed
     * @param elemento the element to remove from the queue
     * @param <T> the type of elements held in the queue
     */
    public static <T> void removerElemento(Queue<T> fila, T elemento) {
        Queue<T> filaAuxiliar = new LinkedList<>();

        while (!fila.isEmpty()) {
            T valor = fila.poll();
            if (!valor.equals(elemento))
                filaAuxiliar.add(valor);
        }
        fila.addAll(filaAuxiliar);
    }
}
