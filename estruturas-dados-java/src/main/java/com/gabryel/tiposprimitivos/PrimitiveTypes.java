package com.gabryel.tiposprimitivos;

public class PrimitiveTypes {

    public static void main(String[] args) {

        // Lógicos
        boolean isStudent = true;

        // Literais
        char letter = 'Z';

        // Inteiros
        byte mathGrade = 127;
        short numberOfClasses = 25 + 50;
        int studentAge = 20 * 10;
        long dollars = 1000L;

        // Reais
        float moneyAmount = 1.50f;
        double bookPrice = 199.0;

        System.out.println("Lógico: ");
        System.out.println("\tboolean: " + (isStudent && letter == 'Z'));
        System.out.println("\nInteiros: ");
        System.out.println("\tchar: " + letter);
        System.out.println("\tbyte: " + mathGrade);
        System.out.println("\tshort: " + numberOfClasses);
        System.out.println("\tint: " + studentAge);
        System.out.println("\tlong: " + dollars);
        System.out.println("\nReais: ");
        System.out.println("\tfloat: " + moneyAmount);
        System.out.println("\tdouble: " + bookPrice);
    }
}
