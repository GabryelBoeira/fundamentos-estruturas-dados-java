package com.gabryel.recursividade.exercicio6;

public class ProgressaoAritmetica {

    public static void main(String[] args) {
        int numTermos = 8;
        double primeiroTermo = 0.8;
        double razao = 0.58;

        System.out.println(termosPA(numTermos, primeiroTermo, razao));
    }

    /**
     * Retorna uma string com a progress o aritmetica com n termos, tendo o primeiro
     * termo igual a <code>atual</code> e a raz o igual a <code>razao</code>.
     *
     * @param termos o n mero de termos a serem impressos
     * @param atual o valor atual da progress o aritmetica
     * @param razao a raz o da progress o aritmetica
     * @return uma string com a progress o aritmetica com n termos
     */
    public static String termosPA(int termos, double atual, double razao) {
        // Caso base: se só há um termo, retorna o valor atual como string
        if (termos == 1) return Double.toString(atual);

        // Calcula o próximo termo
        double proximoTermo = atual + razao;
        // Chama recursivamente para os demais termos e concatena o resultado
        return atual + " >> " + termosPA(termos - 1, proximoTermo, razao);
    }
}
