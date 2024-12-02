package com.gabryel.recursividade.exercicio9;

public class ContadorDigitos {

    public static void main(String[] args) {
        Long numero = 1234523424564234425L;
        int digito = 2;
        int ocorrencias = contarOcorrencias(numero, digito);

        System.out.println("O dígito " + digito + " aparece " + ocorrencias + " vezes em " + numero);
    }

    public static int contarOcorrencias(Long n, int k) {
        // Caso base: se n < 10, verifica se o último dígito é igual a k
        if (n < 10) return n == k ? 1 : 0;

        // Verifica se o último dígito é igual a k
        long ultimoDigito = n % 10;
        int contador = (ultimoDigito == k) ? 1 : 0;
        // Chama recursivamente para a parte inteira de n/10
        return contador + contarOcorrencias(n / 10, k);
    }
}
