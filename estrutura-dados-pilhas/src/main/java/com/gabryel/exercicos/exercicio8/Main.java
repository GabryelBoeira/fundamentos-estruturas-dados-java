package com.gabryel.exercicos.exercicio8;

public class Main {

    public static void main(String[] args) {
        FilaDecolagem fila = new FilaDecolagem();

        Aviao aviao1 = new Aviao("GOL123", "Boeing 737", "São Paulo");
        fila.adicionarAviao(aviao1);

        Aviao aviao2 = new Aviao("LATAM456", "Airbus A320", "Rio de Janeiro");
        fila.adicionarAviao(aviao2);

        Aviao aviao3 = new Aviao("AZUL789", "Boeing 747", "Salvador");
        fila.adicionarAviao(aviao3);

        // Operações
        fila.listarAvioes();
        fila.autorizarDecolagem();
        System.out.println("Tamanho da fila: " + fila.tamanhoFila());
        fila.mostrarProximo();
    }
}
