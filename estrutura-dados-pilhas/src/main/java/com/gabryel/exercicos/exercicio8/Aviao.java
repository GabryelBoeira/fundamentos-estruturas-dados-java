package com.gabryel.exercicos.exercicio8;

public class Aviao {

    private String identificacao;
    private String tipo;
    private String destino;

    public Aviao() {}

    public Aviao(String identificacao, String tipo, String destino) {
        this.identificacao = identificacao;
        this.tipo = tipo;
        this.destino = destino;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Identificação: " + identificacao + ", Tipo: " + tipo + ", Destino: " + destino;
    }
}
