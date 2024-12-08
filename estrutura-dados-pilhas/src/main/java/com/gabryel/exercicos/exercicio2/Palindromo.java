package com.gabryel.exercicos.exercicio2;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Palindromo {

    public static void main(String[] args) {
        String[] palavras = {"ana", "madamimadam", "learn", "543753357345", "123", "1221"};

        for (String palavra : palavras) {
            System.out.println(palavra + ": " + isPalindromo(palavra));
        }
    }

    /**
     * Verifica se uma string e um palindromo.
     * Um palindromo e uma palavra, frase ou sequencia de caracteres que pode ser
     * lida igualmente da esquerda para a direita e da direita para a esquerda.
     *
     * @param str a string a ser verificada
     * @return true se a string for um palindromo, false caso contrario
     */
    public static boolean isPalindromo(String str) {
        Stack<Character> pilha = new Stack<>();
        Queue<Character> fila = new LinkedList<>();

        for (char c : str.toCharArray()) {
            pilha.push(c);
            fila.add(c);
        }

        while (!pilha.isEmpty()) {
            if (pilha.pop() != fila.remove())
                return false;
        }

        return true;
    }
}