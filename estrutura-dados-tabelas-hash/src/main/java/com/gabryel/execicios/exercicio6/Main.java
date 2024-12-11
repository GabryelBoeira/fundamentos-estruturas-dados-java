package com.gabryel.execicios.exercicio6;

public class Main {

    public static void main(String[] args) {
        int[] keys = {1, 5, 18, 20, 4, 12, 10, 34, 15, 28, 17};
        HashTable hashTable = new HashTable(11);

        for (int key : keys) {
            hashTable.add(key);
        }

        int totalCollisions = hashTable.countCollisions();
        System.out.println("Total de colisões: " + totalCollisions);
    }
}
