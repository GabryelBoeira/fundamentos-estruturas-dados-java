package com.gabryel.recursividade.exercicio3;

public class CalculaPotencia {

    public static void main(String[] args) {
        int base = 2;
        int expoente = 10;
        int resultado = calcularPotencia(base, expoente);
        System.out.println("A potência de " + base + " elevado a " + expoente + " é: " + resultado);
    }

    public static int calcularPotencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, expoente - 1);
        }
    }
}
