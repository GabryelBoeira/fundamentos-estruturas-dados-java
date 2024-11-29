package com.gabryel.wrappers;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {

    public static void main(String[] args) {

        List<Integer> prices = new ArrayList<>();

        int age = 5;
        Integer ageWrapper = age;
        System.out.println("Variável primitiva: " + age);
        System.out.println("Variável wrapper: " + ageWrapper);

        byte studentClasses = 0;
        Byte studentClassesWrapper = Byte.valueOf("2");

        System.out.println("\nStudent Classes primitiva: " + studentClasses);
        System.out.println("Student Classes Wrapper: " + studentClassesWrapper);

        System.out.println("\nComparação entre inteiros (-1): " + ageWrapper.compareTo(6));
        System.out.println("Comparação entre inteiros (0): " + ageWrapper.compareTo(Integer.valueOf("5")));
        System.out.println("Comparação entre inteiros (1): " + ageWrapper.compareTo(4));

    }
}
