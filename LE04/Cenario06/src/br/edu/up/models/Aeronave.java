package br.edu.up.models;

public class Aeronave {
    private String codigo;
    private String tipo;
    private int quantidadeAssentos;

    public Aeronave(String codigo, String tipo, int quantidadeAssentos) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.quantidadeAssentos = quantidadeAssentos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidadeAssentos() {
        return quantidadeAssentos;
    }
}
