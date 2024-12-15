package com.gabryel.maps.close;

import com.gabryel.maps.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMapClose<>();
        hashMap.put(1,"Tony Stark");
        hashMap.put(2,"Steve Rogers");
        hashMap.put(3,"Bruce Banner");
        hashMap.put(4,"Natasha Romanoff");
        hashMap.put(5,"Thor");
        hashMap.put(6, "Lanterna Verde");
        hashMap.put(7, "Batman");
        hashMap.put(8, "Mulher Maravilha");
        hashMap.put(9, "Mulher Gato");
        hashMap.put(10, "Flash");

        System.out.println("Total size: " + hashMap.size());
        System.out.println("get(\"Thor\"): " + hashMap.get(5));

        System.out.println("\nContains value Thor : " + hashMap.containsValue("Thor"));
        System.out.println("Contains Key \"5\": " + hashMap.containsKey(5));
        System.out.println("Remove Key \"Thor\" 5: " + hashMap.remove(5));
        System.out.println("Contains Key \"Thor\" 5: " + hashMap.containsKey(5));
        System.out.println("Total size: " + hashMap.size());
    }
}
