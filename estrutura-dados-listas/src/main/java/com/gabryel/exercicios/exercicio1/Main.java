package com.gabryel.exercicios.exercicio1;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Minha Empresa");

        // Adicionando clientes
        empresa.adicionarCliente(new Cliente("João da Silva", "12345678901"));
        empresa.adicionarCliente(new Cliente("Maria Souza", "98765432109"));

        // Imprimindo todos os clientes
        empresa.imprimirClientes();

        // Verificando se um cliente existe
        boolean existe = empresa.contains("12345678901");
        System.out.println("O cliente existe? " + existe);

        // Contando o número de clientes
        int totalClientes = empresa.numeroDeClientes();
        System.out.println("Número de clientes: " + totalClientes);
    }
}