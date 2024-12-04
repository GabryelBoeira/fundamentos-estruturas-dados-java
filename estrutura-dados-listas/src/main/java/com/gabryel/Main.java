package com.gabryel;

import com.gabryel.recurso.LinkedList;
import com.gabryel.recurso.List;

public class Main {

    public static void main(String[] args) {
        //Lista encadeada personalizada
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);

        System.out.println(list.size());
    }
}
