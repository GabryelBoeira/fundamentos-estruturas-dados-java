package com.gabryel.recursividade.execicio2;

public class TrianguloDePascal {

    public static void main(String[] args) {
        int numLinhas = 10;
        imprimirTriangulo(numLinhas);
    }

    /**
     * Retorna o valor na n-ésima linha e m-ésima coluna do Triângulo de Pascal.
     *
     * @param n a linha do Triângulo de Pascal a ser considerada
     * @param m a coluna do Triângulo de Pascal a ser considerada
     * @return o valor na n-ésima linha e m-ésima coluna do Triângulo de Pascal
     */
    public static int pascal(int n, int m) {
        // Verifica os casos base
        if (n == 1 || m == 1 || n == m) {
            return 1;
        } else {
            // Caso recursivo
            return pascal(n - 1, m - 1) + pascal(n - 1, m);
        }
    }

    /**
     * Imprime o Triângulo de Pascal com n linhas.
     *
     * @param n o número de linhas do Triângulo de Pascal a ser impresso
     */
    public static void imprimirTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }
}
