package com.gabryel.maps.open;

import com.gabryel.maps.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMapOpen<>(5);
        map.put(1, "Gabryel");
        map.put(2, "Tiago");
        map.put(3, "Eduardo");
        map.put(4, "Joao");
        map.put(5, "Jose");
        map.put(6, "Paulo");
        map.put(7, "Pedro");

        System.out.println("Total size: " + map.size());
        System.out.println("Contains Key 1: " + map.containsKey(1));
        System.out.println("Contains Value Gabryel: " + map.containsValue("Gabryel"));
        System.out.println("Remove Key 1: " + map.remove(1));
        System.out.println("Contains Key 1: " + map.containsKey(1));
        System.out.println("Total size: " + map.size());

    }
}
