package com.gabryel.pilha.dinamica;

import com.gabryel.pilha.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new StackImpl<>();
        stack.push(1);
        stack.push(2);
        stack.push(30);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

    }
}
