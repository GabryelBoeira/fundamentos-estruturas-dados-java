package com.gabryel.exercicios.exercicio1;

public class Empresa {

    String nome;
    Node clienteNo;

    public Empresa(String nome) {
        this.nome = nome;
        this.clienteNo = null;
    }

    /**
     * Adiciona um novo cliente ao final da lista de clientes da empresa.
     *
     * @param cliente o cliente a ser adicionado
     */
    public void adicionarCliente(Cliente cliente) {
        Node novoNo = new Node(cliente);
        if (cliente == null)
            clienteNo = novoNo;
        else {
            Node aux = clienteNo;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novoNo;
        }
    }

    /**
     * Imprime todos os clientes da lista de clientes da empresa, um por linha.
     *
     * Cada linha tem o formato "Nome: <nome>, CPF: <cpf>".
     */
    public void imprimirClientes() {
        Node aux = clienteNo;
        while (aux != null) {
            System.out.println("Nome: " + aux.cliente.getNome() + ", CPF: " + aux.cliente.getCpf());
            aux = aux.proximo;
        }
    }

    /**
     * Verifica se a lista de clientes da empresa cont m um cliente com o CPF
     * especificado.
     *
     * @param cpf o CPF do cliente a ser verificado
     * @return true se o cliente estiver na lista, false caso contr rio
     */
    public boolean contains(String cpf) {
        Node aux = clienteNo;
        while (aux != null) {
            if (aux.cliente.getCpf().equals(cpf))
                return true;
            aux = aux.proximo;
        }
        return false;
    }

    /**
     * Retorna o n mero de clientes na lista de clientes da empresa.
     *
     * @return o n mero de clientes
     */
    public int numeroDeClientes() {
        int contador = 0;
        Node aux = clienteNo;
        while (aux != null) {
            contador++;
            aux = aux.proximo;
        }
        return contador;
    }

}
