package com.gabryel.recursividade.exercicio12;

public class VerificaLetras {

    public static void main(String[] args) {
        String str1 = "o";
        String str2 = "australia";

        if (todasLetrasContidas(str1, str2))
            System.out.println("Todas as letras de " + str1 + " estão em " + str2);
        else
            System.out.println("Nem todas as letras de " + str1 + " estão em " + str2);
    }

    /**
     * Verifica se todas as letras de uma string est o contidas em outra.
     *
     * @param str1 a string que tem as letras a serem verificadas
     * @param str2 a string que pode conter as letras de str1
     * @return true se todas as letras de str1 est o em str2, false caso contr rio
     */
    public static boolean todasLetrasContidas(String str1, String str2) {
        if (str1.isEmpty())
            return true;

        if (str2.indexOf(str1.charAt(0)) == -1)
            return false;

        return todasLetrasContidas(str1.substring(1), str2);
    }

}
