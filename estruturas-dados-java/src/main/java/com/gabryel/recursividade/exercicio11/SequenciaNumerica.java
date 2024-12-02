package com.gabryel.recursividade.exercicio11;

public class SequenciaNumerica {

    public static void main(String[] args) {
        int numeroInicial = 5;
        int maximo = 2000;
        imprimirSequencia(numeroInicial,numeroInicial, maximo);
    }



    /**
     * Imprime uma sequência de números começando por `numeroInicial`, duplicando `numeroConstante` em cada passo,
     * até que `numeroConstante` exceda `maximo`. Na volta da recursão, imprime os números em ordem decrescente,
     * dividindo `numeroConstante` por 2, mas apenas se `numeroConstante` for menor ou igual a `numeroInicial`.
     *
     * @param numeroInicial o número inicial da sequência.
     * @param numeroConstante o número que será duplicado a cada passo da sequência.
     * @param maximo o valor máximo que `numeroConstante` pode atingir.
     */
    public static void imprimirSequencia(int numeroInicial, int numeroConstante, int maximo) {
        if (numeroConstante > maximo) return;

        System.out.print(numeroConstante + " ");
        imprimirSequencia(numeroInicial, numeroConstante * 2, maximo);

        if (numeroConstante > numeroInicial)
            System.out.print(numeroConstante/2 + " ");
    }

}
