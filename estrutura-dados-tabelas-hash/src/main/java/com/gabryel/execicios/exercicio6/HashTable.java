package com.gabryel.execicios.exercicio6;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashTable {
    private List<Integer>[] table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        int index = key % size;
        table[index].add(key);
    }

    public int countCollisions() {
        int collisions = 0;
        for (List<Integer> list : table) {
            if (list.size() > 1)
                collisions += list.size() - 1; // Cada elemento extra representa uma colisão
        }
        return collisions;
    }
}