package com.gabryel.recursividade.exercicio1;

public class SomaPrimos {

    public static void main(String[] args) {
        int inicio = 10, fim = 20;
        int soma = somarPrimosRecursiva(inicio, fim);
        System.out.println("A soma dos primos entre " + inicio + " e " + fim + " é: " + soma);
    }

    /**
     * Verifica se um número é primo utilizando recursão.
     *
     * Um número é considerado primo se for maior que 1 e não divisível
     * por nenhum número, exceto 1 e ele mesmo. Esta função utiliza um
     * divisor inicial para testar a divisibilidade do número.
     *
     * @param num o número a ser verificado
     * @param divisor o divisor atual para testar a divisibilidade
     * @return true se o número for primo, false caso contrário
     */
    public static boolean isPrimo(int num, int divisor) {
        // Caso base: se o divisor já ultrapassou a raiz quadrada, o número é primo
        if (divisor * divisor > num) {
            return true;
        }
        // Caso base: se o número é divisível pelo divisor, não é primo
        if (num % divisor == 0) {
            return false;
        }
        // Caso recursivo: verifica para o próximo divisor
        return isPrimo(num, divisor + 1);
    }

    /**
     * Verifica se um número é primo.
     *
     * @param num o número a ser verificado
     * @return true se o número for primo, false caso contrário
     */
    public static boolean isPrimo(int num) {
        // Chamada inicial da função recursiva com divisor 2
        return isPrimo(num, 2);
    }

    /**
     * Calcula a soma de todos os primos entre inicio e fim de forma recursiva.
     *
     * @param inicio o menor valor a ser considerado na soma
     * @param fim o maior valor a ser considerado na soma
     * @return a soma de todos os primos entre inicio e fim
     */
    public static int somarPrimosRecursiva(int inicio, int fim) {
        if (inicio > fim) {
            return 0;
        } else {
            return (isPrimo(inicio) ? inicio : 0) + somarPrimosRecursiva(inicio + 1, fim);
        }
    }


}
