package com.gabryel.exercicios.exercicio8;

import com.gabryel.exercicos.exercicio8.Aviao;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDecolagem {

    private Queue<Aviao> fila = new LinkedList<>();

    /**
     * Adiciona um avião à fila de decolagem.
     *
     * @param aviao o avião a ser adicionado à fila
     */
    public void adicionarAviao(Aviao aviao) {
        fila.add(aviao);
    }

    /**
     * Autoriza a decolagem do próximo avião na fila.
     * <p>
     * Se a fila estiver vazia, imprime "Não há aviões na fila.".
     * Caso contrário, remove o próximo avião da fila e imprime "Autorizada a decolagem do avião: <identificacao>".
     */
    public void autorizarDecolagem() {
        if (fila.isEmpty()) {
            System.out.println("Não há aviões na fila.");
        } else {
            Aviao aviao = fila.poll();
            System.out.println("Autorizada a decolagem do avião: " + aviao.getIdentificacao());
        }
    }

    /**
     * Retorna o tamanho da fila de decolagem.
     *
     * @return o tamanho da fila
     */
    public int tamanhoFila() {
        return fila.size();
    }

    /**
     * Lista todos os aviões na fila de decolagem.
     * <p>
     * Se a fila estiver vazia, imprime "Não há aviões na fila.".
     * Caso contrário, imprime a representação de cada avião presente na fila.
     */
    public void listarAvioes() {
        if (fila.isEmpty()) {
            System.out.println("Não há aviões na fila.");
            return;
        }

        for (Aviao aviao : fila) {
            System.out.println(aviao);
        }
    }

    /**
     * Exibe o próximo avião na fila de decolagem sem removê-lo.
     * <p>
     * Se a fila estiver vazia, imprime "Não há aviões na fila.".
     * Caso contrário, imprime "Próximo avião a decolar:" seguido da representação do avião.
     */
    public void mostrarProximo() {
        if (fila.isEmpty()) {
            System.out.println("Não há aviões na fila.");
        } else {
            Aviao aviao = fila.peek();
            System.out.println("Próximo avião a decolar:");
            System.out.println(aviao);
        }
    }
}