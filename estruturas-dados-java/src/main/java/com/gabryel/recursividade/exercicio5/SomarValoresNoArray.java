package com.gabryel.recursividade.exercicio5;

public class SomarValoresNoArray {

    public static void main(String[] args) {
        Long[] array = {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L};
        System.out.println("A soma dos elementos do array é: " + somarValoresNoArray(array, 0));
    }

    /**
     * Soma os valores de um array de longs de forma recursiva.
     *
     * @param array o array de longs a ser somado
     * @param index o index do elemento a ser somado
     * @return a soma dos elementos do array
     */
    public static long somarValoresNoArray(Long[] array, int index) {
        if (index == array.length) {
            return 0;
        } else {
            return array[index] + somarValoresNoArray(array, index + 1);
        }
    }
}
