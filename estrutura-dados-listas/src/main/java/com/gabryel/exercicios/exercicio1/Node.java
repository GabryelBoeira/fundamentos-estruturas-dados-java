package com.gabryel.exercicios.exercicio1;

public class Node {
    Cliente cliente;
    Node proximo;

    public Node(Cliente cliente) {
        this.cliente = cliente;
        this.proximo = null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
