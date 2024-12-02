package com.gabryel.recursividade.exercicio1;

public class FibonacciPares {

    public static void main(String[] args) {
        int n = 10;
        int resultado = multiplicaParesFibonacci(n);
        System.out.println("A multiplicação dos elementos pares até o " + n + "º termo da sequência de Fibonacci é: " + resultado);
    }

    /**
     * Calcula o n-ésimo termo da sequência de Fibonacci.
     *
     * A sequência de Fibonacci é uma sequência de números naturais em que cada
     * termo é a soma dos dois termos anteriores, começando em 0 e 1.
     *
     * @param n o termo da sequência de Fibonacci a ser calculado
     * @return o n-ésimo termo da sequência de Fibonacci
     */
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

    /**
     * Calcula a multiplicação dos elementos pares da sequência de Fibonacci até o termo de ordem n.
     *
     * @param n o termo da sequência de Fibonacci a ser considerado
     * @return a multiplicação dos elementos pares da sequência de Fibonacci até o termo de ordem n
     */
    public static int multiplicaParesFibonacci(int n) {
        if (n <= 0) {
            return 1; // Caso base: multiplicação por 1
        } else {
            int fib = calcularFibonacci(n);
            return (fib % 2 == 0 ? fib : 1) * multiplicaParesFibonacci(n - 1);
        }
    }

}