package com.gabryel.recursividade;

public class RecursiveFibonacci {

    /**
     * The RecursiveFibonacci class provides a method to calculate the nth Fibonacci number
     * using a recursive approach. The Fibonacci sequence is characterized by the fact that
     * every number after the first two is the sum of the two preceding ones.
     */
    public static int findFibonacci(int n){
        if (n <= 1)
            return 1; // CAS0 BASE

        // PASSO RECURSIVO
        return findFibonacci(n-1) + findFibonacci(n-2);
    }

    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13
        System.out.println("Fib(3)= " + findFibonacci(100));
    }
}
