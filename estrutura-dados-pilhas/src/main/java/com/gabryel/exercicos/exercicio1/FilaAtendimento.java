package com.gabryel.exercicos.exercicio1;

public class FilaAtendimento {

    private Node inicio;
    private Node fim;
    private int ultimaSenha;


    public FilaAtendimento() {
        inicio = null;
        fim = null;
        ultimaSenha = (int) (Math.random() * 100); // Primeira senha aleatória
    }

    /**
     * Retira uma nova senha, incrementando a última senha gerada e adicionando-a à fila de atendimento.
     *
     * @param prioridade a prioridade da senha ('P' para prioritário, qualquer outro caractere para não prioritário)
     *                   Se a prioridade for 'P', a senha é adicionada no início da fila.
     *                   Caso contrário, a senha é adicionada no fim da fila.
     */
    public void retirarSenha(char prioridade) {
        ultimaSenha++;
        Node novoNo = new Node(ultimaSenha, prioridade);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else if (prioridade == 'P') {
            novoNo.setProximo(inicio);
            inicio = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }

    /**
     * Realiza o atendimento para a primeira senha na fila.
     *
     * Se a fila estiver vazia, imprime "Não há ninguém na fila.".
     * Caso contrário, imprime "Atendimento para a senha: XXX" e remove a
     * primeira senha da fila. Se a fila ficar vazia, o fim da fila é setado
     * para null.
     */
    public void realizarAtendimento() {
        if (inicio == null) System.out.println("Não há ninguém na fila.");

        if (inicio == null) fim = null;

        System.out.println("Atendimento para a senha: " + inicio.getSenha());
        inicio = inicio.getProximo();
    }

    /**
     * Verifica se uma determinada senha existe na fila de atendimento.
     *
     * @param senha a senha a ser procurada na fila
     * @return true se a senha existe na fila, false caso contrário
     */
    public boolean procurarSenha(int senha) {
        Node aux = inicio;
        while (aux != null) {
            if (aux.getSenha() == senha)
                return true;
            aux = aux.getProximo();
        }
        return false;
    }

    /**
     * Imprime todas as senhas na fila, cada uma com sua prioridade em par nteses,
     * separadas por espa o e terminando com um caractere de quebra de linha.
     * <p>
     * Se a fila estiver vazia, n o imprime nada.
     */
    public void imprimirFila() {
        Node aux = inicio;
        while (aux != null) {
            System.out.print(aux.getSenha() + "(" + aux.getPrioridade() + ") ");
            aux = aux.getProximo();
        }
        System.out.println();
    }

    /**
     * Remove a senha especificada da fila de atendimento.
     *
     * Se a fila estiver vazia, imprime "A fila está vazia.".
     * Se a senha estiver no início da fila, remove-a e ajusta o ponteiro de início.
     * Se a senha não for encontrada na fila, imprime "Senha não encontrada.".
     *
     * @param senha a senha a ser removida da fila
     */
    public void removerSenha(int senha) {
        if (inicio == null) {
            System.out.println("A fila está vazia.");
            return;
        }

        if (inicio.getSenha() == senha) {
            inicio = inicio.getProximo();
            if (inicio == null)
                fim = null;
            return;
        }

        Node aux = inicio;
        while (aux.getProximo() != null && aux.getProximo().getSenha() != senha) {
            aux = aux.getProximo();
        }

        if (aux.getProximo() != null) {
            aux.setProximo(aux.getProximo().getProximo());
            if (aux.getProximo() == null)
                fim = aux;
        } else {
            System.out.println("Senha não encontrada.");
        }
    }

}
