package com.gabryel.generics;

public class Main {

    public static void main(String[] args) {

        GenericWrapper<String> stringWrapper = new GenericWrapper<>("Olá!");
        GenericWrapper<Integer> integerWrapper = new GenericWrapper<>(1);

        House house = new House("Write");

        GenericWrapper<House> houseWrapper = new GenericWrapper<>(house);
        integerWrapper.setElement(Integer.valueOf("50"));
        stringWrapper.setElement("Olá, mundo!");


        System.out.println(stringWrapper.getElement());
        System.out.println(integerWrapper.getElement());
        System.out.println(houseWrapper.getElement());
    }
}
