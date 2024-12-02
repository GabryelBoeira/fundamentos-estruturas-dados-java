package com.gabryel.recursividade.exercicio10;

public class CalcularNumeroPrimo {
    public static void main(String[] args) {
        int numero = 17;

        if (isPrimo(numero, 2))
            System.out.println(numero + " é um número primo.");
        else
            System.out.println(numero + " não é um número primo.");
    }

    public static boolean isPrimo(int num, int divisor) {
        if (divisor * divisor > num)
            return true;

        if (num % divisor == 0)
            return false;

        return isPrimo(num, divisor + 1);
    }

}
