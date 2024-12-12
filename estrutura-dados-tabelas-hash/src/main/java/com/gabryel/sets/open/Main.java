package com.gabryel.sets.open;

public class Main {

    public static void main(String[] args) {
        HashSetOpen<Integer> set = new HashSetOpen<>(10);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);

        System.out.println("size: " + set.size());
        System.out.println("Contains 1: " + set.contains(1));
        System.out.println("Contains 13: " + set.contains(13));
        System.out.println("\nremove 17: " + set.contains(17));
        System.out.println("remove 1: " + set.remove(1));
        System.out.println("Contains 1: " + set.contains(1));
        System.out.println("size: " + set.size());

        System.out.println("\nclear: ");
        set.clear();
        System.out.println("size after clear: " + set.size());
    }
}
