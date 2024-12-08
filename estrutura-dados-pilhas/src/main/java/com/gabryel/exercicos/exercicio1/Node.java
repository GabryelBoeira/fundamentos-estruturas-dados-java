package com.gabryel.exercicos.exercicio1;

public class Node {

    private int senha;
    private char prioridade;
    private Node proximo;

    public Node(int senha, char prioridade) {
        this.senha = senha;
        this.prioridade = prioridade;
        this.proximo = null;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public char getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(char prioridade) {
        this.prioridade = prioridade;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
