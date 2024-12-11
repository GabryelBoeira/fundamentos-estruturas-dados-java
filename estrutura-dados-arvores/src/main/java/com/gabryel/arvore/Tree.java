package com.gabryel.arvore;

import java.util.List;

public interface Tree <T extends Comparable<T>> {

    /**
     * Adiciona um novo elemento na arvore.
     *
     * @param element Elemento a ser adicionado
     */
    void add(T element);

    /**
     * Verifica se a arvore esta vazia.
     *
     * @return true se a arvore estiver vazia, false caso contrario
     */
    boolean isEmpty();

    /**
     * Retorna a altura da arvore.
     *
     * @return a altura da arvore
     */
    int getTreeHeight();

    /**
     * Retorna a profundidade de um nó específico na árvore.
     *
     * @param element O elemento do qual a profundidade será calculada
     * @return a profundidade do nó se o elemento for encontrado, -1 caso contrário
     */
    int nodeDepth(T element);

    /**
     * Busca um elemento na árvore.
     *
     * @param element Elemento a ser buscado
     * @return o nó que contém o elemento se o elemento for encontrado, null caso contrário
     */
    TreeNode<T> search(T element);

    /**
     * Retorna uma lista com todos os elementos da arvore, ordenados em
     * pré-ordem. A pré-ordem é a seguinte: raiz, esquerda, direita.
     *
     * @return uma lista com todos os elementos da arvore, ordenados em pré-ordem
     */
    List<T> preOrder();

    /**
     * Retorna uma lista com todos os elementos da arvore, ordenados em
     * ordem simetrica. A ordem simetrica é a seguinte: esquerda, raiz, direita.
     *
     * @return uma lista com todos os elementos da arvore, ordenados em ordem simetrica
     */
    List<T> inOrder();

    /**
     * Retorna uma lista com todos os elementos da arvore, ordenados em
     * pós-ordem. A pós-ordem é a seguinte: esquerda, direita, raiz.
     *
     * @return uma lista com todos os elementos da arvore, ordenados em pós-ordem
     */
    List<T> postOrder();

}
