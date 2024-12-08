package com.gabryel.pilha.dinamica;

import com.gabryel.pilha.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new StackImpl<>();
        stack.push(1);
        stack.push(2);
        stack.push(35);
        stack.push(3);

        System.out.println("Push 30: " + stack.push(30));
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        System.out.println("Procurando index do elemento 1 : " + stack.search(3));
        System.out.println("Procurando index do elemento 2 : " + stack.search(1));

    }
}
