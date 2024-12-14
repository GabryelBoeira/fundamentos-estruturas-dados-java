package com.gabryel.maps.close;

import com.gabryel.maps.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMapClose<>();
        hashMap.put("Gabryel", 1);
        System.out.println(hashMap.get("Gabryel"));
    }
}
