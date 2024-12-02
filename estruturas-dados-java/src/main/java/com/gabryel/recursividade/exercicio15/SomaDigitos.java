package com.gabryel.recursividade.exercicio15;

public class SomaDigitos {

    public static void main(String[] args) {
        int numero = 1234564585;
        System.out.println("A soma dos dígitos de " + numero + " é: " + somarDigitos(numero));
    }

    /**
     * Calculates the sum of the digits of a given integer recursively.
     *
     * @param n the integer whose digits are to be summed
     * @return the sum of the digits of the integer
     */
    public static int somarDigitos(int n) {
        if (n < 10) return n;

        return n % 10 + somarDigitos(n / 10);
    }
}
