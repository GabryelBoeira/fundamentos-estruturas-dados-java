package com.gabryel.recursividade.exercicio13;

public class hiperfatorial {

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("O hiperfatorial de " + numero + " é: " + calcularHiperfatorial(numero));
    }

    /**
     * Calcula o hiperfatorial de um n mero inteiro positivo n.
     * @see <a href="https://en.wikipedia.org/wiki/Hyperfactorial">Hiperfatorial</a>
     *
     * @param n o n mero inteiro positivo para o qual deve ser calculado o
     *          hiperfatorial
     * @return o hiperfatorial de n
     */
    public static long calcularHiperfatorial(int n) {
        if (n == 1)
            return 1;
        else
            return (long) Math.pow(n, n) * calcularHiperfatorial(n - 1);
    }
}
