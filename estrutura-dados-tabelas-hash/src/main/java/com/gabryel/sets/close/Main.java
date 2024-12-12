package com.gabryel.sets.close;

public class Main {
    public static void main(String[] args) {
        HashSetClose<Integer> hashSet = new HashSetClose<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        hashSet.add(60);
        hashSet.add(70);
        hashSet.add(80);
        hashSet.add(90);
        hashSet.add(100);
        hashSet.add(110);

        System.out.println("size: " + hashSet.size());
        System.out.println("Contains 10: " + hashSet.contains(10));
        System.out.println("Contains 13: " + hashSet.contains(13));
        System.out.println("\nremove 17: " + hashSet.contains(17));
        System.out.println("remove 10: " + hashSet.remove(10));
        System.out.println("Contains 10: " + hashSet.contains(10));
        System.out.println("size: " + hashSet.size());

        System.out.println("\nclear: ");
        hashSet.clear();
        System.out.println("size after clear: " + hashSet.size());
    }
}
