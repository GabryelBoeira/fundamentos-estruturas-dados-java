package com.gabryel.pilha.estatica;

import com.gabryel.pilha.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new StaticStack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pee(): " + stack.peek());
        System.out.println("isEmpty(): " + stack.isEmpty());
        System.out.println("getIndex in search(1): " + stack.search(1));
    }
}
