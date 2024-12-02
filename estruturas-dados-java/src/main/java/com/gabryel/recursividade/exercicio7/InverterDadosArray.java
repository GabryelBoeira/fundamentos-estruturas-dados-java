package com.gabryel.recursividade.exercicio7;

import java.util.Arrays;

public class InverterDadosArray {

    public static void main(String[] args) {
        int[] valores = {1, 2, 3, -5, -6, -7, -8};
        int total = valores.length;

        System.out.println(Arrays.toString(inverterSequencia(valores, 0, total - 1)));
    }

    private static int[] inverterSequencia(int[] valores, int index, int total) {
        if (index >= total) return new int[0];

        int temp = valores[index];
        valores[index] = valores[total];
        valores[total] = temp;

        // Chama a função recursivamente para inverter os elementos do meio
        inverterSequencia(valores, index + 1, total - 1);
        return valores;
    }
}
