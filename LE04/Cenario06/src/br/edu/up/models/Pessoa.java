package br.edu.up.models;

public class Pessoa {
    private String nome;
    private String rg;

    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }
}
