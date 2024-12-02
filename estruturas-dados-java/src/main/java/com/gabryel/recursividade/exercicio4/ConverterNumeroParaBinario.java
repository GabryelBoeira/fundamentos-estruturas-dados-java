package com.gabryel.recursividade.exercicio4;

public class ConverterNumeroParaBinario {

    public static void main(String[] args) {
        int num = 23;
        System.out.println("O equivalente binário de " + num + " é: " + converterParaBinario(num));
    }

    public static String converterParaBinario(int num) {
        if (num == 0) {
            return "";
        } else {
            return converterParaBinario(num / 2) + num % 2;
        }
    }
}
