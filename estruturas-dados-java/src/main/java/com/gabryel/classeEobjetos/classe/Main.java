package com.gabryel.classeEobjetos.classe;

import com.gabryel.classeEobjetos.objeto.Dog;

public class Main {

    public static void main(String[] args) {
        Dog caramelo1 = new Dog("Não Definida", 2, "Caramelo");
        Dog caramelo2 = new Dog("Não Definida", 3, "Caramelo");
        Dog caramelo3 = caramelo1;

        System.out.println(caramelo1);
        System.out.println(caramelo2);
        System.out.println(caramelo3);
        System.out.println(caramelo1.equals(caramelo2));
        System.out.println(caramelo1.equals(caramelo3));

    }
}
