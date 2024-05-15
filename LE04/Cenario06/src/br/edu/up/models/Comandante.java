package br.edu.up.models;

public class Comandante extends Tripulacao {
    private int totalHorasVoo;

    public Comandante(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, int totalHorasVoo) {
        super(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        this.totalHorasVoo = totalHorasVoo;
    }

    public int getTotalHorasVoo() {
        return totalHorasVoo;
    }
}
