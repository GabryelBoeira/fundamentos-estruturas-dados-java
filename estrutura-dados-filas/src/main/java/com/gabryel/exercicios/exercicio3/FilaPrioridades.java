package com.gabryel.exercicios.exercicio3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilaPrioridades {

    private Node inicio;

    /**
     * Adiciona um valor int na fila de prioridades.
     *
     * A fila de prioridades ordena os valores de forma decrescente.
     *
     * @param valor o valor a ser adicionado
     */
    public void adicionar(int valor) {
        Node novoNo = new Node(valor);

        if (inicio == null || valor > inicio.getValor()) {
            novoNo.setProximo(inicio);
            inicio = novoNo;
            return;
        }

        Node aux = inicio;
        while (aux.getProximo() != null && aux.getProximo().getValor() > valor) {
            aux = aux.getProximo();
        }
        novoNo.setProximo(aux.getProximo());
        aux.setProximo(novoNo);
    }

    /**
     * Remove e retorna o maior valor da fila de prioridades.
     *
     * Se a fila estiver vazia, lança uma RuntimeException.
     *
     * @return o maior valor da fila
     * @throws RuntimeException se a fila estiver vazia
     */
    public int removerMaior() {
        if (inicio == null) throw new RuntimeException("Fila vazia");

        int valor = inicio.getValor();
        inicio = inicio.getProximo();
        return valor;
    }

    /**
     * Verifica se um valor est  na fila de prioridades.
     *
     * @param valor o valor a ser pesquisado
     * @return true se o valor est  na fila, false caso contr rio
     */
    public boolean buscar(int valor) {
        Node aux = inicio;
        while (aux != null) {
            if (aux.getValor() == valor) return true;
            aux = aux.getProximo();
        }
        return false;
    }

    public void mostrarPorPrioridade() {
        Map<Integer, List<Integer>> grupos = new HashMap<>();

        Node aux = inicio;
        while (aux != null) {
            grupos.computeIfAbsent(aux.getValor(), k -> new ArrayList<>()).add(aux.getValor());
            aux = aux.getProximo();
        }

        for (Map.Entry<Integer, List<Integer>> entry : grupos.entrySet()) {
            System.out.println("Prioridade " + entry.getKey() + ": " + entry.getValue());
        }
    }

}
