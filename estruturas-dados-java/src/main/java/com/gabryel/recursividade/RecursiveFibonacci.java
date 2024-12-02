package com.gabryel.recursividade;

public class RecursiveFibonacci {

    /**
     * Calculates the nth Fibonacci number using recursion.
     *
     * @param n the position in the Fibonacci sequence to calculate
     * @return the Fibonacci number at the specified position (n)
     */
    public static int findFibonacci(int n) {
        try {
            if (n <= 1)
                return 1; // CAS0 BASE

            // PASSO RECURSIVO
            return findFibonacci(n-1) + findFibonacci(n-2);
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow error: Too big reported value to calculate");
            return 0;
        }
    }

    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13
        System.out.println("Fib(3)= " + findFibonacci(50));
    }
}
