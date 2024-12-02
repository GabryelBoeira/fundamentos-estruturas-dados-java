package com.gabryel.recursividade.exercicio14;

public class SomaSemAdicao {

    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("A soma de " + a + " e " + b + " é: " + soma(a, b));
    }

    /**
     * Calculates the sum of x and y without using the + operator.
     *
     * @param x the first number to be added
     * @param y the second number to be added
     * @return the sum of x and y
     */
    public static int soma(int x, int y) {
        if (y == 0)
            return x;
        return sucessor(soma(x, predecessor(y)));
    }

    /**
     * Calculates the successor of x.
     *
     * @param x the number which successor will be calculated
     * @return the successor of x
     */
    public static int sucessor(int x) {
        return x + 1;
    }

    /**
     * Calculates the predecessor of x.
     *
     * @param x the number which predecessor will be calculated
     * @return the predecessor of x
     */
    public static int predecessor(int x) {
        return x - 1;
    }

}
